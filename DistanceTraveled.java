package java1.summer2025;
import java.util.Scanner; //import Scanner from Java Library
/*
This is a program shows distance traveled each hour based on speed
*/
/**
 *
 * @author Tony Trinh
 */
public class DistanceTraveled {
    public static void main(String[] args) {
        
        //Create a Scanner object to read input
        Scanner keyboard = new Scanner(System.in);
        
        //Get user's speed
        System.out.println("Please enter the speed of a vehicle in miles-per-hour: ");
        int speed = keyboard.nextInt();  //to hold the speed in MPH
        
        //Validate speed input
        while (speed <= 0)
        {
            System.out.println("Speed must be greater than 0. Please try again.");
            speed = keyboard.nextInt();
        }
        
        //Get user's hours
        System.out.println("Please enter the number of hours it has traveled: ");
        int hour = keyboard.nextInt();   //to hold the hour
        
        //Validate speed input
        while (hour < 1)
        {
            System.out.println("Hours must be 1 or more. Please try again.");
            hour = keyboard.nextInt();        
        }
        
        //Display the table header
        System.out.println("Hour\t\tDistance Traveled");
        System.out.println("---------------------------------");
        
        //Loop and calculate distance
        for (int number = 1; number <= hour; number++) //Loop control variable
        {
            System.out.println(number + "\t\t" + speed * number); // distance = speed * hour
        }    
        
    }     
}
