/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Abdullah
 */
public class GUI_Hnd implements ActionListener {

    Connector con;
    GUI gui;
    Manipulator mani;

    public GUI_Hnd() {
        init();
    }

    public void init() {
        con = new Connector();
        gui = new GUI();
        mani = new Manipulator(gui, con);

        gui.calculate.addActionListener(this);
//        gui.givenCurrencyField.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gui.calculate) {
            mani.setCurrency();
            mani.setTargetCurrency();
            mani.setBaseCurrency();
            double answer;
            answer = Double.parseDouble(gui.givenCurrencyField.getText());
            answer = answer * (mani.targetValue / mani.baseValue);
            gui.resultField.setText(Double.toString(answer));
        }
//        if(e.getSource()==gui.givenCurrencyField){
//            System.out.println("fghj");
//        }

    }
}
