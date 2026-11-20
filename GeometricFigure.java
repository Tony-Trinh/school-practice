// Tony Trinh
// 09/30/2025
// Assignment 8
// GeometricFigure is an abstract parent class for shapes.

package java2.fall2025;

public abstract class GeometricFigure {
    int height;        // the height
    int width;         // the width
    String figureType; // the type (Square, Triangle)
    double area;       // the area 
    
    // constructor
    public GeometricFigure(int height, int width, String figureType){
        this.height = height;
        this.width = width;
        this.figureType = figureType;
    }
    
    // return the height
    public double getHeight(){
        return height;
    }
    
    // return the width
    public double getWidth(){
        return width;
    }
    
    // return the type of shape
    public String getFigureType(){
        return figureType;
    }
    
    // return the area
    public double getArea(){
        return area;
    }
    
    // abstract method to find area
    public abstract void determineArea();
}
