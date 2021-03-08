
package currencyconverter;

/**
 *
 * @author Abdullah
 */

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Abdullah
 */
public class GUI {
    
    JFrame fr;
    JLabel toLabel;
    JTextField givenCurrencyField, resultField;
    JComboBox baseCombo, targetCombo;
    JButton calculate;
    String names[] = {
        "AED",
        "AFN",
        "ALL",
        "AMD",
        "ANG",
        "AOA",
        "ARS",
        "AUD",
        "AWG",
        "AZN",
        "BAM",
        "BBD",
        "BDT",
        "BGN",
        "BHD",
        "BIF",
        "BMD",
        "BND",
        "BOB",
        "BRL",
        "BSD",
        "BTC",
        "BTN",
        "BWP",
        "BYN",
        "BYR",
        "BZD",
        "CAD",
        "CDF",
        "CHF",
        "CLF",
        "CLP",
        "CNY",
        "COP",
        "CRC",
        "CUC",
        "CUP",
        "CVE",
        "CZK",
        "DJF",
        "DKK",
        "DOP",
        "DZD",
        "EGP",
        "ERN",
        "ETB",
        "EUR",
        "FJD",
        "FKP",
        "GBP",
        "GEL",
        "GGP",
        "GHS",
        "GIP",
        "GMD",
        "GNF",
        "GTQ",
        "GYD",
        "HKD",
        "HNL",
        "HRK",
        "HTG",
        "HUF",
        "IDR",
        "ILS",
        "IMP",
        "INR",
        "IQD",
        "IRR",
        "ISK",
        "JEP",
        "JMD",
        "JOD",
        "JPY",
        "KES",
        "KGS",
        "KHR",
        "KMF",
        "KPW",
        "KRW",
        "KWD",
        "KYD",
        "KZT",
        "LAK",
        "LBP",
        "LKR",
        "LRD",
        "LSL",
        "LTL",
        "LVL",
        "LYD",
        "MAD",
        "MDL",
        "MGA",
        "MKD",
        "MMK",
        "MNT",
        "MOP",
        "MRO",
        "MUR",
        "MVR",
        "MWK",
        "MXN",
        "MYR",
        "MZN",
        "NAD",
        "NGN",
        "NIO",
        "NOK",
        "NPR",
        "NZD",
        "OMR",
        "PAB",
        "PEN",
        "PGK",
        "PHP",
        "PKR",
        "PLN",
        "PYG",
        "QAR",
        "RON",
        "RSD",
        "RUB",
        "RWF",
        "SAR",
        "SBD",
        "SCR",
        "SDG",
        "SEK",
        "SGD",
        "SHP",
        "SLL",
        "SOS",
        "SRD",
        "STD",
        "SVC",
        "SYP",
        "SZL",
        "THB",
        "TJS",
        "TMT",
        "TND",
        "TOP",
        "TRY",
        "TTD",
        "TWD",
        "TZS",
        "UAH",
        "UGX",
        "USD",
        "UYU",
        "UZS",
        "VEF",
        "VND",
        "VUV",
        "WST",
        "XAF",
        "XAG",
        "XAU",
        "XCD",
        "XDR",
        "XOF",
        "XPF",
        "YER",
        "ZAR",
        "ZMK",
        "ZMW",
        "ZWL"
    };
    
    public GUI() {
        
        if(Connector.temp!= null){
            while (Connector.temp.isVisible()){}
            
        }
        initGUI();
    }
    
    public void initGUI() {
        fr = new JFrame("Anaconda Conversion");
        
        toLabel = new JLabel("TO");
        
        baseCombo = new JComboBox(names);
        targetCombo = new JComboBox(names);
        givenCurrencyField = new JTextField();
        givenCurrencyField.setText("0");
        resultField = new JTextField();
        calculate = new JButton("Calculate");
        calculate.setBounds(350, 300, 200, 40);
        baseCombo.setBounds(80, 100, 200, 35);
        targetCombo.setBounds(320, 100, 200, 35);
        toLabel.setBounds(290, 100, 20, 40);
        givenCurrencyField.setBounds(80, 150, 200, 35);
        resultField.setBounds(320, 150, 200, 35);
        resultField.setEditable(false);
        resultField.setBackground(Color.WHITE);
        
        fr.add(calculate);
        fr.add(baseCombo);
        fr.add(toLabel);
        fr.add(targetCombo);
        fr.add(givenCurrencyField);
        fr.add(resultField);
        
        fr.setSize(600, 400);
        fr.setLayout(null);
        fr.setVisible(true);
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
