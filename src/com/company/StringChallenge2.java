/* Alex Wetzer

import scanner
make a public static void main
    ask user for how many words they want divided
    define T, define input, create the array
    Ask the user for "T" many words. make sure to specify the constraints (its length)
    create a for loop that allows the user to write every word
    create another array
    create newWord[i] = divided(words[i]); so the public static String can return the new word value
    print the new word
make public static String this is a return method required by the program
    Goal:break up every word into even letters and odd letters.
    define evenword and make a for loop that picks out the even letters
    define oddword and make a for loop that picks out the odd letters
    return evenword + " " + oddword

 */
package com.company;
import java.util.Scanner;
public class StringChallenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many words would you like to divide? (give an integer between 1 and 10");
        int T = input.nextInt(); //this is the line of code that takes the input from the user
        String[] words = new String[T];
        System.out.println("Please give " + T + " words that is atleast 2 characters and less than or equal to 10000");
        for (int i = 0; i < words.length; i++){ //this loop takes all the input words from the user and adds it to the array
            words[i] = input.next();
        }
        System.out.println();
        String[] newWord = new String[words.length];
        for (int i = 0; i < words.length; i++){ //this loop prints the end result (the divided up word(s))
            newWord[i] = divided(words[i]);
            System.out.println(newWord[i]);
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
