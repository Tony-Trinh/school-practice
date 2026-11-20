package java1.summer2025;
import java.util.Scanner; // Needed for Scanner class
/**
 * This program calculates kinetic energy using the formula:
 * KE = 1/2 * mass * velocity^2
 * User enters mass (kg) and velocity (m/s), and the result is printed.
 * 
 * @author Tony Trinh
 */
public class KineticEnergy {

    public static void main(String[] args) {
        //Create a Scanner object to read input
        Scanner keyboard = new Scanner(System.in);
        
        // Get mass from user
        System.out.println("Please enter mass in kilograms: ");
        double mass = keyboard.nextDouble();       
        
        // Get velocity from user
        System.out.println("Please enter velocity in meters per second: ");
        double velocity = keyboard.nextDouble();
        
        // Call method to calculate kinetic energy
        double total = kineticEnergy(mass, velocity);
        
        // Display result
        System.out.println("The kinetic energy is: " + total);
    }
        
    /**
     * Method to calculate kinetic energy.
     * @param mass Mass in kilogram.
     * @param velocity Velocity in meters per second.
     * @return kinetic energy.
     */
    public static double kineticEnergy(double mass, double velocity) {
        
        return 0.5 * mass * velocity * velocity; //formula: KE = 1/2 * m * v^2

    }   
        
    
    
}
