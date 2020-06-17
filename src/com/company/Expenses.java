package com.company;

public class Expenses {
    public static void main(String [] args){
        int bill1= 30;
        int bill2= 40;
        int bill3= 38;
        int subtotal= bill1 + bill2 + bill3;
        final double tax= subtotal*.08;
        final double tip= subtotal*.15;
        double total= (subtotal * tax + tip);

        System.out.println("subtotal: "+subtotal);
        System.out.println("tax: " + tax);
        System.out.println("tip: " + tip);
        System.out.println("total: " + subtotal + tax + tip);
    }

}
