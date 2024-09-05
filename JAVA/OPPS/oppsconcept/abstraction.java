/*
 * An abstract class must be declered with abstract keyword.
 * it can hava abstract and non abstract method
 * it can not be instantiated.
 * it can have constructor and static methods also .
 * it can have final method which will focus the subclass not to change the body of the method
 */
package oppsconcept;
abstract class Animal{
   abstract void walk();
    Animal(){
        System.out.println("you are creating a animal ");
    }
   public void eat(){
    System.out.println("Animal eats");
   }
}
class Horse extends Animal{
    Horse({
        System.out.println("created a horse absrtact ");
    })
public void walk(){
    System.out.println("walk on 4 legs");
}
}
class chicken extends Animal{
    public void walk(){
        System.out.println("walk in 2 legs");
    }
}
public class abstraction {
    public static void main(String[] args) {
        Horse horse=new Horse();
        // horse.walk();
        // horse.eat();
    }
}
//