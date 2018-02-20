package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 2:
 *
 *      Create a class that demonstrates the following: (all methods below can be in the same class)
 *
 *      1) A static method that calls another static method.
 *      2) A static method that calls a non-static method.
 *      3) A non-static method1 that calls another non-static method2, but this time method2 should return a value to method1.
 *      4) A non-static method1 that calls another non-static method2 and passes a value to method2.
 */


class MethodTest {



    public static void main(String[] args) {

        StaticMethod();                             // Answer to (1)

        StaticMethodCallingNonStaticMethod();       // Answer to (2)

        MethodTest Answer3 = new MethodTest();      // Answer to (3)
        Answer3.NSMethod_1();

        MethodTest Answer4 = new MethodTest();      // Answer to (4)
        Answer4.NSMPass_1();




    }



    // (1) ----------------------------------------------- (1)

    public static void StaticMethod(){          // For Answer 1, we create 2 static methods, SM and SMC.
                                                // In SMC, we print "Answer 1 etc...", then call SMC by
        StaticMethodCall();                     // "calling" SMC inside SM. Then, we "call" SM in the main method.

    }

    public static void StaticMethodCall() {

        System.out.println();
        System.out.print("Answer 1: ");
        System.out.println("StaticMethod called StaticMethodCall");

    }

    // (1) ----------------------------------------------- (1)

    // (2) ----------------------------------------------- (2)

    public static void StaticMethodCallingNonStaticMethod(){

        MethodTest NSMobj_2 = new MethodTest();         // For answer 2, we create 2 methods, SMCNSM and NSMTC.
        NSMobj_2.NonStaticMethodToCall();               // Static methods must create objects to call nonStaticMethods.
                                                        // We create an object inside SMCNSM called NSMobj_2,
                                                        // (NonStaticMethodObject_answer2).
                                                        // Using NSMobj_2, we "call" nonStaticMethod NSMTC,
    }                                                   // which prints "Answer 2...etc."


    public void NonStaticMethodToCall(){

        System.out.println();
        System.out.print("Answer 2: ");
        System.out.println("StaticMethodCallingNonStaticMethod called NonStaticMethod");

    }

    // (2) ----------------------------------------------- (2)

    // (3) ----------------------------------------------- (3)
    public void NSMethod_1(){

        System.out.println();
        System.out.print("Answer 3: ");
        System.out.println("Returned value of " + NSMethod_2());

    }                                           // For answer 3, we have nonStaticMethod_1 calling nSM_2 that
                                                // returns an int variable. To make this happen, we must create an
    public int NSMethod_2(){                    // object in the main method, "Answer3", since the main method, which
                                                // is static, must create an object to make nonStatic methods run.
        return 4;                               // Using "Answer3.NSMethod_1();" runs NSMethod_1, which prints
    }                                           // "Ans 3: etc." plus NSMethod_2, which returns an int, which is 4

    // (3) ----------------------------------------------- (3)

    // (4) ----------------------------------------------- (4)

    public void NSMPass_1(){                    // For answer 4, we are passing variables from nonStaticMethodPass_1 to
                                                // nSMPass_2, then printing the values of the variables in nSMPass_2.
        MethodTest nsmpass = new MethodTest();  // We create an object inside NSMPass_1 called nsmpass, so that we can
        nsmpass.NSMPass_2("Waffles", 23);       // pass variables "Waffles" and 23 to the parameters of NSMPass_2.
                                                // In NSMPass_2's parameters, we tell NSMP_2 that it will accept a string
    }                                           // and then an int. nsmpass.NSMPass_2("Waffles", 23); gives NSMP_2 these
                                                // variables. NSMPass_2 then prints "Ans 4: etc..." + parameter variable
                                                // + parameter variable. We then create an Answer4 obj in the main method,
                                                // as Static methods must use objects to make nonStatic methods run.

    public void NSMPass_2(String passString, int noom){

        System.out.println();
        System.out.println("Answer 4: Passed value to NonStaticMethodPass_2: " + passString + " " + noom);

    }

    // (4) ----------------------------------------------- (4)

}