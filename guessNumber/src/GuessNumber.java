import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // create a  Random object
        Random rad = new Random();
        // create a scan object for user input
        Scanner scan = new Scanner(System.in);
        // create a random number within the specified range
        int randomNumber = rad.nextInt(100) + 1;//specified range, such as 1 to 100.
        int lives = 10; // max number of attempts for execution of program
        System.out.println("The random number is:" + randomNumber);
        //count variable used for number of iterations for Guesses correctly
        int count = 0;
        //Initialize user guess to a number outside the valid range
        int userGuess = -1;
        while (userGuess != randomNumber && lives > 0) {
            System.out.println("Enter a Guess number (0-100):");
            userGuess = scan.nextInt();
            count++;
            //Compare the user's guess with the Random number
            if (userGuess <= 0) {
                System.out.println("Please enter a valid number within the specified range as 1 to 100.");
                lives--;
            } else if (userGuess == randomNumber) {
                System.out.println("Yes! your Guess is correct");
                System.out.println("Number of Guesses are : " + count);
                lives--;
//                System.out.println("Number of attempts left :"+lives--);
                break;
            } else if (userGuess > randomNumber) {
                System.out.println("No! your Guess is in-correct,userGuess number is too high. please try again");
                lives--;

            } else {
                System.out.println("No! your Guess is in-correct,userGuess number is too low. please try again");
                lives--;

            }

            System.out.println("Number of attempts left:" + lives);
        }
        if (lives == 0) {
            System.out.println("GAME OVER Number of attempts left is:" + lives);
        }



        scan.close();
    }
}