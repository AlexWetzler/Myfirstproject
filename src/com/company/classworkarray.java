/*
Alex Wetzler

import java.util.*
create public static void main
    define a randoms.
    define an int a make it equal random.nextInt(and a range of 5 to 10)
    make a new array that's size equals the int above
    create a for loop that assigns random numbers to each index of the array
    print the the array
    make two more int's called index1 and index 2
    create a do loop that randomizes the index variable's value if they are the same
    make a return spot
    print the final value
create public static int[]swap(int[] rev)
    make a for loop that repeats the amount of times equal to the length of the first array swaps the the
        inside the for loop, switch the letters
    return the new flipped value

 */
package com.company;
import java.util.*; //this imports everything(its better than importing everything seperately)
public class classworkarray {
    public static void main(String [] args){
        Random value = new Random(); //you only need one random since the randoms value never changes
        int timy = value.nextInt(5)+5; //this give a random number between 5 and 10
        int[] myarray = new int[timy];//when timy is in the brackets, myarray's size is random
        for (int i = 0; i < myarray.length; i++){//this loop assigns random numbers from 1 to 100 into each of
            myarray[i] = (value.nextInt(99) + 1);
        }
        System.out.println(Arrays.toString(myarray));
        int indexOne;
        int indexTwo;
        do{//this loop makes it so the index's randomize if they have the same value
            indexOne = value.nextInt(timy);
            indexTwo = value.nextInt(timy);
        }while(indexOne == indexTwo);
        swap(myarray,indexOne,indexTwo);//this allows the array's new value to return to the public static void main
        System.out.println(Arrays.toString(myarray));
    }
    public static int[] swap(int[] A, int i, int i1){
        int temp = A[i];
        A[i] = A[i1];//these lines switch the two index values
        A[i1]=temp;
        return A; //this rerturns the new value to the public static void main
    }
}
