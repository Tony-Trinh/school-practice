/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1.summer2025;
import java.util.Scanner;  //import Scanner from Java Library

/*
This is a program that calculates and displays Stock Commission
*/

/**
 *
 * @author Tony Trinh
 */

public class stockCommission {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //Create a Scanner object to read input
        Scanner keyboard = new Scanner(System.in);
        
        // declare variables
        double shares;               //user input shares
        double share_price;          // user input share price
        double commissionPercent;    // user input % commission 
        double stockAlone;
        double commission;
        double totalPaid;
        
        // Get user's share
        System.out.println("Please enter number of the shares: ");
        shares = keyboard.nextDouble();
        
        // Get user's share price
        System.out.println("Please enter the share price: ");
        share_price = keyboard.nextDouble();
        
        // Formula of stock alone = share * price
        stockAlone = shares * share_price;
        
        // Get user's share price
        System.out.println("Please enter the percent of commission as an integer: ");
        commissionPercent = keyboard.nextDouble();
        
        // Formula the get the percent = commission input / 100
        commissionPercent /= 100;
       
        // Formula of commission = stock alone * commission %
        commission = stockAlone * commissionPercent;
        
        // Formula of total paid = stock alone + commission
        totalPaid = stockAlone + commission;
        
        //Display show amount of stock alone, commission, total paid
        System.out.println("The  amount paid for the stock alone: $" + stockAlone);
        System.out.println("The amount of the commission: $" + commission);
        System.out.println("The total amount paid: $" + totalPaid);
        
    }
}
