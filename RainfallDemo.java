package java1.summer2025;
import java.util.Scanner;
/**
 * This program collects monthly rainfall data from the user.
 * It uses the Rainfall class to calculate and display:
 * total rainfall, average rainfall, most rainfall, and least rainfall.
 * 
 * @author Tony Trinh
 */
public class RainfallDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double[] monthlyRain = new double[12]; // Array to hold rainfall for 12 months
        
        // Get rainfall input for each month
        for (int i = 0; i < 12; i++) {
            System.out.print("Enter rainfall for month " + (i + 1) + ": ");
            double value = keyboard.nextDouble();
            
            // Keep asking if the input is negative
            while (value < 0) {
                System.out.println("Negative rainfall not accepted. Please try again: ");
                value = keyboard.nextDouble();
            }
            
            monthlyRain[i] = value;  // Store validated input
        }
        
        // Create Rainfall object using user input
        Rainfall year = new Rainfall(monthlyRain);
        
        // Display results
        System.out.println("Total rainfall: " + year.totalRainfall() + " inches");
        System.out.println("Average rainfall: " + year.avgRainfall() + " inches");
        System.out.println("Most rainfall in a month: " + year.mostRainfall() + " inches");
        System.out.println("Least rainfall in a month: " + year.leastRainfall() + " inches");
    }
    
}
