package oppsconcept;
//about constructor 
//1.constructor name should be class name
//2.constructor can call only one time
//3.it is three type :-parameterized constructor,non parameterized and copy constructor

class student{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    student(student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    student(){
        //this is for first constructor
        //by default nahi call ho raha tha islye ye empty constructor define kiye hai
        
    }
}
public class copyconstructor {
   public static void main(String[] args) {
    student s1=new student();
    s1.name="aman";
    s1.age=23;

    student s2=new student(s1);
    s2.printinfo();

   } 
}
