package com.company;

public class Numbers {
    public static void main(String[] args) {

        char letter = 65;
        for (int Top = 5; Top > 0; Top--) {
            for (int i = 0; i < 6; i++) {
                System.out.print((char) (letter + i) + " ");

            }

            System.out.println(" ");
        }
        for (int Bottom = 5; Bottom > 0; Bottom--) {
            for (int i = 0; i < 6; i++) {
                System.out.print((char) (letter + i) + " ");

            }

            System.out.println(" ");
        }
    }
}
