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
class EquilateralTriangle extends Triangle{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
        
    }
}


public class multilevelinheritance {
   public static void main(String[] args) {
    
   } 
}
