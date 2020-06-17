package com.company;

public class Challenge3v2 {

    public static void main(String[] args) {
        Line();
        Top();
        Bottom();
        Line();
    }
    public static void Line(){
        System.out.print("#");
        for( int repeater=0 ; repeater <16 ; repeater++){
            System.out.print("=");
        }
        System.out.println("#");
    }
    public static void Top() {
        for (int line = 1; line < 5; line++) {
            System.out.print("|");
            for (int spaces = 1; spaces < -2 * line + 8; spaces++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dot = 1; dot < 4 * line - 3; dot++) {
                System.out.print(".");
            }

                System.out.print("<>");
                for (int spaces = 1; spaces < -2 * line + 10; spaces++) {
                    System.out.print(" ");

                }
                System.out.println("|");
            }

        }

        public static void Bottom () {
            System.out.println("| <>.........<> |");
            System.out.println("|   <>......<>   |");
            System.out.println("|    <>....<>    |");
            System.out.println("|      <><>      |");
        }
    }
