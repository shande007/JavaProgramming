package S7_NumberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class Prog36_GuessNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int numToGuess = random.nextInt(100);

        System.out.println("Number is between 0 to 100");


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int guess = 0;
        int attempt= 0;

        while(true)
        {
            if(!sc.hasNextInt())
            {
                System.out.println("Invalid Input! enter a integer number");
                sc.next();
                continue;
            }

            guess = sc.nextInt();
            attempt++;

            if(guess < numToGuess)
            {
                System.out.println("Guessed number is lower than actual");
            }
            else if (guess > numToGuess)
            {
                System.out.println("Guessed number is higher than actual");
            }
            else {
                System.out.println("Guess is correct and you have taken attempts are "+ attempt);
                break;
            }
        }
    }
}
