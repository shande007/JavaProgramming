package S20_Wrapper_Class;

public class Prog101_Wrapper_Conversion {

    public static void main(String[] args) {
        int a = 10;
        // a. // ?
        //        a. // no attribute
//        a.len() // no method
        System.out.println(a);
        Integer a1 = 10;
        System.out.println(a1);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        ///  ///////////////////////////////////////////////

        String num = "10";
        int aa = 10;

        // String -> Wrapper Conversion
        Integer a10 = Integer.parseInt(num);
        // Double.parseDouble()
        // Float.parseFloat()
        // Long.parse

        System.out.println(a10);

        // String to Primitive
        int a_p = Integer.parseInt(num);

        Integer aa3 = Integer.valueOf("10");
        System.out.println(aa3);

    }
}
