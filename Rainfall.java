package java1.summer2025;
/**
 * The Rainfall class stores monthly rainfall data in an array.
 * It provides methods to get the total, average, highest, and lowest rainfall.
 *
 * @author Tony Trinh
 */
public class Rainfall {
    private double[] rainfall;  // Array to hold rainfall values
    
    /**
     * Constructor copies rainfall amounts from the input array to the internal array.
     * Negative values are replaced with 0.
     * @param inputRainfall The input array of rainfall values.
     */
    public Rainfall(double[] inputRainfall) {
        rainfall = new double[12];
        for (int i = 0; i < 12; i++) {
            if (inputRainfall[i] >= 0) {
                rainfall[i] = inputRainfall[i];
            } else {
                rainfall[i]= 0;
            }
        }
    }
    
    /**
     * Calculates the total rainfall.
     * @return The total of all monthly rainfall values.
     */
    public double totalRainfall() {
        double total = 0;
        for (int i = 0; i < 12; i++) {
            total += rainfall[i];
        }
        
        return total;
    }
    
    /**
     * Calculates the average monthly rainfall.
     * @return The average rainfall value.
     */
    public double avgRainfall() {
        return totalRainfall() / 12;
    }
    
    /**
     * Finds the highest monthly rainfall value.
     * @return The maximum rainfall amount.
     */
    public double mostRainfall() { 
        double max = rainfall[0];
        for (int i = 1; i < 12; i++) {
            if (rainfall[i] > max) {
                max = rainfall[i];
            }
        }
        
        return max;
    }
    
    /**
     * Finds the lowest monthly rainfall value.
     * @return The minimum rainfall amount.
     */
    public double leastRainfall() {
        double min = rainfall[0];
        for (int i = 1; i < 12; i++) {
            if (rainfall[i] < min) {
                min = rainfall[i];
            }
        }
        return min;
    }
    
}
