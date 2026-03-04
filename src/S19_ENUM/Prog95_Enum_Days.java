package S19_ENUM;

public class Prog95_Enum_Days {

    public static void main(String[] args) {
        Enum_Days today = Enum_Days.WEDNESDAY;
        System.out.println(today);
        System.out.println(today.name());
        System.out.println(today.ordinal()); // (zero-indexed position)
    }
}
