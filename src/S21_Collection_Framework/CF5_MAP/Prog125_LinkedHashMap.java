package S21_Collection_Framework.CF5_MAP;

import java.util.*;

public class Prog125_LinkedHashMap {
    public static void main(String[] args) {
        Map<String, String> countries = new LinkedHashMap<>();

        countries.put("IN", "India");
        countries.put("US", "United States");
        countries.put("UK", "United Kingdom");
        countries.put("JP", "Japan");

        System.out.println(countries);
    }
}
