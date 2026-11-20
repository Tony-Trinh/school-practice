package java1.summer2025;
import java.util.Scanner; //import Scanner from Java Library
import java.util.Random;  //import Random from Java Library

/*
This is a program that let's you guess a random number and tells you if it's too high
or too low. It also shows how many tries you took.
*/

/**
 *
 * @author Tony Trinh
 */
public class NumberGuessing {
    public static void main(String[] args) {
        
        //Create a Scanner object to read input
        Scanner keyboard = new Scanner(System.in);
        
        //Create a Random object
        Random randomNumbers = new Random();
        
        int number = randomNumbers.nextInt(100) + 1; // Random number between 1 and 100
        int guess = 0;                               // User's guess
        int count = 0;                               // Count number of guesses
        
        // Keep asking until the guess is correct
        while (guess != number)
        {
            System.out.println("Guess the number (1-100): ");
            guess = keyboard.nextInt();              //Get guess from user
            count++;                                 //Count each guess
           
            if (guess > number) {
                System.out.println("Too high, try again."); // Tell user is too high
            } else if (guess < number) {
                System.out.println("Too low, try again.");  // Tell user is too low
            } else {
                System.out.println("Correct! You guessed the number!"); // Tell user is correct
                System.out.println("Total guesses: " + count); //Show total guesses
            }
        }
        
    }
    
}
