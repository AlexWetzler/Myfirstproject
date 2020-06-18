/* Alex Wetzler

6/17/20
Import scanner (not neccasary)
Define the height and weight of both person 1 and person 2 and make sure to connect it to the scanner rather than giving it a set amount.
Define the BMI's by dividing the weight by (height*height). Then multiply it all by 703.
Define the second BMI by doing the same exact thing but with person 2's values.
set up an if, else statement to determine what level of weight each person is.
Ex: if (height > BLANK)
{
System.out.println(you are obese)
}
You have to put two if else statements. One for each person.
Finally, print the difference of the two BMI's.

*/

package com.company;
// import scanner
import java.util.Scanner;
public class operators {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //define the height of person 1
        System.out.println("What is the height of the first person?");
        double ione = input.nextDouble();

        //define the weight of person 1
        System.out.println("What is the weight of the first person?");
        double itwo = input.nextDouble();

        //define the height of person 2
        System.out.println("What is the height of the second person?");
        double ithree = input.nextDouble();

        //defines the weight of person 2
        System.out.println("What is the weight of the second person?");
        double ifour = input.nextDouble();

        //define both BMI's
        double BMI = itwo / (ione * ione) * 703;
        double BMI2 = ifour / (ithree * ithree) * 703;

        //this section determines what type of weight class person 1 has. (weight class = obese,underweight, etc.)
        if(BMI >= 30.0)
        {
           System.out.println("Person one is obese");
        } else if(BMI >= 25.0){
            System.out.println("Person one is overweight");
        } else if(BMI >= 18.5){
            System.out.println("Person one is normal");
        } else if(BMI < 18.5){
            System.out.println("Person one is underweight");
        }



        //this section determines what type of weight class person 2 has. (weight class = obese,underweight, etc.)
        if(BMI2 >= 30.0)
        {
            System.out.println("Person two is obese");
        } else if(BMI2 >= 25.0){

            System.out.println("Person two is overweight");
        } else if(BMI2 >= 18.5){

            System.out.println("Person two is normal");
        } else if(BMI2 < 18.5){

            System.out.println("Person two is underweight");
        }
        //after determining the weight class of both people, print the difference
        System.out.println("The difference between the BMI's is:" + (BMI - BMI2));
    }
}