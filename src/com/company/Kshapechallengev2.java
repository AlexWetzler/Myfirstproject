/* Alex Wetzler
make a new char that equals 65.
create a for loop that repeats 7 times
    within that loop, create another one that prints letters that reduce by one each time
create another for loop that repeats 7 times
    within that loop, create yet another one that prints letters that reduce by one each time
    the only difference with this one is that it goes the other way

 */

package com.company;

public class Kshapechallengev2 {
    public static void main(String[] args) {

        char letter = 65; //this has to be equal to 65 or else you'll get weird symbols/characters since the alphabet starts at 65

        for (int Top = 6; Top > 0; Top--) { //you need a for loop in a for loop
            for (int i = 0; i < Top; i++) {
                System.out.print((char) (letter + i) + " ");
            }
            System.out.println();
        }
        for (int Top = 0; Top < 7; Top++) { //this part is very similar to the part above. the only difference is that it goes the other way
            for (int i = 0; i < Top; i++) {
                System.out.print((char) (letter + i) + " ");
            }
            System.out.println();
        }
    }
}

