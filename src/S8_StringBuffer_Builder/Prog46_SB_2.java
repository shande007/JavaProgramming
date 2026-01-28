package S8_StringBuffer_Builder;

public class Prog46_SB_2 {
    public static void main(String[] args) {
//        // String - 90%
//        String s0 = "Sidhant";
//        String s1 = new String("Sidhant");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Sidhant");
        StringBuilder stringBuilder = new StringBuilder("Sidhant");

        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());
    }
}
