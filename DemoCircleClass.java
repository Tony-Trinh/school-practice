package java1.summer2025;
import java.util.Scanner; // Needed for Scanner class
/**
 * // This program asks for radius and shows circle details
 * 
 * @author Tony Trinh
 */
public class DemoCircleClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create Scanner
        Scanner keyboard = new Scanner(System.in);

        // Ask user for radius
        System.out.print("Enter the radius of the circle: ");
        double r = keyboard.nextDouble();

        // Create Circle object
        Circle myCircle = new Circle(r);

        // Display the radius
        System.out.println("Radius: " + myCircle.getRadius());
        
        // Display the area of the circle
        System.out.println("Area: " + myCircle.area());
        
        // Display the diameter of the circle
        System.out.println("Diameter: " + myCircle.diameter());
        
        // Display the circumference of the circle
        System.out.println("Circumference: " + myCircle.circumference());
    }
    
}
