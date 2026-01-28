package S8_StringBuffer_Builder;

public class Prog47_SB_3 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Sidhant");
        stringBuffer.append("Hande");
        System.out.println(stringBuffer);   // SidhantHande (But in same memory)


        String s1 = "Sidhant";
        s1 = s1+ "Hande";
        System.out.println(s1);   // SidhantHande   (Two separate memory or strings being created)

    }
}
