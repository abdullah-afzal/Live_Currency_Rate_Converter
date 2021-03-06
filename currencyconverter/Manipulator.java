/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 *
 * @author Abdullah
 */
public class Manipulator {

    Connector con;
    GUI gui;
    String baseCurrency, targetCurrency;
    Double baseValue = 0.0;
    Double targetValue;
    ObjectMapper mapper = new ObjectMapper();
    DataModel model;

    public Manipulator(GUI g, Connector c) {
        con = c;
        gui = g;
        initManipulator();
    }

    public void initManipulator() {

        try {
            model = mapper.readValue(con.data.toString(), DataModel.class);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setCurrency() {
        baseCurrency = gui.baseCombo.getSelectedItem().toString();
        targetCurrency = gui.targetCombo.getSelectedItem().toString();
    }

    public void setBaseCurrency() {

        if (baseCurrency == "AED") {
            baseValue = model.getRates().getAED();
        } else if (baseCurrency == "AFN") {
            baseValue = model.getRates().getAFN();
        } else if (baseCurrency == "ALL") {
            baseValue = model.getRates().getALL();
        } else if (baseCurrency == "AMD") {
            baseValue = model.getRates().getAMD();
        } else if (baseCurrency == "ANG") {
            baseValue = model.getRates().getANG();
        } else if (baseCurrency == "AOA") {
            baseValue = model.getRates().getAOA();
        } else if (baseCurrency == "ARS") {
            baseValue = model.getRates().getARS();
        } else if (baseCurrency == "AUD") {
            baseValue = model.getRates().getAUD();
        } else if (baseCurrency == "AWG") {
            baseValue = model.getRates().getAWG();
        } else if (baseCurrency == "AZN") {
            baseValue = model.getRates().getAZN();
        } else if (baseCurrency == "BAM") {
            baseValue = model.getRates().getBAM();
        } else if (baseCurrency == "BBD") {
            baseValue = model.getRates().getBBD();
        } else if (baseCurrency == "BDT") {
            baseValue = model.getRates().getBDT();
        } else if (baseCurrency == "BGN") {
            baseValue = model.getRates().getBGN();
        } else if (baseCurrency == "BHD") {
            baseValue = model.getRates().getBHD();
        } else if (baseCurrency == "BIF") {
            baseValue = model.getRates().getBIF();
        } else if (baseCurrency == "BMD") {
            baseValue = model.getRates().getBMD();
        } else if (baseCurrency == "BND") {
            baseValue = model.getRates().getBND();
        } else if (baseCurrency == "BOB") {
            baseValue = model.getRates().getBOB();
        } else if (baseCurrency == "BRL") {
            baseValue = model.getRates().getBRL();
        } else if (baseCurrency == "BSD") {
            baseValue = model.getRates().getBSD();
        } else if (baseCurrency == "BTC") {
            baseValue = model.getRates().getBTC();
        } else if (baseCurrency == "BTN") {
            baseValue = model.getRates().getBTN();
        } else if (baseCurrency == "BWP") {
            baseValue = model.getRates().getBWP();
        } else if (baseCurrency == "BYN") {
            baseValue = model.getRates().getBYN();
        } else if (baseCurrency == "BYR") {
            baseValue = model.getRates().getBYR();
        } else if (baseCurrency == "BZD") {
            baseValue = model.getRates().getBZD();
        } else if (baseCurrency == "CAD") {
            baseValue = model.getRates().getCAD();
        } else if (baseCurrency == "CDF") {
            baseValue = model.getRates().getCDF();
        } else if (baseCurrency == "CHF") {
            baseValue = model.getRates().getCHF();
        } else if (baseCurrency == "CLF") {
            baseValue = model.getRates().getCLF();
        } else if (baseCurrency == "CLP") {
            baseValue = model.getRates().getCLP();
        } else if (baseCurrency == "CNY") {
            baseValue = model.getRates().getCNY();
        } else if (baseCurrency == "COP") {
            baseValue = model.getRates().getCOP();
        } else if (baseCurrency == "CRC") {
            baseValue = model.getRates().getCRC();
        } else if (baseCurrency == "CUC") {
            baseValue = model.getRates().getCUC();
        } else if (baseCurrency == "CUP") {
            baseValue = model.getRates().getCUP();
        } else if (baseCurrency == "CVE") {
            baseValue = model.getRates().getCVE();
        } else if (baseCurrency == "CZK") {
            baseValue = model.getRates().getCZK();
        } else if (baseCurrency == "DJF") {
            baseValue = model.getRates().getDJF();
        } else if (baseCurrency == "DKK") {
            baseValue = model.getRates().getDKK();
        } else if (baseCurrency == "DOP") {
            baseValue = model.getRates().getDOP();
        } else if (baseCurrency == "DZD") {
            baseValue = model.getRates().getDZD();
        } else if (baseCurrency == "EGP") {
            baseValue = model.getRates().getEGP();
        } else if (baseCurrency == "ERN") {
            baseValue = model.getRates().getERN();
        } else if (baseCurrency == "ETB") {
            baseValue = model.getRates().getETB();
        } else if (baseCurrency == "EUR") {
            baseValue = new Double(model.getRates().getEUR());
        } else if (baseCurrency == "FJD") {
            baseValue = model.getRates().getFJD();
        } else if (baseCurrency == "FKP") {
            baseValue = model.getRates().getFKP();
        } else if (baseCurrency == "GBP") {
            baseValue = model.getRates().getGBP();
        } else if (baseCurrency == "GEL") {
            baseValue = model.getRates().getGEL();
        } else if (baseCurrency == "GGP") {
            baseValue = model.getRates().getGGP();
        } else if (baseCurrency == "GHS") {
            baseValue = model.getRates().getGHS();
        } else if (baseCurrency == "GIP") {
            baseValue = model.getRates().getGIP();
        } else if (baseCurrency == "GMD") {
            baseValue = model.getRates().getGMD();
        } else if (baseCurrency == "GNF") {
            baseValue = model.getRates().getGNF();
        } else if (baseCurrency == "GTQ") {
            baseValue = model.getRates().getGTQ();
        } else if (baseCurrency == "GYD") {
            baseValue = model.getRates().getGYD();
        } else if (baseCurrency == "HKD") {
            baseValue = model.getRates().getHKD();
        } else if (baseCurrency == "HNL") {
            baseValue = model.getRates().getHNL();
        } else if (baseCurrency == "HRK") {
            baseValue = model.getRates().getHRK();
        } else if (baseCurrency == "HTG") {
            baseValue = model.getRates().getHTG();
        } else if (baseCurrency == "HUF") {
            baseValue = model.getRates().getHUF();
        } else if (baseCurrency == "IDR") {
            baseValue = model.getRates().getIDR();
        } else if (baseCurrency == "ILS") {
            baseValue = model.getRates().getILS();
        } else if (baseCurrency == "IMP") {
            baseValue = model.getRates().getIMP();
        } else if (baseCurrency == "INR") {
            baseValue = model.getRates().getINR();
        } else if (baseCurrency == "IQD") {
            baseValue = model.getRates().getIQD();
        } else if (baseCurrency == "IRR") {
            baseValue = model.getRates().getIRR();
        } else if (baseCurrency == "ISK") {
            baseValue = model.getRates().getISK();
        } else if (baseCurrency == "JEP") {
            baseValue = model.getRates().getJEP();
        } else if (baseCurrency == "JMD") {
            baseValue = model.getRates().getJMD();
        } else if (baseCurrency == "JOD") {
            baseValue = model.getRates().getJOD();
        } else if (baseCurrency == "JPY") {
            baseValue = model.getRates().getJPY();
        } else if (baseCurrency == "KES") {
            baseValue = model.getRates().getKES();
        } else if (baseCurrency == "KGS") {
            baseValue = model.getRates().getKGS();
        } else if (baseCurrency == "KHR") {
            baseValue = model.getRates().getKHR();
        } else if (baseCurrency == "KMF") {
            baseValue = model.getRates().getKMF();
        } else if (baseCurrency == "KPW") {
            baseValue = model.getRates().getKPW();
        } else if (baseCurrency == "KRW") {
            baseValue = model.getRates().getKRW();
        } else if (baseCurrency == "KWD") {
            baseValue = model.getRates().getKWD();
        } else if (baseCurrency == "KYD") {
            baseValue = model.getRates().getKYD();
        } else if (baseCurrency == "KZT") {
            baseValue = model.getRates().getKZT();
        } else if (baseCurrency == "LAK") {
            baseValue = model.getRates().getLAK();
        } else if (baseCurrency == "LBP") {
            baseValue = model.getRates().getLBP();
        } else if (baseCurrency == "LKR") {
            baseValue = model.getRates().getLKR();
        } else if (baseCurrency == "LRD") {
            baseValue = model.getRates().getLRD();
        } else if (baseCurrency == "LSL") {
            baseValue = model.getRates().getLSL();
        } else if (baseCurrency == "LTL") {
            baseValue = model.getRates().getLTL();
        } else if (baseCurrency == "LVL") {
            baseValue = model.getRates().getLVL();
        } else if (baseCurrency == "LYD") {
            baseValue = model.getRates().getLYD();
        } else if (baseCurrency == "MAD") {
            baseValue = model.getRates().getMAD();
        } else if (baseCurrency == "MDL") {
            baseValue = model.getRates().getMDL();
        } else if (baseCurrency == "MGA") {
            baseValue = model.getRates().getMGA();
        } else if (baseCurrency == "MKD") {
            baseValue = model.getRates().getMKD();
        } else if (baseCurrency == "MMK") {
            baseValue = model.getRates().getMMK();
        } else if (baseCurrency == "MNT") {
            baseValue = model.getRates().getMNT();
        } else if (baseCurrency == "MOP") {
            baseValue = model.getRates().getMOP();
        } else if (baseCurrency == "MRO") {
            baseValue = model.getRates().getMRO();
        } else if (baseCurrency == "MUR") {
            baseValue = model.getRates().getMUR();
        } else if (baseCurrency == "MVR") {
            baseValue = model.getRates().getMVR();
        } else if (baseCurrency == "MWK") {
            baseValue = model.getRates().getMWK();
        } else if (baseCurrency == "MXN") {
            baseValue = model.getRates().getMXN();
        } else if (baseCurrency == "MYR") {
            baseValue = model.getRates().getMYR();
        } else if (baseCurrency == "MZN") {
            baseValue = model.getRates().getMZN();
        } else if (baseCurrency == "NAD") {
            baseValue = model.getRates().getNAD();
        } else if (baseCurrency == "NGN") {
            baseValue = model.getRates().getNGN();
        } else if (baseCurrency == "NIO") {
            baseValue = model.getRates().getNIO();
        } else if (baseCurrency == "NOK") {
            baseValue = model.getRates().getNOK();
        } else if (baseCurrency == "NPR") {
            baseValue = model.getRates().getNPR();
        } else if (baseCurrency == "NZD") {
            baseValue = model.getRates().getNZD();
        } else if (baseCurrency == "OMR") {
            baseValue = model.getRates().getOMR();
        } else if (baseCurrency == "PAB") {
            baseValue = model.getRates().getPAB();
        } else if (baseCurrency == "PEN") {
            baseValue = model.getRates().getPEN();
        } else if (baseCurrency == "PGK") {
            baseValue = model.getRates().getPGK();
        } else if (baseCurrency == "PHP") {
            baseValue = model.getRates().getPHP();
        } else if (baseCurrency == "PKR") {
            baseValue = model.getRates().getPKR();
        } else if (baseCurrency == "PLN") {
            baseValue = model.getRates().getPLN();
        } else if (baseCurrency == "PYG") {
            baseValue = model.getRates().getPYG();
        } else if (baseCurrency == "QAR") {
            baseValue = model.getRates().getQAR();
        } else if (baseCurrency == "RON") {
            baseValue = model.getRates().getRON();
        } else if (baseCurrency == "RSD") {
            baseValue = model.getRates().getRSD();
        } else if (baseCurrency == "RUB") {
            baseValue = model.getRates().getRUB();
        } else if (baseCurrency == "RWF") {
            baseValue = model.getRates().getRWF();
        } else if (baseCurrency == "SAR") {
            baseValue = model.getRates().getSAR();
        } else if (baseCurrency == "SBD") {
            baseValue = model.getRates().getSBD();
        } else if (baseCurrency == "SCR") {
            baseValue = model.getRates().getSCR();
        } else if (baseCurrency == "SDG") {
            baseValue = model.getRates().getSDG();
        } else if (baseCurrency == "SEK") {
            baseValue = model.getRates().getSEK();
        } else if (baseCurrency == "SGD") {
            baseValue = model.getRates().getSGD();
        } else if (baseCurrency == "SHP") {
            baseValue = model.getRates().getSHP();
        } else if (baseCurrency == "SLL") {
            baseValue = model.getRates().getSLL();
        } else if (baseCurrency == "SOS") {
            baseValue = model.getRates().getSOS();
        } else if (baseCurrency == "SRD") {
            baseValue = model.getRates().getSRD();
        } else if (baseCurrency == "STD") {
            baseValue = model.getRates().getSTD();
        } else if (baseCurrency == "SVC") {
            baseValue = model.getRates().getSVC();
        } else if (baseCurrency == "SYP") {
            baseValue = model.getRates().getSYP();
        } else if (baseCurrency == "SZL") {
            baseValue = model.getRates().getSZL();
        } else if (baseCurrency == "THB") {
            baseValue = model.getRates().getTHB();
        } else if (baseCurrency == "TJS") {
            baseValue = model.getRates().getTJS();
        } else if (baseCurrency == "TMT") {
            baseValue = model.getRates().getTMT();
        } else if (baseCurrency == "TND") {
            baseValue = model.getRates().getTND();
        } else if (baseCurrency == "TOP") {
            baseValue = model.getRates().getTOP();
        } else if (baseCurrency == "TRY") {
            baseValue = model.getRates().getTRY();
        } else if (baseCurrency == "TTD") {
            baseValue = model.getRates().getTTD();
        } else if (baseCurrency == "TWD") {
            baseValue = model.getRates().getTWD();
        } else if (baseCurrency == "TZS") {
            baseValue = model.getRates().getTZS();
        } else if (baseCurrency == "UAH") {
            baseValue = model.getRates().getUAH();
        } else if (baseCurrency == "UGX") {
            baseValue = model.getRates().getUGX();
        } else if (baseCurrency == "USD") {
            baseValue = model.getRates().getUSD();
        } else if (baseCurrency == "UYU") {
            baseValue = model.getRates().getUYU();
        } else if (baseCurrency == "UZS") {
            baseValue = model.getRates().getUZS();
        } else if (baseCurrency == "VEF") {
            baseValue = model.getRates().getVEF();
        } else if (baseCurrency == "VND") {
            baseValue = model.getRates().getVND();
        } else if (baseCurrency == "VUV") {
            baseValue = model.getRates().getVUV();
        } else if (baseCurrency == "WST") {
            baseValue = model.getRates().getWST();
        } else if (baseCurrency == "XAF") {
            baseValue = model.getRates().getXAF();
        } else if (baseCurrency == "XAG") {
            baseValue = model.getRates().getXAG();
        } else if (baseCurrency == "XAU") {
            baseValue = model.getRates().getXAU();
        } else if (baseCurrency == "XCD") {
            baseValue = model.getRates().getXCD();
        } else if (baseCurrency == "XDR") {
            baseValue = model.getRates().getXDR();
        } else if (baseCurrency == "XOF") {
            baseValue = model.getRates().getXOF();
        } else if (baseCurrency == "XPF") {
            baseValue = model.getRates().getXPF();
        } else if (baseCurrency == "YER") {
            baseValue = model.getRates().getYER();
        } else if (baseCurrency == "ZAR") {
            baseValue = model.getRates().getZAR();
        } else if (baseCurrency == "ZMK") {
            baseValue = model.getRates().getZMK();
        } else if (baseCurrency == "ZMW") {
            baseValue = model.getRates().getZMW();
        } else if (baseCurrency == "ZWL") {
            baseValue = model.getRates().getZWL();
        }
    }

    public void setTargetCurrency() {

        if (targetCurrency == "AED") {
            targetValue = model.getRates().getAED();
        } else if (targetCurrency == "AFN") {
            targetValue = model.getRates().getAFN();
        } else if (targetCurrency == "ALL") {
            targetValue = model.getRates().getALL();
        } else if (targetCurrency == "AMD") {
            targetValue = model.getRates().getAMD();
        } else if (targetCurrency == "ANG") {
            targetValue = model.getRates().getANG();
        } else if (targetCurrency == "AOA") {
            targetValue = model.getRates().getAOA();
        } else if (targetCurrency == "ARS") {
            targetValue = model.getRates().getARS();
        } else if (targetCurrency == "AUD") {
            targetValue = model.getRates().getAUD();
        } else if (targetCurrency == "AWG") {
            targetValue = model.getRates().getAWG();
        } else if (targetCurrency == "AZN") {
            targetValue = model.getRates().getAZN();
        } else if (targetCurrency == "BAM") {
            targetValue = model.getRates().getBAM();
        } else if (targetCurrency == "BBD") {
            targetValue = model.getRates().getBBD();
        } else if (targetCurrency == "BDT") {
            targetValue = model.getRates().getBDT();
        } else if (targetCurrency == "BGN") {
            targetValue = model.getRates().getBGN();
        } else if (targetCurrency == "BHD") {
            targetValue = model.getRates().getBHD();
        } else if (targetCurrency == "BIF") {
            targetValue = model.getRates().getBIF();
        } else if (targetCurrency == "BMD") {
            targetValue = model.getRates().getBMD();
        } else if (targetCurrency == "BND") {
            targetValue = model.getRates().getBND();
        } else if (targetCurrency == "BOB") {
            targetValue = model.getRates().getBOB();
        } else if (targetCurrency == "BRL") {
            targetValue = model.getRates().getBRL();
        } else if (targetCurrency == "BSD") {
            targetValue = model.getRates().getBSD();
        } else if (targetCurrency == "BTC") {
            targetValue = model.getRates().getBTC();
        } else if (targetCurrency == "BTN") {
            targetValue = model.getRates().getBTN();
        } else if (targetCurrency == "BWP") {
            targetValue = model.getRates().getBWP();
        } else if (targetCurrency == "BYN") {
            targetValue = model.getRates().getBYN();
        } else if (targetCurrency == "BYR") {
            targetValue = model.getRates().getBYR();
        } else if (targetCurrency == "BZD") {
            targetValue = model.getRates().getBZD();
        } else if (targetCurrency == "CAD") {
            targetValue = model.getRates().getCAD();
        } else if (targetCurrency == "CDF") {
            targetValue = model.getRates().getCDF();
        } else if (targetCurrency == "CHF") {
            targetValue = model.getRates().getCHF();
        } else if (targetCurrency == "CLF") {
            targetValue = model.getRates().getCLF();
        } else if (targetCurrency == "CLP") {
            targetValue = model.getRates().getCLP();
        } else if (targetCurrency == "CNY") {
            targetValue = model.getRates().getCNY();
        } else if (targetCurrency == "COP") {
            targetValue = model.getRates().getCOP();
        } else if (targetCurrency == "CRC") {
            targetValue = model.getRates().getCRC();
        } else if (targetCurrency == "CUC") {
            targetValue = model.getRates().getCUC();
        } else if (targetCurrency == "CUP") {
            targetValue = model.getRates().getCUP();
        } else if (targetCurrency == "CVE") {
            targetValue = model.getRates().getCVE();
        } else if (targetCurrency == "CZK") {
            targetValue = model.getRates().getCZK();
        } else if (targetCurrency == "DJF") {
            targetValue = model.getRates().getDJF();
        } else if (targetCurrency == "DKK") {
            targetValue = model.getRates().getDKK();
        } else if (targetCurrency == "DOP") {
            targetValue = model.getRates().getDOP();
        } else if (targetCurrency == "DZD") {
            targetValue = model.getRates().getDZD();
        } else if (targetCurrency == "EGP") {
            targetValue = model.getRates().getEGP();
        } else if (targetCurrency == "ERN") {
            targetValue = model.getRates().getERN();
        } else if (targetCurrency == "ETB") {
            targetValue = model.getRates().getETB();
        } else if (targetCurrency == "EUR") {
            targetValue = new Double(model.getRates().getEUR());
        } else if (targetCurrency == "FJD") {
            targetValue = model.getRates().getFJD();
        } else if (targetCurrency == "FKP") {
            targetValue = model.getRates().getFKP();
        } else if (targetCurrency == "GBP") {
            targetValue = model.getRates().getGBP();
        } else if (targetCurrency == "GEL") {
            targetValue = model.getRates().getGEL();
        } else if (targetCurrency == "GGP") {
            targetValue = model.getRates().getGGP();
        } else if (targetCurrency == "GHS") {
            targetValue = model.getRates().getGHS();
        } else if (targetCurrency == "GIP") {
            targetValue = model.getRates().getGIP();
        } else if (targetCurrency == "GMD") {
            targetValue = model.getRates().getGMD();
        } else if (targetCurrency == "GNF") {
            targetValue = model.getRates().getGNF();
        } else if (targetCurrency == "GTQ") {
            targetValue = model.getRates().getGTQ();
        } else if (targetCurrency == "GYD") {
            targetValue = model.getRates().getGYD();
        } else if (targetCurrency == "HKD") {
            targetValue = model.getRates().getHKD();
        } else if (targetCurrency == "HNL") {
            targetValue = model.getRates().getHNL();
        } else if (targetCurrency == "HRK") {
            targetValue = model.getRates().getHRK();
        } else if (targetCurrency == "HTG") {
            targetValue = model.getRates().getHTG();
        } else if (targetCurrency == "HUF") {
            targetValue = model.getRates().getHUF();
        } else if (targetCurrency == "IDR") {
            targetValue = model.getRates().getIDR();
        } else if (targetCurrency == "ILS") {
            targetValue = model.getRates().getILS();
        } else if (targetCurrency == "IMP") {
            targetValue = model.getRates().getIMP();
        } else if (targetCurrency == "INR") {
            targetValue = model.getRates().getINR();
        } else if (targetCurrency == "IQD") {
            targetValue = model.getRates().getIQD();
        } else if (targetCurrency == "IRR") {
            targetValue = model.getRates().getIRR();
        } else if (targetCurrency == "ISK") {
            targetValue = model.getRates().getISK();
        } else if (targetCurrency == "JEP") {
            targetValue = model.getRates().getJEP();
        } else if (targetCurrency == "JMD") {
            targetValue = model.getRates().getJMD();
        } else if (targetCurrency == "JOD") {
            targetValue = model.getRates().getJOD();
        } else if (targetCurrency == "JPY") {
            targetValue = model.getRates().getJPY();
        } else if (targetCurrency == "KES") {
            targetValue = model.getRates().getKES();
        } else if (targetCurrency == "KGS") {
            targetValue = model.getRates().getKGS();
        } else if (targetCurrency == "KHR") {
            targetValue = model.getRates().getKHR();
        } else if (targetCurrency == "KMF") {
            targetValue = model.getRates().getKMF();
        } else if (targetCurrency == "KPW") {
            targetValue = model.getRates().getKPW();
        } else if (targetCurrency == "KRW") {
            targetValue = model.getRates().getKRW();
        } else if (targetCurrency == "KWD") {
            targetValue = model.getRates().getKWD();
        } else if (targetCurrency == "KYD") {
            targetValue = model.getRates().getKYD();
        } else if (targetCurrency == "KZT") {
            targetValue = model.getRates().getKZT();
        } else if (targetCurrency == "LAK") {
            targetValue = model.getRates().getLAK();
        } else if (targetCurrency == "LBP") {
            targetValue = model.getRates().getLBP();
        } else if (targetCurrency == "LKR") {
            targetValue = model.getRates().getLKR();
        } else if (targetCurrency == "LRD") {
            targetValue = model.getRates().getLRD();
        } else if (targetCurrency == "LSL") {
            targetValue = model.getRates().getLSL();
        } else if (targetCurrency == "LTL") {
            targetValue = model.getRates().getLTL();
        } else if (targetCurrency == "LVL") {
            targetValue = model.getRates().getLVL();
        } else if (targetCurrency == "LYD") {
            targetValue = model.getRates().getLYD();
        } else if (targetCurrency == "MAD") {
            targetValue = model.getRates().getMAD();
        } else if (targetCurrency == "MDL") {
            targetValue = model.getRates().getMDL();
        } else if (targetCurrency == "MGA") {
            targetValue = model.getRates().getMGA();
        } else if (targetCurrency == "MKD") {
            targetValue = model.getRates().getMKD();
        } else if (targetCurrency == "MMK") {
            targetValue = model.getRates().getMMK();
        } else if (targetCurrency == "MNT") {
            targetValue = model.getRates().getMNT();
        } else if (targetCurrency == "MOP") {
            targetValue = model.getRates().getMOP();
        } else if (targetCurrency == "MRO") {
            targetValue = model.getRates().getMRO();
        } else if (targetCurrency == "MUR") {
            targetValue = model.getRates().getMUR();
        } else if (targetCurrency == "MVR") {
            targetValue = model.getRates().getMVR();
        } else if (targetCurrency == "MWK") {
            targetValue = model.getRates().getMWK();
        } else if (targetCurrency == "MXN") {
            targetValue = model.getRates().getMXN();
        } else if (targetCurrency == "MYR") {
            targetValue = model.getRates().getMYR();
        } else if (targetCurrency == "MZN") {
            targetValue = model.getRates().getMZN();
        } else if (targetCurrency == "NAD") {
            targetValue = model.getRates().getNAD();
        } else if (targetCurrency == "NGN") {
            targetValue = model.getRates().getNGN();
        } else if (targetCurrency == "NIO") {
            targetValue = model.getRates().getNIO();
        } else if (targetCurrency == "NOK") {
            targetValue = model.getRates().getNOK();
        } else if (targetCurrency == "NPR") {
            targetValue = model.getRates().getNPR();
        } else if (targetCurrency == "NZD") {
            targetValue = model.getRates().getNZD();
        } else if (targetCurrency == "OMR") {
            targetValue = model.getRates().getOMR();
        } else if (targetCurrency == "PAB") {
            targetValue = model.getRates().getPAB();
        } else if (targetCurrency == "PEN") {
            targetValue = model.getRates().getPEN();
        } else if (targetCurrency == "PGK") {
            targetValue = model.getRates().getPGK();
        } else if (targetCurrency == "PHP") {
            targetValue = model.getRates().getPHP();
        } else if (targetCurrency == "PKR") {
            targetValue = model.getRates().getPKR();
        } else if (targetCurrency == "PLN") {
            targetValue = model.getRates().getPLN();
        } else if (targetCurrency == "PYG") {
            targetValue = model.getRates().getPYG();
        } else if (targetCurrency == "QAR") {
            targetValue = model.getRates().getQAR();
        } else if (targetCurrency == "RON") {
            targetValue = model.getRates().getRON();
        } else if (targetCurrency == "RSD") {
            targetValue = model.getRates().getRSD();
        } else if (targetCurrency == "RUB") {
            targetValue = model.getRates().getRUB();
        } else if (targetCurrency == "RWF") {
            targetValue = model.getRates().getRWF();
        } else if (targetCurrency == "SAR") {
            targetValue = model.getRates().getSAR();
        } else if (targetCurrency == "SBD") {
            targetValue = model.getRates().getSBD();
        } else if (targetCurrency == "SCR") {
            targetValue = model.getRates().getSCR();
        } else if (targetCurrency == "SDG") {
            targetValue = model.getRates().getSDG();
        } else if (targetCurrency == "SEK") {
            targetValue = model.getRates().getSEK();
        } else if (targetCurrency == "SGD") {
            targetValue = model.getRates().getSGD();
        } else if (targetCurrency == "SHP") {
            targetValue = model.getRates().getSHP();
        } else if (targetCurrency == "SLL") {
            targetValue = model.getRates().getSLL();
        } else if (targetCurrency == "SOS") {
            targetValue = model.getRates().getSOS();
        } else if (targetCurrency == "SRD") {
            targetValue = model.getRates().getSRD();
        } else if (targetCurrency == "STD") {
            targetValue = model.getRates().getSTD();
        } else if (targetCurrency == "SVC") {
            targetValue = model.getRates().getSVC();
        } else if (targetCurrency == "SYP") {
            targetValue = model.getRates().getSYP();
        } else if (targetCurrency == "SZL") {
            targetValue = model.getRates().getSZL();
        } else if (targetCurrency == "THB") {
            targetValue = model.getRates().getTHB();
        } else if (targetCurrency == "TJS") {
            targetValue = model.getRates().getTJS();
        } else if (targetCurrency == "TMT") {
            targetValue = model.getRates().getTMT();
        } else if (targetCurrency == "TND") {
            targetValue = model.getRates().getTND();
        } else if (targetCurrency == "TOP") {
            targetValue = model.getRates().getTOP();
        } else if (targetCurrency == "TRY") {
            targetValue = model.getRates().getTRY();
        } else if (targetCurrency == "TTD") {
            targetValue = model.getRates().getTTD();
        } else if (targetCurrency == "TWD") {
            targetValue = model.getRates().getTWD();
        } else if (targetCurrency == "TZS") {
            targetValue = model.getRates().getTZS();
        } else if (targetCurrency == "UAH") {
            targetValue = model.getRates().getUAH();
        } else if (targetCurrency == "UGX") {
            targetValue = model.getRates().getUGX();
        } else if (targetCurrency == "USD") {
            targetValue = model.getRates().getUSD();
        } else if (targetCurrency == "UYU") {
            targetValue = model.getRates().getUYU();
        } else if (targetCurrency == "UZS") {
            targetValue = model.getRates().getUZS();
        } else if (targetCurrency == "VEF") {
            targetValue = model.getRates().getVEF();
        } else if (targetCurrency == "VND") {
            targetValue = model.getRates().getVND();
        } else if (targetCurrency == "VUV") {
            targetValue = model.getRates().getVUV();
        } else if (targetCurrency == "WST") {
            targetValue = model.getRates().getWST();
        } else if (targetCurrency == "XAF") {
            targetValue = model.getRates().getXAF();
        } else if (targetCurrency == "XAG") {
            targetValue = model.getRates().getXAG();
        } else if (targetCurrency == "XAU") {
            targetValue = model.getRates().getXAU();
        } else if (targetCurrency == "XCD") {
            targetValue = model.getRates().getXCD();
        } else if (targetCurrency == "XDR") {
            targetValue = model.getRates().getXDR();
        } else if (targetCurrency == "XOF") {
            targetValue = model.getRates().getXOF();
        } else if (targetCurrency == "XPF") {
            targetValue = model.getRates().getXPF();
        } else if (targetCurrency == "YER") {
            targetValue = model.getRates().getYER();
        } else if (targetCurrency == "ZAR") {
            targetValue = model.getRates().getZAR();
        } else if (targetCurrency == "ZMK") {
            targetValue = model.getRates().getZMK();
        } else if (targetCurrency == "ZMW") {
            targetValue = model.getRates().getZMW();
        } else if (targetCurrency == "ZWL") {
            targetValue = model.getRates().getZWL();
        }
    }

}
