package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args){

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.println("Enter a high number and then a low number. I will sum all of the numbers in between, and give an average of the two numbers.");
        // assign input to variable as int
        System.out.println("High: ");
        int high = scanner.nextInt();
        System.out.println("Low: ");
        int low = scanner.nextInt();

        int start;
        int sum = 0;
        float avg = high+low;

        avg = avg/2;

        for (start = low; start <= high; start = start + 1){
            sum = start + sum;
        }

        System.out.println("The sum is " + sum);
        System.out.println("The average is " + avg);



    }
}
