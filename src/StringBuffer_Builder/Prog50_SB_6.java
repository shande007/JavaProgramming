package StringBuffer_Builder;

public class Prog50_SB_6 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);     // Java Programming

        sb.replace(0, 4, "C++");
        System.out.println(sb);     // C++ Programming

    }
}
