
public class App {
    public String str_1="i am a public member";
    void printfromclass(){
        System.out.println("within class :"+ " "+str_1);
    }
    public static void main(String[] args) {
        App obj = new App();
        obj.printfromclass();
        System.out.println("within class :"+obj.str_1);

        App2 obj2= new App2();
        obj2.printoutsideofClass();
    }
}
class App2 {
    void printoutsideofClass(){
        App obj=new App();
        System.out.println("witin the package,outside of class"+obj.str_1);

    }
}
