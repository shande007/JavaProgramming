package S2_Conditional_Statements;

public class Prog21_VowelChecks {
    public static void main(String[] args) {

            char ch = 'a';

            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' ||
                    ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
                System.out.println("It is Vowel");
            else
                System.out.println("It is Consonant");
    }
}
