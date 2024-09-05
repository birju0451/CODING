package oppsconcept;
/*
 * inheritance means access the property of one class to another class
 * type of inheritance 
 * 1.single level inheritance
 * in the single level inheritance below the parent class one child class is present 
 * 2.multilevel inheritance
 * note:-multiple inheritance not exist in java in place of multilevel we will use interface 
 * 3.hierarchial inheritance
 * from one base class multiple derived classess or subclass
 */

class Shapes {
    String color;
}

class Triangle extends Shapes {
    // Constructor of Triangle class
    Triangle() {
        // Print the color when the Triangle object is created
        System.out.println(this.color);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}
