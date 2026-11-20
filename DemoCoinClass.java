package java1.summer2025;

/**
 * This program tosses a coin 20 times and counts heads and tails.
 * 
 * @author Tony Trinh
 */
public class DemoCoinClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Set counters
        int headsCount = 0;
        int tailsCount = 0;
        
        Coin coin = new Coin();    // create Coin object
        
        // Display initial side
        System.out.println("Initial side up: " + coin.getSideUp());
        
        // Toss the coin 20 times
        for (int i = 0; i < 20; i++){
           coin.toss();            // Toss the coin
           
           // Display toss number and which side the coin landed on
           System.out.println("Toss " + i + ": " + coin.getSideUp());
            
           // Count heads or tails
           if (coin.getSideUp().equals("heads")) {
               headsCount++;
           } else {
               tailsCount++;
           }
        }
        
        // Display results
        System.out.println("\nTotal Heads: " + headsCount);
        System.out.println("Total Tails: " + tailsCount);
    }
    
}
