// Tony Trinh
// 09/30/2025
// Assignment 8
// Square class. Area = side * side.

package java2.fall2025;  

// Square is a child of GeometricFigure
public class Square extends GeometricFigure {
    
    // make a new Square
    public Square(int side){
        // send side to parent for height and width
        super(side, side, "Square");
        determineArea(); // find area right away
    }

    // find area for Square
    @Override
    public void determineArea() {
        area = height * width; // area = side * side
    }
}
