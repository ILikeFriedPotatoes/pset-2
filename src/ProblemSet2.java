/**
 * Problem Set 2.
 *
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         *
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */

         /*
         System.out.print("\nEnter your first name: ");
         String firstName = in.next();
         System.out.print("Enter your last name: ");
         String lastName = in.next();
         System.out.print("Enter your grade: ");
         short grade = in.nextShort();
         System.out.print("Enter your age: ");
         int age = in.nextInt();
         in.nextLine();
         System.out.print("Enter your hometown: ");
         String hometown = in.nextLine();
         System.out.println("\nNAME     : " + firstName + " " + lastName);
         System.out.println("GRADE    : " + grade);
         System.out.println("AGE      : " + age);
         System.out.println("HOMETOWN : " + hometown + "\n");
         */

        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

         System.out.print("\nEnter a dollar amount: ");
         double dollarAmount = in.nextDouble();
         double valueRemaining = dollarAmount;
         final double DOLLAR_VALUE = 1.00;
         final double QUARTER_VALUE = 0.25;
         final double DIME_VALUE = 0.10;
         final double NICKEL_VALUE = 0.05;
         final double PENNY_VALUE = 0.01;
         double isThereADollar = Math.floor(dollarAmount / DOLLAR_VALUE);
         valueRemaining %= DOLLAR_VALUE;
         System.out.printf("DOLLARS  : %.0f \n", isThereADollar);
         double quarterAmount = Math.floor(valueRemaining / QUARTER_VALUE);
         valueRemaining %= QUARTER_VALUE;
         System.out.printf("QUARTERS : %.0f\n", quarterAmount);
         double dimeAmount = Math.floor(valueRemaining / DIME_VALUE);
         valueRemaining %= DIME_VALUE;
         System.out.printf("DIMES    : %.0f\n", dimeAmount);
         double nickelAmount = Math.floor(valueRemaining / NICKEL_VALUE);
         valueRemaining %= NICKEL_VALUE;
         System.out.printf("NICKELS  : %.0f\n", nickelAmount);
         valueRemaining /= PENNY_VALUE;
         System.out.printf("PENNIES  : %.0f\n", valueRemaining);

        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */

         System.out.print("\nEnter a dollar amount: ");
         valueRemaining = in.nextDouble();
         final double FIVE_DOLLAR_VALUE = 5.00;
         final double TEN_DOLLAR_VALUE = 10.00;
         double billsUsed = 0;
         double coinsUsed = 0;
         billsUsed += Math.floor(valueRemaining / TEN_DOLLAR_VALUE);
         valueRemaining %= TEN_DOLLAR_VALUE;
         billsUsed += Math.floor(valueRemaining / FIVE_DOLLAR_VALUE);
         valueRemaining %= FIVE_DOLLAR_VALUE;
         billsUsed += Math.floor(valueRemaining / DOLLAR_VALUE);
         valueRemaining %= DOLLAR_VALUE;
         coinsUsed += Math.floor(valueRemaining / QUARTER_VALUE);
         valueRemaining %= QUARTER_VALUE;
         coinsUsed += Math.floor(valueRemaining / DIME_VALUE);
         valueRemaining %= DIME_VALUE;
         coinsUsed += Math.floor(valueRemaining / NICKEL_VALUE);
         valueRemaining %= NICKEL_VALUE;
         coinsUsed += (valueRemaining / PENNY_VALUE);
         System.out.printf("\nBILLS : %.0f", billsUsed);
         System.out.printf("\nCOINS : %.0f\n", coinsUsed);

        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */



        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */



        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */



        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */



        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */



        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */



        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */



        in.close();
    }
}
