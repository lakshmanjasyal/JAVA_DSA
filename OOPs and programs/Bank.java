class Account{
    public String name;
    protected String email;
    private String password;

    // getters and setters
    public String getpass(){
        return this.password;
    }
    public void setPass(String pass){
        this.password=pass;
    }
}
public class Bank {
    public static void main(String[] args) {
        Account ac1=new Account();
        ac1.name="Narayan";
        ac1.email="Narayan@gmail.com";
        ac1.setPass("abcd");
        System.out.println(ac1.getpass());
    }
}
