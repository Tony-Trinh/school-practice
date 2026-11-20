
package java1.summer2025;
import java.util.Scanner;  // Import Scanner

/**
 * This program adds numbers from a string input separated by commas.
 * Example input: 7,9,10,2,18,6
 * 
 * @author Tony Trinh
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Create Scanner

        double sum = 0.0; // Start total sum at 0
        
        // Get user's input
        System.out.println("Enter numbers separated by commas:");
        String userInput = input.nextLine();
        
        // Split input string by comma
        String[] tokens = userInput.split(",");
        
        // Convert each token to Double and add to sum
        for (String s : tokens) {
            s = s.trim(); // remove extra spaces
            Double num = Double.valueOf(s); // convert to Double object
            sum += num;  // add to total
        }    
        
        //Display the sum
        System.out.println("The sum is: " + sum);
            
    }
    
}
