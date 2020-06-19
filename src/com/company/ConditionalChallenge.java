/*
Alex Wetzler

Import random and scanner.
create public static void main
set up scanner variable namer input.
make a random variable
make it so the random number ranges between 1 - 138
create "solve(r2, r, n, a2);" so that the variables are linked to the following static void
create a static void with the variables above
set up "loop" int loop = 1;
        if (a2.equals("yes")) {
            loop = loop++;
        } else if (a2.equals("no")) {
            loop = loop - 100;
        }
set up a while loop that also has the if/else statements which determine whether or not the number is weird or not weird

 */
package com.company;
import java.util.Random;
import java.util.Scanner;
public class ConditionalChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r2 = new Random();
        //this is the range of the random number
        int r = r2.nextInt(1);
        int n = r2.nextInt(138);
        String a2 = ("yes");
        solve(r2, r, n, a2);
    }


    static void solve(Random r2, int r, int n, String a2) {
        int loop = 1;
        if (a2.equals("yes")) {
            loop = loop++;
        } else if (a2.equals("no")) {
            loop = loop - 100;
        }
            do {
                loop = loop + 1;
                System.out.println("Do you want to start/continue?");
                Scanner input = new Scanner(System.in);
                a2 = input.nextLine();
                System.out.println("The random number is: " + n);
                if (n % 2 == 1) {
                    System.out.println("Weird");

                } else if (n % 2 == 0 && n >= 2 && n <= 5) {
                    System.out.println("Not Weird");
                } else if (n % 2 == 0 && n >= 6 && n <= 20) {
                    System.out.println("Weird");
                } else if (n % 2 == 0 && n > 20) {
                    System.out.println("Not Weird");
                }
            }while (loop > 1);
        }

    }