
package currencyconverter;

/**
 *
 * @author Abdullah
 */

import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Abdullah
 */
public class Connector {

    private static HttpURLConnection connection;
    static String data;
    static JFrame temp;

    Connector() {
        initCon();
    }

    public static void initCon() {

        StringBuffer responceContent = new StringBuffer();
        try {
            BufferedReader reader;
            String line;

            URL url = new URL("write your api key here - you can get one free from fixir:)");

            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();

            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine()) != null) {
                    responceContent.append(line);
                }
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    responceContent.append(line);
                }
                reader.close();
            }

        } catch (MalformedURLException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            temp = new JFrame();
            temp.setLayout(null);

            JLabel label = new JLabel(new ImageIcon(new ImageIcon("src.\\res\\ere.gif").getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT)));
            label.setBounds(0, 0, 600, 400);
            temp.add(label);
            temp.setSize(600, 400);
            temp.setLocationRelativeTo(null);
            temp.setVisible(true);
            temp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // JOptionPane.showMessageDialog(null, "No internet connection :(", "connection fail", JOptionPane.ERROR_MESSAGE);
            // Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connection.disconnect();
        }

        data = responceContent.toString();
    }

}
