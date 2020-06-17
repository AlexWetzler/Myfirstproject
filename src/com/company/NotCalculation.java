package com.company;

public class NotCalculation {
    public static void main(String[] args) {
//    sayHi("Marty");
    String teacher= "Maria Suarez";
    System.out.println(teacher.substring(3,7));
//    sayHi(teacher);

    }
    public static void sayHi(String name) {
        System.out.println("This name is " + name.length() + " characters long");
        System.out.println("Hello " + name);
        int indexOf = name.indexOf("S");
        System.out.println("The index of S is = " + indexOf);
        if (indexOf > 0) {
            String lastname = name.substring(indexOf);
            System.out.println("The lastname= " + lastname);
        }
        if (name.length() > 4) {
        char letter;
        letter = name.charAt(4);
        System.out.println("The character= " + letter);
    }
    }
}
