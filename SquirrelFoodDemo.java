package java1.summer2025;
/**
 * This is the demo program to test the SquirrelFoodManager class.
 * It creates squirrel objects, uses methods, and compares them.
 *
 * @author Tony Trinh
 */
public class SquirrelFoodDemo { 
    public static void main(String[] args) {   
        // Create a squirrel named Sandy with a mouth capacity of 3
        SquirrelFoodManager sandy = new SquirrelFoodManager("Sandy", 3);

        // Display Sandy using toString
        System.out.println(sandy.toString());
        
        // Create a squirrel named Bucky with a mouth capacity of 4
        SquirrelFoodManager bucky = new SquirrelFoodManager("Bucky", 4);
        
        // Display Bucky using toString
        System.out.println(bucky.toString());
        
        // Use equals to compare Sandy and Bucky
        if (sandy.equals(bucky)) {
            System.out.println("Sandy and Bucky are equal.");
        } else {
            System.out.println("Sandy and Bucky are not equal.");
        }
        
        // Sandy gathers 5 acorns
        sandy.gathersForMidden(5);
        
        // Display Sandy using toString
        System.out.println(sandy.toString());
        
        // Sandy gathers 2 more acorns
        sandy.gathersForMidden(2);
        
        // Display Sandy using toString
        System.out.println(sandy.toString());
        
        // Sandy eats 1 acorn
        sandy.eatsFromMidden(1);
        
        // Display Sandy using toString
        System.out.println(sandy.toString());
        
        // Create a copy of Sandy
        SquirrelFoodManager rocky = new SquirrelFoodManager(sandy);
        
        // Change name to Rocky
        rocky.setName("Rocky");
        
        // Display Rocky
        System.out.println(rocky.toString());
        
        // Compare Sandy and Rocky
        if (sandy.equals(rocky)) {
            System.out.println("Sandy and Rocky are equal.");
        } else {
            System.out.println("Sandy and Rocky are not equal.");
        }
    }
}
