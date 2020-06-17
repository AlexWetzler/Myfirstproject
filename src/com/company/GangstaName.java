package com.company;

import java.util.Scanner;

public class GangstaName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Say something!");
        String name = sc.nextLine();
        sayHi(name);

    }
    public static void sayHi(String name) {
        char firstInitial= name.charAt(0);
        int indexOf = name.indexOf(" ");
        String firstName = name.substring(0, indexOf);
        String lastName = name.substring(indexOf+1);
        String A = ("A");
        System.out.println("Your gangsta name is " );
        System.out.println (firstInitial+".Diddy "+  A + firstName + "izzle");
        System.out.print(name.substring(0,indexOf)+ "-izzle");

    }
}

