package com.austin.lab1;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
       /* A simple calculation. The canteen is offering a special
        start-of-year mineral-and-muffin snack deal at 2 euro per
        snack. Write a program which will ask you to enter your name,
        your class name and how many snacks you’d like, and
        which will calculate and display in a dialog your name and class,
        the number of snacks you asked for and what you will have to pay.*/

       String name,className;
       int snack=2,snackNo,snackCost;

       Scanner input = new Scanner(System.in);

       System.out.print("Enter your name: ");
       name=input.nextLine();

       System.out.print("Enter your class name: ");
       className=input.nextLine();

       System.out.print("How many snacks do you want : ");
       snackNo=input.nextInt();

       snackCost=snackNo*snack;

       System.out.println("\n\nYour name:" + name + "\nClass Name: " + className+ "\nYou ordered "+
               snackNo + " snacks" + "\nNow you have to pay " + snackCost);




    }
}
