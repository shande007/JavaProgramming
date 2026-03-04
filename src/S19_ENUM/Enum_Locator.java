package S19_ENUM;

public enum Enum_Locator {

    page_input_email("//*[@id=\"login-username\"]"),
    page_input_password("//*[@id=\"login-password\"]"),
    page_button("#btn");

    private String locator;
    Enum_Locator(String locator){
        this.locator = locator;
    }

    String getLocator(){
        return this.locator;
    }
}
