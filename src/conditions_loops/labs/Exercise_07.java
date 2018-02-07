package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and usig a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        String vowels = "aeiouyAEIOUY";

        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a word, and I will print out the first vowel, as well as the word: ");
        // assign input to variable as int
        String input = scanner.next();

        int i = 0;

        char c;

        while (i < input.length()){
            c = input.charAt(i);
            int x = vowels.indexOf(c);

            if (x >= 0){
                System.out.println("The first vowel is " + c + ", and the word is " + input);
                return;
            }
            i++;
        }

        System.out.println("No vowel was found.");
    }

}

