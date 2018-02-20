package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 3:
 *
 *      Create at least three example classes (class1, class2, class3) that demonstrate comfort
 *      in creating multiple classes with multiple methods, and then call between those methods across classes.
 *      These methods can perform any task, such as getter/setter methods or simple addition/subtraction.
 *      1) Class1 should have the main method.
 *      2) The main method then needs to create an object of class1, class2, class3.
 *      3) The main method should then  call one or more non-static methods in class2 and class3.
 *
 */



class woopWoop {


    public static void main(String[] args) {

        System.out.println();

        woopWoop woopObj = new woopWoop();
        System.out.println("Woop Multiplication Object: " + woopObj.woopMultiply(9, 8));

        heyHey heyObj = new heyHey();
        System.out.println("Hey Addition Object: " + heyObj.heyAdd(5,6));

        yeahYeah yeahObj = new yeahYeah();
        System.out.println("Yeah Subtraction Object: " + yeahObj.yeahSub(10,4));

        woopWoop.woopStaticMultiply();

        heyHey.heyStaticAdd();

        yeahYeah.yeahStaticSub();



    }




    public int woopMultiply(int a, int b){

        return a * b;
    }

    public static void woopStaticMultiply(){

        int x = 30;
        int y = 40;

        System.out.println("WoopStaticMultiplication: " + x*y);


    }



}

class heyHey {

    public int heyAdd(int e, int f){

        return e + f;

    }

    public static void heyStaticAdd(){

        int t = 2;
        int u = 3;
        System.out.println("HeyStaticAddition: " + (t + u));
    }


}

class yeahYeah {

    public int yeahSub(int g, int h){

        return g - h;
    }

    public static void yeahStaticSub(){

        int v = 40;
        int w = 20;
        System.out.println("YeahStaticSubtraction: " + (v - w));

    }
}