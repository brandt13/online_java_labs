package fundamentals.labs;

/**
 * Fundamentals Exercise 4: Area and Perimeter
 *
 *      Write the necessary code to calculate the area and perimeter of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 *      Surface area? Or volume? Circumference == Perimeter?
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

       double area, circumference;

       area = ((3.14*3.14)*3.14) * 5;
       circumference = (3.14*3.14)*2;

       System.out.println("A cylinder has a radius of 3.14 and a height of 5.");
       System.out.println("The volume of the cylinder is " + area + " units squared.");
       System.out.println("The perimeter of the cylinder is " + circumference + " units.");
       System.out.println("");
    }
}
