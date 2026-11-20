// Tony Trinh
// 09/30/2025
// Assignment 8
// Triangle class. Area = (height * width) / 2.

package java2.fall2025;  

// Triangle is a child of GeometricFigure
public class Triangle extends GeometricFigure {
    
    // make a new Triangle
    public Triangle(int height, int width){
        // send values to parent
        super(height, width, "Triangle");
        determineArea(); // find area right away
    }
    
    // find area for Triangle
    @Override
    public void determineArea() {
        area = (height * width) / 2.0 ;   // Area = (height * width) / 2.
    }
}
