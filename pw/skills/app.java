package pw.skills;

public class app {
    public String str_1="i am a public memebr";

    void printfromclass(){
        System.out.println("within class"+str_1);;
    }
    public static void main(String[] args) {
        app obj =new app();
        obj.printfromclass();
        System.out.println(obj.str_1);
    }
    
}
