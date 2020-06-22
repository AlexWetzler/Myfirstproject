/* Alex Wetzer

import scanner
make a public static void main and define T, define input
    make a do while loop that asks how many words will be divided while T <2 and t>10
    make a new string named dividedword
    start a for loop that will repeat the number of times equal to T
        make a while loop within the for loop that asks the user to give a word between 1 and 10000
        make dividedWord = divided(dividedWord); so that the main can receave the return
        print the return value
make public static String this is a return method required by the program
    Goal:break up every word into even letters and odd letters.
    define evenword and make a for loop that picks out the even letters
    define oddword and make a for loop that picks out the odd letters
    return evenword + " " + oddword

 */
package com.company;
import java.util.Scanner;
public class StringsChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = 0;
        //This asks the user how many words they would like to divide when t<2 and t<10
        do{
            System.out.println("How many words would you like to divide?(give an integer between 1 and 10)");
            T = input.nextInt();
        }while (T <1 || T >10);
        String dividedWord="";
        //this loop will repeat for the given value of T
        //this will enable the user to input multiple words
        for(int wordcount = 0; wordcount < T; wordcount++) {
            //very similar to the other while loop.
            do {
                System.out.println("Please give a word.");
                dividedWord = input.next();
                break;
                //this makes it so the word length can't exceed 10000
            } while (dividedWord.length() >= 2 || dividedWord.length() <= 10000);
            //this makes dividedword = the return value
            dividedWord = divided(dividedWord);
            System.out.println(dividedWord);
        }
    }
    public static String divided(String userWord) {
        String evenword = "";
        //this for loop picks out the even letters in every word
        for (int even = 1; even < userWord.length(); even += 2) {
            char temp = userWord.charAt(even);
            evenword = evenword + temp;
        }
        String oddWord = "";
        //this for loop does the same thing as the one above, but picks out the odd letters.
        for (int odd = 0; odd < userWord.length(); odd += 2) {
            char temp = userWord.charAt(odd);
            oddWord = oddWord + temp;
        }
        //by returning this, it sets dividedWord's value to evenword + " " + oddWord in the public static void main
        return evenword + " " + oddWord;}
    }
