/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1.summer2025;

import java.util.Scanner;  // Need for the Scanner class

// This is a program that asks the user for the number of miles driven and the gallon of gas used.

/**
 *
 * @author Tony Trinh
 */

public class MPG {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // create a Scanner object to read inout
        Scanner keyboard = new Scanner(System.in);
        
        //declare variables
        double userMiles;        // user input miles
        double userGallons;      // user input gallons
        double milesPerGallon;   // mpg = miles / gallons
       
        // Get the user's miles
        System.out.println("Please enter the miles: ");
        userMiles = keyboard.nextDouble();
        
        // Get the user's gallons
        System.out.println("Please enter the gallons of gas used: ");
        userGallons = keyboard.nextDouble();
        
        // The MPG formula
        milesPerGallon = userMiles / userGallons;
        
        // Display the milesPerGallon
        System.out.println("Miles per gallon is " + milesPerGallon);
       
    }
    
}
