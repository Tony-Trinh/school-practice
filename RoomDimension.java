// Tony Trinh
// September 9, 2025
// Assignment 2
// This file includes RoomDimension and RoomCarpet classes with static cost tracking

package java2.fall2025;

class RoomDimension {
    // Variables to store the room’s dimensions
    private double length;
    private double width;
    
    // Constructor to set the length and width of the room
    public RoomDimension(double len, double w) {
        length = len;
        width = w;
    }
    
    // Returns the area of the room (length × width)
    public double getArea(){
        return length * width;
    }
    
    // Returns a formatted string of the room size and area
    public String toString(){
        return "Room Size: " + length + " ft x " + width + " ft"
                + "\nArea: " + getArea() + " sqft";
    }
    
}

class RoomCarpet {
    // Stores the room object, carpet price, and a running total cost for all rooms
    private RoomDimension size;
    private double carpetCost;
    private static double totalCostAccumulated = 0;
    
    // Constructor that sets the room size and carpet cost, and adds this room’s cost to the total
    public RoomCarpet(RoomDimension dim, double cost){
        size = dim;
        carpetCost = cost;
        totalCostAccumulated += getTotalCost();
    }
    
    // Calculates total carpet cost for the room
    public double getTotalCost(){
        return size.getArea() * carpetCost;
    }
    
    // Returns the total carpet cost of all rooms
    public static double getTotalCostAccumulated(){
        return totalCostAccumulated;
    }
    
    // Returns a string with all room and carpet info
    public String toString(){
        return size.toString() +
               "\nCarpet Cost per Square Foot: $" + carpetCost +
               "\nTotal Carpet Cost: $" + getTotalCost();
    }
}

