package S19_ENUM;

public class Prog97_Enum_ENV {


    public static void main(String[] args) {

        System.out.println(Enum_ENV.QA.getBaseURL());
        // Here I can write the QA code
        if(Enum_ENV.QA.getBaseURL().equalsIgnoreCase("https://qa.myapp.com")){
            System.out.println("Start on QA!!");
        }



    }
}
