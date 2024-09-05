package oppsconcept;
class Pen{
    String color;
    String type;
    public void writting(){
        System.out.println("writting something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
}

class student{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //constructor

    //1.non parameterized constructor
    student(){
        System.out.println("construcrot called");
    }

    //2.parameterized constructure
    student(String x,int y){
        this.name=x;
        this.age=y;
        //note :-this.name object ka name hai and x perameter hai jo constructor ke dyare bheja jayega
    }
   //copy constructor

}
public class concept {
    public static void main(String[] args) {
    //    Pen pen1=new Pen();
    //    pen1.color="blue";
    //    pen1.type="gel pen";

    //    Pen pen2=new Pen();
    //    pen2.color="black";
    //    pen2.type="ball pen";

    //    pen1.printcolor();
    //    pen1.writting();

    //    pen2.printcolor();
    //    pen2.writting();
//note this is for parameterized and non parameterized
    student s1=new student("birju",12);
       s1.name="birju";
       s1.age=19;
      s1.printinfo();
//copy constructor
    }  
}
