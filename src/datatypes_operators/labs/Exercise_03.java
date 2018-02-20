package datatypes_operators.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 3: Pig latin
 *
 *      Take in the user's name and print out their name translated to pig latin.
 *      For the purpose of this program, we will say that any word or name can be
 *      translated to pig latin by moving the first letter to the end, followed by "ay".
 *      For example: ryan -> yanray, caden -> adencay
 *
 *      HINT: We will make use of the substring() method.
 */

public class Exercise_03 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter your name and I'll change it to PigLatin: ");
        // assign input to String as 'name'
        String name = scanner.next();   // takes in 'name' input

        char c;                         // creates 'char' variable
        int i = 0;                      // creates counter variable
        String vowels = "aeiouyAEIOUY"; // declares a string of vowels

        while (i < name.length()){      // while 'i' is less than the index length (0,1,2,3,4th letter) of the 'name' input...

            c = name.charAt(i);         // character c equals the character value of counter 'i' within 'name' input
            int x = vowels.indexOf(c);  // int x equals the index number of character c, if character c equals a vowel
                                        // if character c does not equal a vowel, int x = -1

            if (x >= 0){                // if x equals anything above 0, run this code
                System.out.println("Your name in PigLatin is " + name.substring(i) + name.substring(0,i) + "ay.");
                return;                                          // output everything in 'name' string from index-
                                                                 // number 'i' to the end of string
                                                                 // concatenate that to output of everything from index-
                                                                 // number 0 to index number 'i' within 'name' string
            }
            i++;
        }
    }
}


