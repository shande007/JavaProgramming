package Star_Patterns;
/*
     *
    ***
   ***** 
  *******
 *********

 */
public class Prog66_Pyramid_2 {
    public static void main(String[] args) {

        int rows = 6;

        for (int i = 0; i <= rows; i++) {

            // Print leading spaces
            for (int space = rows; space > i; space--) {
                System.out.print(" ");
            }

            // Print stars with spacing
            for (int star = 0; star < i*2+1; star++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}
