package datatypes_operators.labs;

public class People {                                   // Create object People

    int numberInLine;                                   // Create int numberInLine
    String name;                                        // Create string name

    public People(int numberInLine, String name) {      // Create constructor that takes in two variables, and sets
        this.numberInLine = numberInLine;               // the variables in class People to the variables that the
        this.name = name;                               // constructor takes in
    }

    //   @Override
    public String toString() {                          // Creates method "toString" which returns a String. Variables
        return "People{" +                              // in classs People are printed along with a String
                "numberInLine=" + numberInLine +
                ", name='" + name + '\'' +
                '}';
    }
}
