package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 7: Irregular Arrays
 *
 *      Create and populate an irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_07 {

    public static void populatePeople(int numPeople){           // Create method populatePeople which takes in a new int, numPeople

        People[] people = new People[numPeople];                // Create an array called people out of the People object/class
                                                                // which has an index length of variable numPeople
        for (int i = 0; i < numPeople; i++){

            People brandt = new People(i+1, "brandt");          // Create a new instance of class/object People called brandt,
                                                                // passing an int and a string to the constructor method as it is required

            people[i] = brandt;                                 // Array 'people' at the index number 'i' is populated with the
                                                                // contents of object 'brandt'


        }

        for (People person : people){                           // A new instance of People object 'person' is created. For each index element
                                                                // inside array 'people', the person instance will call the .toString
            System.out.println(person.toString());              // method inside of People object, which will print out each
                                                                // index element of array 'people'. This will be controlled by the
        }                                                       // integer that method populatePeople takes in

    }



    public static void main(String[] args) {

        System.out.println();
        populatePeople(9);                                      // populatePeople is called, which will create an array with
                                                                // [integer numPeople] number of index elements.
        System.out.println();
        int[][] jaggedArray = new int[4][];

        jaggedArray[0] = new int[7];
        jaggedArray[1] = new int[12];
        jaggedArray[2] = new int[20];
        jaggedArray[3] = new int[13];

        for (int x = 0; x < jaggedArray.length; x++){
            for (int y = 0; y < jaggedArray[x].length; y++){

                jaggedArray[x][y] = 1 + y;
            }

        }

        for(int[] x : jaggedArray){
            for(int y : x){

                System.out.print(y + " ");

            }

            System.out.println();

        }
    }
}
