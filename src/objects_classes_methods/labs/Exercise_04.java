package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 4:
 *
 *      Demonstrate method overloading with at least three overloaded methods.
 *
 */


class OverloadMethod{

    int a; int b; int c; int e;
    double d; double f;
    String yay; String hey;

    public static void main(String[] args) {

        System.out.println();
        System.out.println(Multiply(8,10));
        System.out.println(Multiply(10,20,30));

        OverloadMethod intStringInt = new OverloadMethod();
        System.out.println(intStringInt.IntString(8));

        OverloadMethod intStringString = new OverloadMethod();
        System.out.println(intStringString.IntString("yayyyy"));

        System.out.println(DoubleIntString(44.44, 55.55));
        System.out.println(DoubleIntString(4,7));
        System.out.println(DoubleIntString("beepBoop"));
        System.out.println(DoubleIntString("beepBoop ","sheepShoop"));


    }

    public static int Multiply(int a, int b){
        System.out.print("two ints multiplied in Multiply: ");

        return a * b;

    }

    public static int Multiply(int a, int b, int c){
        System.out.print("three ints multiplied in Multiply: ");

        return a * b * c;

    }

    public int IntString(int a){
        System.out.print("int in IntString: ");

        return a;

    }

    public String IntString(String yay){
        System.out.print("string in IntString: ");
        return yay;

    }

    public static double DoubleIntString(double d, double f){
        System.out.print("added doubles in DoubleIntString: ");
        return d + f;
    }

    public static int DoubleIntString(int e, int a){
        System.out.print("added ints in DoubleIntString: ");
        return e + a;
    }

    public static String DoubleIntString(String hey, String yay){
        System.out.print("concatenated strings in DoubleIntString: ");
        return hey + yay;
    }

    public static String DoubleIntString(String hey){
        System.out.print("string 'hey' in DoubleIntString: ");
        return hey;
    }





}

