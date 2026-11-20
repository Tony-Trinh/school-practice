//Tony Trinh
//September 3, 2025
//Assignment 1
//This class tracks mileage and fuel efficiency and calculates fuel used.

package java2.fall2025;

public class Odometer {
    private double milesDriven; // total miles driven
    private double mpg;         // miles per gallon
    
    // Contructor sets initial values to 0
    public Odometer () {
        milesDriven = 0;
        mpg = 0;
    }
    
    // Reset miles to zero
    public void resetMiles() {
        milesDriven = 0;
    }
    
    // Reset MPG to zero
    public void resetMPG() {
        mpg = 0;
    }
    
    // Set a new MPG value
    public void setMPG(double value) {
        mpg = value;
    }
    
    // Add miles to current odometer reading
    public void addMiles(double miles) {
        milesDriven += miles;
    }
    
    // Calculate gallons used (miles / mpg)
    public double getGallonsUsed() {
        if (mpg == 0)
            return 0;
        return milesDriven / mpg;
    }
    
    // Return a summary string with all data
    public String toString() {
        return "Miles Driven: " + milesDriven + "\n" +
               "MPG: " + mpg + "\n" +
               "Gallons Used: " + getGallonsUsed();
    }
}   
    
    
    


