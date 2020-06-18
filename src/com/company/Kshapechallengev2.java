package com.company;

public class Kshapechallengev2 {
    public static void main(String[] args) {

        char letter = 65;

        for (int Top = 7; Top > 0; Top--) {
            for (int i = 0; i < Top; i++) {
                System.out.print((char) (letter + i) + " ");
            }
            System.out.println();
        }
        for (int Top = 0; Top < 7; Top++) {
            for (int i = 0; i < Top; i++) {
                System.out.print((char) (letter + i) + " ");
            }
            System.out.println();
        }
    }
}

