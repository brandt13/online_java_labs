package packages_interfaces.labs;

import packages_interfaces.labs.FromAmazon.AmazonBox;
import packages_interfaces.labs.FromFedEx.FedExBox;


/**
 * Packages Exercise 1: Protected modifier
 *
 *      1) Within this package, create two new packages.
 *      2) Create a new Java class in each package.
 *      3) Create at least two methods in each class, with at least one with the protected access modifier
 *      4) Demonstrate how the the protected access modifier restricts access from package to package
 *
 */


class Packages {

    public static void main(String[] args) {

        AmazonBox ab = new AmazonBox();

        ab.OpenAmazonBox();
//      ab.LookInAmazonBox();       --- LookInAmazonBox() is protected

        FedExBox feb = new FedExBox();

        feb.OpenFedExBox();
//      feb.LookInFedExBox();       --- LookInFedExBox() is protected
    }



}