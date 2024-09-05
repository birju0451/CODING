package bank;
class Account{
    public String name;
    protected String Email;
    private String password;

    public String getEmail() {
        return this.Email;
    }
    //getter ans setter
    public String getpassword(){
        return this.password;
    }

    public void setpassword(String pass){
        this.password = pass;
    }
}
public class Bank {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.name = "apana college";
        acc1.Email = "apnacollege@gmail.com";  
        //acc1.password="abcd";
        acc1.setpassword("abcd");
        System.out.println(acc1.getpassword());
    }
}
