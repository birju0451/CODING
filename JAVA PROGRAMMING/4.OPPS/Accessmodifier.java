public class Accessmodifier {
    public String str_1="i am a public member";
    void printfromclass(){
        System.out.println("within class");
    }
    public static void main(String[] args) {
        Accessmodifier obj=new Accessmodifier();
        System.out.println(obj.str_1);
    }
}
