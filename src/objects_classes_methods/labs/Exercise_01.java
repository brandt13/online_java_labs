package objects_classes_methods.labs;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Objects, Classes and Methods Exercise 1:
 *
 *      Create three classes, all of which can be inside this file. The first class (the controller)
 *      should have the main method. The main method should create at least two objects using the
 *      constructors of the second and third class. The second and third class should each have at least
 *      three instance variables that should be set using the constructor when an object is created.
 *
 *      Once the objects are created, try changing the values of some of the instance variables.
 *
 *      Think about some of the examples we have seen from the lectures or Confluence Docs.
 *
 *      Be creative. Have some fun. Using Java objects you can model just about anything you want.
 *      Cars, animals, poker games, sports teams, trees, beers, people and so on.
 */


//Feel like I'm doing this backwards

class CasinoGameController{                         //Creates "Casino Game" controller class

    public static void main(String args[]){         //main method

        Bets rouletteBets = new Bets(10,100, 45);  // <-- Creates parameterized obj rouletteBets
                                                                            // (minBet, maxBet & playerBet) for bets
                                                                            // involved with roulette

        People roulettePeople = new People();
        // ^ Creates non-parameterized object roulettePeople for people involved with roulette

        System.out.println();
        System.out.println("Hey! Welcome to the Roulette table!");

        rouletteBets.playerBet = 45;
        roulettePeople.dealerName = "Kramer";
        roulettePeople.playerBet = rouletteBets;
        roulettePeople.playerSeat = 2;
        roulettePeople.playerName = "Jerry";

        System.out.println();
        System.out.println("The dealer's name is " + roulettePeople.dealerName);
        System.out.println(roulettePeople.playerName + " sits at seat " + roulettePeople.playerSeat
                            + " and bets $" + rouletteBets.playerBet);

        rouletteBets.playerBet = 80;
        roulettePeople.dealerName = "Niles";
        roulettePeople.playerSeat = 4;
        roulettePeople.playerName = "Frasier";

        System.out.println();
        System.out.println("Now, the dealer's name is " + roulettePeople.dealerName);
        System.out.println("Now, " + roulettePeople.playerName + " sits at seat " + roulettePeople.playerSeat
                            + " and bets $" + rouletteBets.playerBet);

        // seeing if I can get user input to work:

        System.out.println();
        Scanner scanner = new Scanner(System.in);           // create scanner input
        System.out.print("Enter the dealer's name: ");      // prompt user for dealer's name
        roulettePeople.dealerName = scanner.next();         // make roulettePeople.dealerName equal to scanner input

        System.out.println();
        System.out.print("Enter the player's name: ");      // prompt user for player's name
        roulettePeople.playerName = scanner.next();         // make roulettePeople.playerName equal to scanner input

        System.out.println();
        System.out.print("Enter the player's bet: ");       // prompt user for player's name
        rouletteBets.playerBet = scanner.nextInt();         // make rouletteBets.playerBet equal to scanner input

        System.out.println();
        System.out.print("Enter the player's seat number: ");   // prompt user for player's seat
        roulettePeople.playerSeat = scanner.nextInt();          // make roulettePeople.playerSeat equal to scanner input

        System.out.println();
        System.out.println("Now, the dealer's name is " + roulettePeople.dealerName);
        System.out.println("Now, " + roulettePeople.playerName + " sits at seat " + roulettePeople.playerSeat
                            + " and bets $" + rouletteBets.playerBet);


        // Sweet! It works!

    }

}

class Bets{                                 // Creates "Bets" class

    public int minBet;                      // Creates public int "minBet"
    public int maxBet;                      // Creates public int "maxBet"
    public int playerBet;                   // Creates public int "playerBet"

    Bets(int minBet, int maxBet, int playerBet){        // Creates "Bets" constructor

        this.minBet = minBet;                           // Makes var minBet in "Bets" class equal to the parameter
                                                        // "minBet" of "Bets" constructor
        this.maxBet = maxBet;                           // Ditto "maxBet"
        this.playerBet = playerBet;                     // Ditto "playerBet"

    }

}

class People{

    public String dealerName;                      // Creates public String "dealerName"
    public String playerName;                      // Creates public String "playerName"
    public int playerSeat;                         // Creates public int "playerSeat"
    public Bets playerBet;

    People(){} // Technically not needed, Java will create this blank constructor when compiling
/*
    This worked for class Bets{}, calling constructor People without parameters (works for this too with parameters)

    People(String dealerName, String playerName, int playerSeat){

        this.dealerName = dealerName;
        this.playerName = playerName;
        this.playerSeat = playerSeat;

    }
*/

}





