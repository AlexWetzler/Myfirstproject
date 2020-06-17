package com.company;

import java.util.Scanner;
public class Peter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Say something!");
        String phrase = sc.nextLine();
        int indexOf = phrase.indexOf(" ");
        String firstword = phrase.substring(0, indexOf + 1);
        char letter = ' ';
        int count = 0;
        for (int all = 0; all < firstword.length(); all++) {
            letter = firstword.charAt(all);
            if (letter != ' ') {
                count++;

                String temp = firstword.substring(all + 1);
                indexOf = temp.indexOf(letter);
                while (indexOf >= 0) {
                    count++;
//                    System.out.println(temp + " " + indexOf);
                    firstword=firstword.replace(letter, ' ');
                    temp = temp.substring(indexOf);
                    indexOf = temp.indexOf(letter);
                }
                firstword=firstword.replace(letter, ' ');
//                System.out.println(letter.replace('e', ' '));
                System.out.println(letter + " " + count);
                count = 0;
            }

        }
        }
    }