package inheritance.labs;

import java.util.Scanner;

/**
 * Inheritance Exercise 1:
 *
 *      1) Create one super class Class1 and two subclasses Class2 and Class3.
 *          -Class2 should extend Class1.
 *          -Class3 should extend Class2.
 *      2) Each class should have at least two instance variable, all private.
 *      3) Create getters and setters for all instance variables and demonstrate setting superclass
 *          variables from a subclass
 *      4) Demonstrate the use of (non getter and setter) methods in a superclass from a subclass.
 *      5) Add constructors to each class and demonstrate the use of a superclass constructor
 *          from a subclass.
 *      6) Demonstrate constructor overloading and the use of the "super" keyword.
 *      7) Demonstrate method overloading.
 *
 *      NOTE: We encourage you to be creative and try to think of an example of your own for this
 *       exercise but if you are stuck, some ideas include:
 *
 *       - A Vehicle superclass, with Truck and Motorcycle subclasses.
 *       - A Restaurant superclass, with Gourmet and FastFood subclasses.
 *
 *
 */

class Candy {

    static int calories;
    static int numberOfCandyBits;
    static String candyName;
    static String[] contents;

    public Candy(int calories, String candyName) {
        this.calories = calories;
        this.candyName = candyName;
    }

    public Candy (){}

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();


        Candy crunch = new Candy(120, "Crunch");
        System.out.println("Calories in a " + candyName + ": " + calories);

        Bar takeFive = new Bar();

        takeFive.eatTakeFive();

//      Bar snickers = new Bar(240, "Snickers");
//      System.out.println("You're eating a lot of candy. This time you ate a " + candyName + ", which has " + calories + " calories.");

        String[] snickers = {" nougat", " caramel"," chocolate"," peanuts"};


        System.out.print("Snickers ingredients: ");
        for (int i = 0; i < 4; i++)
            System.out.print(snickers[i]);

        System.out.println();
        System.out.println();

        System.out.print("Enter the ingredients in a Mr. Goodbar: ");
        String[] mrgoodbar = {scanner.next(), scanner.next(), scanner.next()};

        System.out.println();
        System.out.print("Mr. Goodbar ingredients: ");

        for (int i = 0; i < 3; i++)
            System.out.print(mrgoodbar[i] + ", ");


    }




}

class Bar extends Candy {

    private int calsPerBar;
    private String barName;
    private int barContentsVar;
    private String[] barContents = new String[barContentsVar];

    public void eatTwix() {
        setBarName("Twix");
        System.out.println("Mmm! You ate a " + barName + "! It was good. :)");
    }

    public void eatTakeFive() {

        Candy takeFive = new Candy(200, "Take Five");

        System.out.println("Mmm! You ate a " + candyName + ", which contained " + calories + " calories.");

    }

    // Constructor:

    public Bar(int calories, String candyName, int calsPerBar, String barName) {
        super(calories, candyName);
        this.calsPerBar = calsPerBar;
        this.barName = barName;
    }

    public Bar(int calories, String candyName) {
        super(calories, candyName);
        this.calsPerBar = calsPerBar;
        this.barName = barName;
    }

    public Bar(String[] barContents) {

        this.barContents[barContentsVar] = barContents[barContentsVar];
    }

    public Bar(){}


//    public Bar(String peanuts, String nougat, String caramel, String chocolate){}



    // Getters & Setters:

    public int getCalsPerBar() {
        return calsPerBar;
    }

    public void setCalsPerBar(int calsPerBar) {
        this.calsPerBar = calsPerBar;
        super.calories = calsPerBar;
    }

    public String getBarName() {
        return barName;
    }

    public void setBarName(String barName) {
        this.barName = barName;
        super.candyName = barName;
    }

    public String[] getBarContents() {
        return barContents;
    }

    public void setBarContents(String[] barContents) {
        this.barContents = barContents;
        super.contents = barContents;
    }




}

class Bits extends Candy {

    private int calsPerBit;
    private int numOfBits;
    private String bitsName;


    public void eatReesesPieces(){

        setBitsName("Reese's Pieces");
        setNumOfBits(18);

        System.out.println("Mmm! You ate " + numOfBits + " " + bitsName + ". Tasty!");

    }

    // Constructor:

    public Bits(int Calories, String candyName, int calsPerBit, int numOfBits, String bitsName) {
        super(Calories, candyName);
        this.calsPerBit = calsPerBit;
        this.numOfBits = numOfBits;
        this.bitsName = bitsName;
    }



    // Getters & Setters:

    public int getCalsPerBit() {
        return calsPerBit;
    }

    public void setCalsPerBit(int calsPerBit) {
        this.calsPerBit = calsPerBit;
        super.calories = calsPerBit;
    }

    public String getBitsName() {
        return bitsName;
    }

    public void setBitsName(String bitsName) {
        this.bitsName = bitsName;
        super.candyName = bitsName;
    }

    public int getNumOfBits() {
        return numOfBits;
    }

    public void setNumOfBits(int numOfBits) {
        this.numOfBits = numOfBits;
        super.numberOfCandyBits = numOfBits;
    }




}

