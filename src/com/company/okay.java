/*
Alex Wetzler
create a public static void main
    define T, total, Average, randy (random) console (scanner) and index
    make a do/while loop that asks the user how many days they want to know the temp of
        make sure to include a console.nextInt(); so the user can respond
    make an array that has an index of T (aka the value the user inputs)
    create a for loop that will essentially print random numbers between 25 and 115 for T amount of times
        make it so the temperature of each day is being added to the total
    change Average2's value to the average of the days temperature
    define counter
    create for loop that will add 1 to counter every time if the value of each index is greater than average2's value
    finally, print out how many days are above average
 */
package com.company;
import java.util.*;
public class okay { //not the best name but it works
    public static void main(String[] args){
        int T = 0; //this will be the user input
        int total= 0; //this will be the number that equals all the temps added up
        int Average2 = 0; // this is the average of all the temps
        Random randy = new Random(); //this will be used to produce the random numbers for each day
       Scanner console = new Scanner(System.in);
       int index = 0;
        do{ //this asks the user how many days they would like.
            System.out.println("How many days would you like to know the high temperature?(give an integer between 2 and 100)");
            T = console.nextInt();
        }while (T <2 || T >=100); //no more than 100
        int [] myarray = new int[T];
        for (index = 0; index < myarray.length; index++){
            myarray[index] = (randy.nextInt(85) + 25); //this statement assigns a random number to each index
            System.out.println("Day "+ (index + 1) + ": " + myarray[index] + " degrees");
            total = total + myarray[index]; //this adds up all the temperatures (will be used for the average)
        }
        Average2 = total/T; //sets average2's value to the actual average temp of all the days
        System.out.println("The average temperature of all the days is: " + Average2);
        int counter = 0;
        for (index = 0; index < myarray.length; index++){ // this loop adds 1 to the counter for each day that is greater than the average
            if(myarray[index] > Average2){
                counter++;
            }
        }
        System.out.println(counter + " days are above average.");
    }
}
