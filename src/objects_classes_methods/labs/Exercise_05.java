package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 5:
 *
 *      Demonstrate the use of static instance variables. Create a class with at least one static variable
 *      and one non-static variable. Create a few objects of that class and set the values of the variables.
 *      Use System.out.println to demonstrate when the variables are changed.
 *
 */


class StaInsVar{

    int nSvar;
    static int Svar;


    public static void main(String[] args) {

        System.out.println();
        CreateSvar();

        System.out.println("Static Variable is: " + Svar);

        AddToSvar();

        System.out.println("Static Variable is now: " + Svar);

        MultSvar();
        System.out.println("Static Variable is now: " + Svar);
        System.out.println();


        StaInsVar creatensvar = new StaInsVar();

        creatensvar.CreateNSvar();
        creatensvar.ChangeNSVar();
        creatensvar.ChangeNSVarAgain();
        creatensvar.ChangeNSVar();




    }

    public static void CreateSvar(){

        Svar = 10;
    }

    public static void AddToSvar(){

        Svar = Svar + 10;

    }

    public static void MultSvar(){

        Svar = Svar * Svar;
    }

    public void CreateNSvar(){

        nSvar = 35;
        System.out.println("NonStatic Variable is : " + nSvar);

    }

    public void ChangeNSVar(){

        nSvar = 800;
        System.out.println("NonStatic Variable is now: " + nSvar);
    }

    public void ChangeNSVarAgain(){

        nSvar = 82000;
        System.out.println("NonStatic Variable is now: " + nSvar);
    }




}