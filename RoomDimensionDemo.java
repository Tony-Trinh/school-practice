// Tony Trinh
// September 9, 2025
// Assignment 2
// //This demo class to test calculates carpet cost for rooms using RoomCarpet and RoomDimension

package java2.fall2025;
import java.util.Scanner;  // Need for Scanner Class

public class RoomDimensionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again = "Yes";  // To control the loop to repeat
        
        // Display welcome message
        System.out.println("Welcome to the Carpet Cost Calculator!");
        
        // Loop continues as long as user types "Yes"
        while (again.equalsIgnoreCase("Yes")) {
            
            // Get room length from user
            System.out.println("Enter the length of the room (in feet): ");
            double length = input.nextDouble();
            
            // Get room width from user
            System.out.println("Enter the width of the room (in feet): ");
            double width = input.nextDouble();
            
            // Get cost of carpet per square foot
            System.out.println("Enter the carpet cost per square foot: $");
            double cost = input.nextDouble();
            
            // Create RoomDimension and RoomCarpet objects using user input
            RoomDimension room = new RoomDimension(length, width);
            RoomCarpet carpet = new RoomCarpet(room, cost);
            
            // Display the room and carpet info using toString()
            System.out.println("--- Room Carpet Summary ---");
            System.out.println(carpet);
            
            input.nextLine(); // Clear the input buffer before reading next line
            
            // Ask if user wants to see the total accumulated cost
            System.out.println("Would you like to see the total cost for ALL rooms? (Yes/No): ");
            String costRepeat = input.nextLine();
            if (costRepeat.equalsIgnoreCase("Yes")){
                System.out.println("Total for All Rooms: $" + carpet.getTotalCostAccumulated());
            }
            
            // Ask if user wants to calculate another room
            System.out.println("Do you want to repeat Yes/No: ");
            again = input.nextLine();
        } 
        
        // End message
        System.out.println("Thank you! Program ended.");
        
        
    }
    
}
