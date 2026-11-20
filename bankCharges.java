package java1.summer2025;
import java.util.Scanner; ////import Scanner from Java Library

/*
This is a program that asks for the number of checks written for the month
*/

/**
 *
 * @author Tony Trinh
 */
public class bankCharges {
    public static void main(String[] args) {
        
        //Create a Scanner object to read input
        Scanner keyboard = new Scanner(System.in);
        
        // Get user's number of checks
        System.out.println(" Please enter number of checks written this month: ");
        double checks = keyboard.nextDouble();  // read number of checks
        
        // Base monthly fee
        double fee = 10.0; 
        
        // Determine check fee based on number of checks
        if (checks < 20) {
            fee += checks * 0.10;  //$0.10 per check
        } else if (checks < 40) {
            fee += checks * 0.08;  //$0.08 per check
        } else if (checks < 60) {
            fee += checks * 0.06;  //$0.06 per check
        } else {
            fee += checks * 0.04;  //0.04 per check
        }
        
        // Display the bank's service fees
        System.out.println("The bank's service fees for the month: " + fee);
        
    }
}
