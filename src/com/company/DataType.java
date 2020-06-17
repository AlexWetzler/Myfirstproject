/* Alex Wetzler

 This is my psudocode
 Make int, double, and String (something, somethingelse, anything)

 import scanner
 print i + the int variable
 print d + the double variable to a scale of one decimal place
 Concantenate s with the string and print it */
package com.company;
import java.util.Scanner;
public class DataType {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "Greenhill ";
        System.out.println("Please give an integer");
        Scanner input = new Scanner(System.in);
        int something = input.nextInt();
        System.out.println("Please give a number with a decimal");
        double somethingelse = input.nextDouble();
        System.out.println("Please give a phrase");
        String anything = (input.next() + input.nextLine());
        System.out.println("The sum is: "+ i + something);
        System.out.println("The sum is: "+ d + somethingelse);
        System.out.println("The phrase is: "+ s + anything);
    }
}