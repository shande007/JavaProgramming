package S13_Polymorphism.Method_Overloading;

public class Prog81_MethodOverloading2 {
    public static void main(String[] args) {
        WebAutomation wb = new WebAutomation();
        wb.openBrowser();
        wb.openBrowser("Firfox");
    }

}

class WebAutomation
{
    void openBrowser()
    {
        System.out.println("Open Default Browser");
    }
    void openBrowser(String browser)
    {
        System.out.println("Open with browser " + browser);
    }
}
