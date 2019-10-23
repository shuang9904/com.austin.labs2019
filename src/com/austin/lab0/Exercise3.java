package com.austin.lab0;
import javax.swing.*;


public class Exercise3 {
    public static void main(String[] args) {

        String name,taxableIncomeAsString;
        Double taxableIncome,taxCalc,rate;

        name= JOptionPane.showInputDialog(null,"Enter name:");
        taxableIncomeAsString=JOptionPane.showInputDialog(null,"Enter taxable income: ");
        taxableIncome=Double.parseDouble(taxableIncomeAsString);


        if(taxableIncome<=20000&&taxableIncome>=0) {
            rate=0d/100;
            taxCalc = taxableIncome;
         if (taxableIncome <= 36000 && taxableIncome >= 20000.01)
                rate=20d/100;
                taxCalc = taxableIncome - (taxableIncome * rate);
             if (taxableIncome >= 36000.01)
                 rate=41d/100;
                taxCalc = taxableIncome - (taxableIncome * rate);


            JOptionPane.showMessageDialog(null,"Your name is " + name +
                    "\nYour income before tax is "+ taxableIncome +
                    "\nThe tax rate of your income is " + rate + "\nThis is your net income " + taxCalc,
                    "TaxCalculated", JOptionPane.INFORMATION_MESSAGE);

        }
    }
}
