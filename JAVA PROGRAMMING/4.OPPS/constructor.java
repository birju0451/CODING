// import java.util.Scanner;

// class Algebra{
//     int a;
//     int b;
//     Algebra(int x,int y){//constructor to be checked
//         System.out.println("constructure to be called");
//         int a=x;
//         int b=y;
//     }
//     int add(){
//         int ans=a+b;
//         return ans;
//     }
//     int sub(){
//         return a-b;
//     }
//     int mul(){
//         return a*b;
//     }
// }
// public class constuctor {
//     public static void main(String[] args) {
//         Algebra obj=new Algebra(int x=5, int y=7);
//         // Scanner sc =new Scanner(System.in);
//         // System.out.println("enter the value of x:");
//         // int x = sc.nextInt();
//         // System.out.println("enter the value of y:");
//         // int y = sc.nextInt();
//         // int result=obj.add();
//         //System.out.println("sum of x and y is :"+result);
//         // sc.close();

//     }
    
// }
import java.util.Scanner;

class Algebra {
    int a;
    int b;

    Algebra(int x, int y) { // Constructor to be checked
        System.out.println("Constructor to be called");
        this.a = x;
        this.b = y;
    }

    int add() {
        int ans = a + b;
        return ans;
    }

    int sub() {
        return a - b;
    }

    int mul() {
        return a * b;
    }
}

public class constructor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //@SuppressWarnings("unused")
        Algebra obj=new Algebra(5, 7);
        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.mul());
        sc.close();
    }
}
