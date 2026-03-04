package S19_ENUM;

public enum Enum_ENV {

    DEV("https://dev.myapp.com"),
    QA("https://qa.myapp.com"),
    STAGING("https://staging.myapp.com"),
    PREPROD("https://preprod.myapp.com"),
    UAT("https://uat.myapp.com"),
    PROD("https://myapp.com");

    public String baseURL;

    Enum_ENV(String baseUrl){
        this.baseURL = baseUrl;
    }

    public String getBaseURL(){
        return this.baseURL;
    }

}
