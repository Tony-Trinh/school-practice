package java1.summer2025;
/**
 * This is a Circle class that stores a radius and calculates area,
 * diameter, and circumference.
 * 
 * @author Tony Trinh
 */

public class Circle {
    private double radius ;               // Store the radius
    private final double PI = 3.14159;    // Constant for Pi
    
    public Circle(){
        radius = 0.0;                     // Default redius is 0
    }
    
    public Circle(double r){               
        radius = r;                       // Set radius from input
    }
    
    public void setRadius(double r){
        radius = r;                       // Update the radius
    }
    
    public double getRadius(){
        return radius;                    // Return the radius
    }
    
    public double area(){
        return PI * radius * radius;      // Area = Pi * r * r
    }
    
    public double diameter(){
        return radius * 2;                // Diameter = 2 * r
    }
    
    public double circumference(){
        return 2 * PI * radius;           // Circumference = 2 * PI * r
    }
}
