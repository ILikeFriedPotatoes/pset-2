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
        System.out.println("\nNAME   : " + firstName + " " + lastName );
        System.out.println("GRADE    : " + grade );
        System.out.println("AGE      : " + age );
        System.out.println("HOMETOWN : " + hometown );
        */

        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

         /*
         System.out.print("\nEnter a dollar amount: ");
         double dollarAmount = in.nextDouble();
         double valueRemaining = dollarAmount;
         final double DOLLAR_VALUE = 1.00;
         double isThereADollar = Math.floor(dollarAmount / DOLLAR_VALUE);
         valueRemaining %= DOLLAR_VALUE;
         System.out.printf("\nDOLLARS  : %.0f \n", isThereADollar);
         final double QUARTER_VALUE = 0.25;
         double quarterAmount = Math.floor(valueRemaining / QUARTER_VALUE);
         valueRemaining %= QUARTER_VALUE;
         System.out.printf("QUARTERS : %.0f\n", quarterAmount);
         final double DIME_VALUE = 0.10;
         double dimeAmount = Math.floor(valueRemaining / DIME_VALUE);
         valueRemaining %= DIME_VALUE;
         System.out.printf("DIMES    : %.0f\n", dimeAmount);
         final double NICKEL_VALUE = 0.05;
         double nickelAmount = Math.floor(valueRemaining / NICKEL_VALUE);
         valueRemaining %= NICKEL_VALUE;
         System.out.printf("NICKELS  : %.0f\n", nickelAmount);
         final double PENNY_VALUE = 0.01;
         valueRemaining /= PENNY_VALUE;
         System.out.printf("PENNIES  : %.0f\n", valueRemaining);
         */

        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */

         /*
         System.out.print("\nEnter a dollar amount: ");
         valueRemaining = in.nextDouble();
         double billsUsed = 0;
         double coinsUsed = 0;
         final double TEN_DOLLAR_VALUE = 10.00;
         billsUsed += Math.floor(valueRemaining / TEN_DOLLAR_VALUE);
         valueRemaining %= TEN_DOLLAR_VALUE;
         final double FIVE_DOLLAR_VALUE = 5.00;
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
         */

        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */

         //Delete this variable later
         /*
         System.out.print("\nEnter a number of inches: ");
         valueRemaining = in.nextDouble();
         final double INCHES_TO_MILES_CONVERSION = 63360;
         double numberOfMiles = Math.floor(valueRemaining / INCHES_TO_MILES_CONVERSION);
         System.out.printf("\nMILES  : %.0f" , numberOfMiles);
         valueRemaining %= INCHES_TO_MILES_CONVERSION;
         final double INCHES_TO_YARD_CONVERSION = 36;
         double numberOfYards = Math.floor(valueRemaining / INCHES_TO_YARD_CONVERSION);
         System.out.printf("\nYARDS  : %.0f" , numberOfYards);
         valueRemaining %= INCHES_TO_YARD_CONVERSION;
         final double INCHES_TO_FEET_CONVERSION = 12;
         double numberOfFeet =  Math.floor(valueRemaining / INCHES_TO_FEET_CONVERSION);
         System.out.printf("\nFEET   : %.0f" ,numberOfFeet);
         valueRemaining %= INCHES_TO_FEET_CONVERSION;
         System.out.printf("\nINCHES : %.0f\n" , valueRemaining);
         */

        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */

         /*
         System.out.print("\nEnter a number of centimeters: ");
         double valueRemaining = in.nextDouble();
         final double CENTIMETER_TO_KILOMETERS_CONVERSION = 100000;
         double kilometers = Math.floor(valueRemaining / CENTIMETER_TO_KILOMETERS_CONVERSION);
         System.out.printf("\nKILOMETERS  : %.0f", kilometers);
         valueRemaining %= CENTIMETER_TO_KILOMETERS_CONVERSION;
         final double CENTIMETER_TO_METERS_CONVERSION = 100;
         double meters = Math.floor(valueRemaining / CENTIMETER_TO_METERS_CONVERSION);
         System.out.printf("\nMETERS      : %.0f", meters);
         valueRemaining %= CENTIMETER_TO_METERS_CONVERSION;
         System.out.printf("\nCENTIMETERS : %.0f\n", valueRemaining\n);
         */

        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */

         System.out.print("\nEnter a diameter: ");
         double diameter = in.nextDouble();
         double areaOfCircle = Math.PI * Math.pow(diameter / 2, 2);
         double circumference = Math.PI * diameter;
         System.out.printf("\nAREA          : %.2f", areaOfCircle);
         System.out.printf("\nCIRCUMFERENCE : %.2f\n", circumference);

        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */

         System.out.print("\nEnter a length: ");
         double length = in.nextDouble();
         System.out.print("Enter a width: ");
         double width = in.nextDouble();
         double rectangleArea = length * width;
         System.out.printf("\nAREA      : %.2f", rectangleArea);
         double rectanglePerimeter = (2 * length) + (2 * width);
         System.out.printf("\nPERIMETER : %.2f", rectanglePerimeter);
         double diagonal = Math.hypot(width, length);
         System.out.printf("\nDIAGONAL  : %.2f\n", diagonal);

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
