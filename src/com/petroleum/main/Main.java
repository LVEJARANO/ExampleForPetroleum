/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.petroleum.main;

import com.petroleum.logic.PetroleumMaxMin;
import javax.swing.JOptionPane;

/**
 *
 * @author comoprogramarlv
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        PetroleumMaxMin objPetroleumMaxMin = new PetroleumMaxMin();
        String result = objPetroleumMaxMin.getProductionMaxMin();
        JOptionPane.showMessageDialog(null, result);
    }  
}
