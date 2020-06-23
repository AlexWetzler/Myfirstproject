/* Alex Wetzler

 This is my psudocode
 import scanner
 Write the the given i, d, and s variables.
 Make int, double, and String (something, somethingelse, anything)
 Make sure the variables = the users input using input.nextInt, input.nextDouble, and input.nextLine.
 print: The some is
 print i + the int variable
 print: The sum is
 print d + the double variable to a scale of one decimal place
 print: the phrase is
 Concantenate s with the string and print it */
package com.company;
import java.util.Scanner;
public class DataType {
    public static void main(String[] args) {
        int i = 4; //these variables are required to be defined and can't be changed
        double d = 4.0;
        String s = "Greenhill ";
        Scanner input = new Scanner(System.in);
        System.out.println("Please give an integer");
        int something = input.nextInt(); //this allows the user to give an input. it sets something to that input

        System.out.println("Please give a number with a decimal");
        double somethingelse = input.nextDouble(); //this allows the user to give an input but instead of an int it's a double

        System.out.println("Please give a phrase");
        String anything = (input.next() + input.nextLine()); //much like the comments above this one, this allows the user to give an input but instead its for a string

        System.out.println("The sum is: "+ i + something); //this simply prints out all the equations that the assignment requires(these three lines)
        System.out.println("The sum is: "+ d + somethingelse);
        System.out.println("The phrase is: "+ s + anything);
    }
}