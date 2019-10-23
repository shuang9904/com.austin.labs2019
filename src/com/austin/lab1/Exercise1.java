package com.austin.lab1;
import javax.swing.*;

public class Exercise1 {
    public static void main(String[] args) {
         String GbpAsString;
         int i;
         float Gbp;
         double convertRate=1.1512,euro;

         do {
             GbpAsString = JOptionPane.showInputDialog("Enter the GBP amount you want to convert:");
             Gbp = Float.parseFloat(GbpAsString);


        euro = Gbp * convertRate;


            JOptionPane.showMessageDialog(null, "You entered "+ Gbp +"Gbp. This is the converted rate:" +
                    String.format("%.4f", euro), "GBP converted", JOptionPane.INFORMATION_MESSAGE);
    }while (Gbp!=0);
        System.exit(0);





    }
}
