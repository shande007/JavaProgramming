package Star_Patterns;
/*
                *
              *   *
            *   *   *
          *   *   *   *
        *   *   *   *   *

*/
public class Prog65_Pyramid_1 {
        public static void main(String[] args) {

        int rows = 6;

        for (int i = 1; i <= rows; i++) {

            // Print leading spaces
            for (int space = rows; space > i; space--) {
                System.out.print(" ");
            }

            // Print stars with spacing
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }

}
