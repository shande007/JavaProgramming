package S21_Collection_Framework.CF5_MAP;
import java.util.*;
public class Prog130_Map_Real {

    public static void main(String[] args) {
        // Urls - stage, dev, qa, preprod, prod.
        Map<String,String> env_config = new HashMap<>();
        env_config.put("production", "https://prod.api.com");
        env_config.put("staging", "https://staging.api.com");
        env_config.put("dev", "https://dev.api.com");
        env_config.put("preprod", "https://preprod.api.com");
        env_config.put("uat", "https://uat.api.com");

        System.out.println(env_config);

        // Managing user credentials
        Map<String, String> credentials = new HashMap<>();
        credentials.put("admin", "admin123");
        credentials.put("user", "user123");
        credentials.put("user", null);
        credentials.put("user2", null);

        System.out.println(credentials);


        // Sending the data from Map to JSON, JSON TO MAP - API Automation
        // Web Selenium - Store the Webelements with keys.


        Map<String,String> map = new HashMap(10);
        // initialCapacity -> 10
        // 20 -> Load Factor * new value = Total Capacity -> Hashmap -> increased.

        Map<Float,Double> env_config2 = new HashMap<>();



    }
}
