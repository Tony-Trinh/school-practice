package java1.summer2025;
import java.util.Scanner; // Needed for Scanner class
import java.io.*;         // Needed for File I/O classes
/**
* This is a program shows distance traveled each hour based on speed
* and saves the result to a file instead of showing it on the screen.
* 
* @author Tony Trinh
*/
public class DistanceFile {
    public static void main(String[] args) throws IOException {
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
        
        // Write results to file
        PrintWriter outputFile = new PrintWriter("distance_output.txt");
        
        //Display the table header
        outputFile.println("Hour\t\tDistance Traveled");
        outputFile.println("---------------------------------");
        
        //Loop and calculate distance
        for (int number = 1; number <= hour; number++) //Loop control variable
        {
            outputFile.println(number + "\t\t" + speed * number); // distance = speed * hour
        }    
        
        // Close file
        outputFile.close();
        
        // Display the message
        System.out.println("Data is written to distance_output.txt");
    }     
}
