package S21_Collection_Framework.CF1_LIST;

import java.util.*;

public class Prog116_List_Scanner_Input {

    public static void main(String[] args) {
        // Requirement where we want to modify the collection
        // many times, then we always use the linkedlist.
        Scanner scanner = new Scanner(System.in);
        String continueInput = "Y";
        List<String> names = new ArrayList<>();

        while(continueInput.equalsIgnoreCase("Y")){

            System.out.println("Enter the name that you want to store");
            String name = scanner.next();
            names.add(name);
            scanner.nextLine();
            System.out.println("Do you want to add another one? Y/N");
            continueInput = scanner.nextLine();
            if(!continueInput.equalsIgnoreCase("Y"))
            {
                System.out.println("You have entered N or non other than Y thus exit");
            }

        }

        for (String name: names){
            System.out.println(name);
        }

        scanner.close();
        //LinkedList l = new LinkedList();


    }
}
