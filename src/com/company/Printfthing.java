package com.company;
import java.lang.*;
import java.util.Scanner;
import java.util.Random;
public class Printfthing {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String answer;
        Random Randy = new Random();

        do{
            int happy = 45;
            double doubly2 = Math.sqrt (happy);
            double doubly3 = doubly2*3.798;
            double doubly4 = happy*doubly3 + doubly2;
            System.out.printf("%10.5f \n %10d\n %10.5f\n %10.5f", doubly2,happy,doubly3,doubly4);
            System.out.println("Do you want to quit?");
            answer = input.next();
        } while (answer.contains("y"));

    }
}
