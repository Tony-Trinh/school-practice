package java1.summer2025;
import java.util.Random;  //import Random from Java Library
/**
 * This is a program that simulates tossing a coin 20 times
 * It uses a Coin class that randomly gives heads or tails
 * 
 * @author Tony Trinh
 */
public class Coin {
    
    private String sideUp;             // holds "heads" or "tails"
    
    // Constructor - randomly sets the side facing up
    public Coin() {
        toss();                        // call toss to set initial side
    }
    
    // Simulates a coin toss
    public void toss() {
        Random rand = new Random();    // Create a Random object
        int number = rand.nextInt(2);  // Random number 0 and 1
        
        if (number == 0) {
            sideUp = "tails";          // If 0, set side to tails
            
        } else {
            sideUp = "heads";          // If 1, set side to heads
        }
    }
    
    // Returns the current side up
    public String getSideUp(){
        return sideUp;
    }
    
}
