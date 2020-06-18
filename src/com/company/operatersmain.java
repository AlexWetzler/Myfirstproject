/* Alex Wetzer

6/17/20
import scanner. (make sure to add Scanner console = new Scanner(System.in); after you create public static void main
make a double and two ints. (mealPrice, tipPercent, taxPercent)
make sure to link the variables to the scanner by doing console.next(Int/Double)
make solve()
make "static void solve()" and link the variables to it by using "solve()" in public static void main
print the values of each variable/input (extra)
make two new double called finaltip and finaltax that equal the actual tax and tip of the original price (not percents)
make a double called total. total equals the original price plus tax plus tip.
print the total(make sure to add Math.round to it)(it has to be rounded)
*/
package com.company;
import java.util.Scanner;
public class operatersmain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //establish three variables (one double two ints)
        double meal_Price;
        int tip_Percent;
        int tax_Percent;
        //These 3 lines make it so the first input equals the meal_price, the second equals the tip_percent, and the third equals the tax_percent
        meal_Price = console.nextDouble();
        tip_Percent = console.nextInt();
        tax_Percent = console.nextInt();
        //add this to link the variablese to the static void below
        solve(meal_Price, tip_Percent, tax_Percent);
    }

    static void solve(double Price, int Tip, int Tax){
        //This is (extra)
        System.out.println("The meal costs: " + Price);
        System.out.println("The tip percent is: " + Tip);
        System.out.println("The tax percent is: " + Tax);
        //This calculates the tup percent and tax percent into normal numbers
        double finaltip = (double) Tip / 100 * Price;
        double finaltax = (double) Tax / 100 * Price;
        //Calculate the total by adding up the original price and the final tax and tip
        double total = Price + finaltax + finaltip;
        //Print the total
        System.out.println("The total is: " + Math.round(total) +" dollars " + "(rounded)");
    }
}

