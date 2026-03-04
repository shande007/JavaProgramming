package S13_Polymorphism.Method_Overridding;

public class Prog82_Overriding2 {
    public static void main(String[] args) {

        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();   // Chrome browser

        FirefoxTc f1 = new FirefoxTc();
        f1.openBrowser();   // Firefox browser

        CommonToAll commonToAll = new CommonToAll();
        commonToAll.openBrowser();  // Inter explorer browser


        // Dynamic Dispatch
        CommonToAll c2 = new ChromeTC();
        c2.openBrowser();      // Chrome Browser

        CommonToAll c3 = new FirefoxTc();
        c3.openBrowser();       // Firefox browser

//        ChromeDriver driver = new ChromeDriver();
//        driver = new FreifoxDriver();

    }


}


class CommonToAll {
    void openBrowser() {
        System.out.println("Starting the IE browser.");
    }
}

class ChromeTC extends CommonToAll {
    @Override
    void openBrowser() {
        System.out.println("Starting the CHROME browser.");
    }

}

class FirefoxTc extends CommonToAll {
    @Override
    void openBrowser() {
        System.out.println("Starting FirefoxTc, Better Browser!!");
    }
}