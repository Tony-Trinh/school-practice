package java1.summer2025;

/**
 * The LandTract class holds the length and width of land.
 * It can calculate area, compare two tracts, and return a description.
 * 
 * @author Tony Trinh
 */
public class LandTract {
    private double length;  // The length of the land tract
    private double width;   // The width of the land tract
    
     /**
     * Constructor that sets the length and width of the land tract.
     * 
     * @param length The length of the land
     * @param width The width of the land
     */
    public LandTract(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    /**
     * Calculates and returns the area of the land tract.
     * 
     * @return The area (length * width)
     */
    public double getArea() { 
        return length * width;
    }
    
    /**
     * Checks if this land tract is equal to another one.
     * Land tracts are equal if both length and width match.
     * 
     * @param land2 The other LandTract object to compare
     * @return true if the tracts are equal, false otherwise
     */
    public boolean equals(LandTract land2) {
        boolean status;
        
        if (length == land2.length && width == land2.width)
            status = true;  // The tracts are equal
        else 
            status = false; // The tracts are not equal
        
        return status;
    }
    
    /**
     * Returns a string describing the land tract's length, width, and area.
     * 
     * @return A string that shows the length, width, and area
     */
    public String toString() {
        return "Length: " + length + ", Width: " + width + ", Area: " + getArea();
    }
}
