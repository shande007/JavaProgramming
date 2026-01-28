package S2_Conditional_Statements;

public class Prog20_Switch_WeekNumberFromWeekName {
    public static void main(String[] args) {

        String day = "Monday";

        switch (day.toLowerCase()) {
            case "monday":
                System.out.println("Week number: 1");
                break;

            case "tuesday":
                System.out.println("Week number: 2");
                break;

            case "wednesday":
                System.out.println("Week number: 3");
                break;

            case "thursday":
                System.out.println("Week number: 4");
                break;

            case "friday":
                System.out.println("Week number: 5");
                break;

            case "saturday":
                System.out.println("Week number: 6");
                break;

            case "sunday":
                System.out.println("Week number: 7");
                break;

            default:
                System.out.println("Invalid week name");
        }
    }
}
