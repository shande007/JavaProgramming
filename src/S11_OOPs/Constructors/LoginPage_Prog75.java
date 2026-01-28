package S11_OOPs.Constructors;

public class LoginPage_Prog75 {
    String email;
    int a;

    LoginPage_Prog75(){
        System.out.println("DC - LoginPage_Prog75");
    }

    public LoginPage_Prog75(String email,String password) {
        this.email = email;
        this.password = password;
    }

    String password;

    public LoginPage_Prog75(String email, String password,String submitButton, int a) {
        //this.email = email;
        //this.password = password;
        this(email,password);
        this.submitButton = submitButton;
        this.a = a;
    }

    String submitButton;
}
