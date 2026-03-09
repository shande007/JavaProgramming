package S21_Collection_Framework.CF2_Stack;
import java.util.Stack;

public class Prog113_Stack {

    public static void main(String[] args) {
        Stack s1 = new Stack();
        //  List In and First Out

        Stack s = new Stack();
        s.add("Sidhant");
        s.add("Hande");
        s.add("Rutuja");
        System.out.println(s);      //[Sidhant, Hande, Rutuja]
        System.out.println(s.size()); // 3
        System.out.println(s);  // [Sidhant, Hande, Rutuja]
        System.out.println(s.peek());   // Rutuja (Top)
        System.out.println(s);  // [Sidhant, Hande, Rutuja]

        System.out.println(s.pop());   // Rutuja
        System.out.println(s);   // [Sidhant, Hande]

        System.out.println(s.add("Piya"));      // True
        System.out.println(s);   // [Sidhant, Hande, Piya]
        System.out.println(s);   // [Sidhant, Hande, Piya]
        s.add("Suraj");
        s.add("Harish");
        s.push("Prasad");
        System.out.println(s);  // [Sidhant, Hande, Piya, Suraj, Harish, Prasad]
        // s.pop(3)
        s.add(2,"Lucky");
        System.out.println(s);   // [Sidhant, Hande, Lucky, Piya, Suraj, Harish, Prasad]
        s.push("Racer");
        s.addLast("Allu");
        System.out.println(s);      // [Sidhant, Hande, Lucky, Piya, Suraj, Harish, Prasad, Racer, Allu]
    }
}
