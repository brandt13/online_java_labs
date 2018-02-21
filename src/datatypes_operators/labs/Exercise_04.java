package datatypes_operators.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 4: Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */


public class Exercise_04 {

    static double total = 0;

    public static void main(String[] args) {

        int[] numbers = new int[10];                    // Creates an array "numbers" which creates 10 spots for ints

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Please enter 10 numbers, and I will add them, then average them --");

        for (int i = 0; i < numbers.length; i++){       //

            System.out.print((i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            total = total + numbers[i];

        }

        System.out.println();
        System.out.println("Total: " + (int)total);

        double average = (total/numbers.length);
        System.out.println("Average: " + average);

    }
}