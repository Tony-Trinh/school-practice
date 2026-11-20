// Tony Trinh
// 09/30/2025
// Assignment 8
// Test program for GeometricFigure, Square, and Triangle.

package java2.fall2025;
public class testFigures
{
   public static void main(String[] args)
   {
      // create 3 squares
      Square s1 = new Square(4);
      Square s2 = new Square(6);
      Square s3 = new Square(8);

      // create 3 triangles
      Triangle t1 = new Triangle(3, 5);
      Triangle t2 = new Triangle(6, 10);
      Triangle t3 = new Triangle(7, 9);

      // store all in one array
      GeometricFigure[] figureArray = { s1, s2, s3, t1, t2, t3 };

      // display each figure’s fields
      for (GeometricFigure fig : figureArray)
      {
         System.out.println("Type: " + fig.getFigureType() +
                            ", Height: " + fig.getHeight() +
                            ", Width: " + fig.getWidth() +
                            ", Area: " + fig.getArea());
      }
   }
}
