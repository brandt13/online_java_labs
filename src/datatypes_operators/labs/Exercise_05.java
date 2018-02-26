package datatypes_operators.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 5: More arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_05{

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        Scanner scanner = new Scanner(System.in);

        int i;

        do {

            System.out.println("Enter a between 1 and 10 to see its index number in an array: ");
            i = scanner.nextInt();

        } while (i < 1 || i > 10);

        System.out.println(array[i - 1]);

    }
}