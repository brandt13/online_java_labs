package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 6: 2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        System.out.println();

        int[][] twoDArray = new int[5][5];                              //  (x)
                                                                        //      [0] [1] [2] [3] [4] (y)
        for (int x = 0; x < twoDArray.length; x++){                     //  [0] 3   6   9   12  15
                                                                        //  [1] 6   12  18  24  30
            for (int y = 0; y < twoDArray[x].length; y++){              //  [2] 9   18  27  36  45
                                                                        //  [3] 12  24  38  48  60
                twoDArray[x][y] = (3 * ((y + 1)*(x + 1)) );             //  [4] 15  30  45  60  75

                System.out.print(twoDArray[x][y] + " | ");

            }

            System.out.println();
        }


/*
        int[][] twoDArray = {

                {3,6,9,12,15},
                {6,12,18,24,30},
                {9,18,27,36,45},
                {12,24,36,48,60},
                {15,30,45,60,75}
        };


        for (int x = 0; x < 5; x++){

            for (int y = 0; y < 5; y++){

                System.out.print(twoDArray[x][y]);
                System.out.print(" ");

            }



        }
        */
    }
}
