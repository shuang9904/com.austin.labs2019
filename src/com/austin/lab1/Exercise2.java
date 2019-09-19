package com.austin.lab1;
import java.util.Scanner;


/*2) Calculations and if – else (the sponsored cyclist).
A cyclist is sponsored at the rate of 7c for each km up to 10 km,
and 10c for each km in excess of 10km. Write a program which will
ask for the cyclist’s first name, initial and last name and the
distance cycled. Your program should calculate the money due, then
display a dialog containing the cylist’s full name (first name +
initial + last name), the distance cycled, and the money due. Note
here that the problem involves 2 different rates if the number of
 km exceeds 10 so, for example, if the cyclist is sponsored for 15km
  then the first 10km are sponsored at 7c and the remaining 5 km are
  sponsored at 10c giving*/
public class Exercise2 {
    public static void main(String[] args) {


        String name,initial,lastName;
        int distanceCycled,sponsered,sponsered2,fixedDistance;

        Scanner input = new Scanner(System.in);


        System.out.print("Insert first name: ");
        name=input.nextLine();
        System.out.print("Insert initial: ");
        initial=input.nextLine();
        System.out.print("Insert last name: ");
        lastName=input.nextLine();

        System.out.print("Distance cycled: ");
        distanceCycled=input.nextInt();

        if( distanceCycled<=10) {
            sponsered = distanceCycled * 7;
            System.out.print("You got " +sponsered);}
             else if ( distanceCycled >= 10)
        {sponsered2 = ((distanceCycled-10)*10)+(distanceCycled*7);
                 System.out.print("You got "+ sponsered2);
        }




    }
}
