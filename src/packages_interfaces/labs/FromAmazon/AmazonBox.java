package packages_interfaces.labs.FromAmazon;


import packages_interfaces.labs.FromFedEx.FedExBox;

public class AmazonBox {

    public static void OpenAmazonBox() {
        System.out.println();
        System.out.println("You opened your package from Amazon!");
    }

    protected static void LookInAmazonBox() {

        System.out.println("You looked in the Amazon box.");

    }

    public static void main(String[] args) {

        OpenAmazonBox();
        LookInAmazonBox();

        FedExBox feb = new FedExBox();

        feb.OpenFedExBox();
//      feb.LookInFedExBox();  --- LookInFedExBox() is protected

    }



}
