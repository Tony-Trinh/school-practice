package java1.summer2025;
import java.util.Scanner;  //import Scanner from Java Library

/*
This is a program to check for "Magic Day"
*/

/**
 *
 * @author Tony Trinh
 */
public class magicDay {
    public static void main(String[] args) {
        
        //Create a Scanner object to read input
        Scanner keyboard = new Scanner(System.in);
        
        // Get user's month
        System.out.println("Please enter the month (1-12): ");
        int month = keyboard.nextInt();    // Store the month as an integer
        
        // Get user's day
        System.out.println("Please enter the day (1-31): ");
        int day = keyboard.nextInt();      // Store the day as an integer
        
        // Get user's year (only last two-digits)
        System.out.println("Please enter the two-digits year (e.g., 60 for 1960): ");
        int  year = keyboard.nextInt();    // Store the year as an integer
        
        // Check if the (month * day) = year 
       if (month * day == year){ 
           System.out.println("The date is magic!");     // If true, It's a magic day
       } else {
           System.out.println("The date is not magic!"); // If not, It isn't a magic day
       }
           
    }
}
