package StringBuffer_Builder;

public class Prog45_StringBufferBuilder {
    public static void main(String[] args) {


        String name = "Sidhant";

        System.out.println(name.length());  // 7
        System.out.println(name.charAt(3)); // h
//        System.out.println(name.charAt(10)); // java.lang.StringIndexOutOfBoundsException: Index 10 ou

        // 2. concat()
        System.out.println(name.concat(" Hande"));  // Sidhant Hande

        // 3. contains()
        System.out.println(name.contains("ant"));   // true

        // 4. equals()
        System.out.println(name.equals("Sidhant"));  // true

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sIdHant"));   // true (Ignore the cases)

        // 6. indexOf() //  Sidhant -> ? o
        System.out.println(name.indexOf('a'));  // 4

        String s1 = "mister";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));    // 0

        // 7. length()
        System.out.println(name.length());      // 7

        // 8. replace( , )
        System.out.println(name.replace('n', 'N'));     // SidhaNt

        // 10. substring( , )
        System.out.println(name.substring(1, 3));   // id

        // 11. toLowerCase()
        System.out.println("SIDHNAT".toLowerCase());    // sidhant

        // 12. toUpperCase()
        System.out.println("sidhant".toUpperCase());    // SIDHANT

        // 14. startsWith()
        System.out.println(name.startsWith("S"));       //true

        // 15. endsWith()
        System.out.println(name.endsWith("a"));     // false

        // 16. trim()
        String name3 = "    Sidhant Rutuja     ";
        System.out.println(name3.trim());   //Sidhant Rutuja

        // 17. compareTo()
        System.out.println(name.compareTo("Sidhant"));     // 0


        // --------------
        StringBuilder stringBuilder = new StringBuilder("Sidhant");
        System.out.println(stringBuilder);  // Sidhant

        stringBuilder.reverse();        // tnahdiS
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());  // Hi

    }
}
