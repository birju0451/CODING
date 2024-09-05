package oppsconcept;
//polymorphism,poly mean many and morphism means forms 
//these are two type 
//1.run time polymorphism(will study in inheritance) 
//2.compiletime polymorphism:-function overloading  note:-function name is same but work is diffrent 
// it is called function overloading or method overloading 
/*
 * #rules of polymorphism
 * have diffrenciating factor
 *  return type should be diffrent for diffrent-diffrent method
 * if retun type is same then parameter should be diffrent and vice versa
 * if i use same return type then another type type of parameter will be used with together
 * 
 */
class student{
    String name;
    int age;
    public void printinfo(String name){
        System.out.println(name);
    }

    public void printinfo(int age){
        System.out.println(age);
    }

    public void printinfo(String name2 ,int age){
        System.out.println(name2 +" "+ age);
    }
}
public class polymorphism {
    public static void main(String[] args) {
        student s1=new student();
        s1.name="aman";
        s1.age=15;

        s1.printinfo(s1.name,s1.age);
    }
    
}
