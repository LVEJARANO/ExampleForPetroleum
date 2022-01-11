package com.petroleum.logic;

import javax.swing.JOptionPane;

/**
 *
 * @author Comoprogramarlv
 */
public class PetroleumMaxMin {

    double barrelMin, barrelMax, barrel;
    String countryMin, countryMax,country, result;

    public String getProductionMaxMin() {
        barrelMin = 0;
        barrelMax = 0;
        countryMin = "";
        countryMax = "";

        for (int i = 1; i <= 10; i++) {
            country = JOptionPane.showInputDialog(null, "Ingrese el País " + i + ":");
            barrel = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la producción de Petróleo en barriles del País" + i + ":"));

            if (barrelMin != 0 || barrelMax != 0) {
                if (barrel > barrelMax) {
                    barrelMax = barrel;
                    countryMax = country;
                }
                if (barrel < barrelMin) {
                    barrelMin = barrel;
                    countryMin = country;
                }
            } else {
                barrelMax = barrel;
                barrelMin = barrel;
                countryMax = country;
                countryMin = country;
            }
        }
        result = "La producción menor de Petróleo es: " + barrelMin + " barriles del País: " + countryMin
                + "\nLa producción mayor de Petróleo es: " + barrelMax + " barriles del País: " + countryMax;
        return result;
    }
}
