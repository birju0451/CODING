
class Shapes{
    public void area(){
        System.out.println("display area");
    }
}
class Triangle extends Shapes{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
        
    }
}
class circle extends Shapes{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
public class hierarchialinheritance {
    public static void main(String[] args) {
        
    }
    
}
