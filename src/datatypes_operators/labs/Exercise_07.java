package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 7: Irregular Arrays
 *
 *      Create and populate an irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        System.out.println();
        int[][] JaggedArray = new int[4][];

        JaggedArray[0] = new int[7];
        JaggedArray[1] = new int[12];
        JaggedArray[2] = new int[20];
        JaggedArray[3] = new int[13];

        for (int x = 0; x < JaggedArray.length; x++){
            for (int y = 0; y < JaggedArray[x].length; y++){

                JaggedArray[x][y] = 1 + y;
            }

        }

        for(int[] x : JaggedArray){
            for(int y : x){

                System.out.print(y + " ");

            }

            System.out.println();

        }



    }
}
