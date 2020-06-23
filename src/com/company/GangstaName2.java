/*
Alex Wetzler
 make a public static void  main
    define scanner, name, and print "Type your name player: ". make sure that name = the user's input
    to make name equal the user's input you need sc.nextLine();
    create sayHi(name); [this will send name to the parenthesis to the public static void sayHi
 make another public static void named sayHi(String name)
    make a new char that = letter
    make letter equal the letter at the start of the input
    print letter + (space) "diddy"
    make indexoOf to find the space in the name
    make a new string called lastname that is a substring of name. it should only be the part after the space
    make a new string called a that is equal to lastname in order to turn the lastname substring entirely into uppercase
    print a + (space)
    finally, print System.out.print(name.substring(0, indexOf)+"-izzle");
 */
package com.company;

import java.util.Scanner;

public class GangstaName2 {
    public static void main(String[] args) { //I don't really see the point of having main as you could just define everything is sayHi
        System.out.print("Type your name player: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sayHi(name); //this moves the value of name (which is the user's input) to the public static void sayHi

    }
    public static void sayHi(String name) {
        char letter;
        letter = name.charAt(0); //this makes letter equal whatever is at index 0 aka the start of the name
        System.out.print(letter +" ");
        System.out.print("Diddy ");
        int indexOf = name.indexOf(" ");
        String lastName = name.substring(indexOf+1);
        String a = lastName;
            a = a.toUpperCase();
            System.out.print(a + " ");
        System.out.print(name.substring(0, indexOf)+"-izzle");

    }
}

