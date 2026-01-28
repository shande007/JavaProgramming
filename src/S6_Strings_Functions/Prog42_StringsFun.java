package S6_Strings_Functions;

public class Prog42_StringsFun {
    public static void main(String[] args) {

        char c = 'A';
        System.out.println(c);

        String s1 = "ABCD";                         // Created one string in SCP (ABCD)
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());       // Created another string in SCP (abcd)
        System.out.println(s1.toUpperCase());       // Not created any string as upper case is already present in s1 (ABCD)
        System.out.println(s1.concat("E"));     // Created another string in SCP as (ABCDE)

        // Total 3 string is been created
    }
}
