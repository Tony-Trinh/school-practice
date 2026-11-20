package java1.summer2025;
/**
 * The SquirrelFoodManager class stores a squirrel's name,
 * how many acorns it can carry, and how many it has stored.
 * It has methods to gather, eat, compare, and show this info.
 * 
 * @author Tony Trinh
 */
public class SquirrelFoodManager {
    private String name;       // The squirrel's name
    private int holdsInMouth;  // Max acorns in mouth
    private int hasInMidden;   // Acorns stored in midden
    
    /**
     * Constructor sets name and how many acorns it can hold.
     * Starts with 0 acorns in the midden.
     * 
     * @param name Squirrel's name
     * @param holdsInMouth Max number of acorns squirrel can hold
     */
    public SquirrelFoodManager(String name, int holdsInMouth) {
        this.name = name;
        this.holdsInMouth = holdsInMouth;
        this.hasInMidden = 0;
    }
    
    /**
     * Copy constructor makes a copy of another squirrel object.
     * 
     * @param copy The SquirrelFoodManager to copy
     */
    public SquirrelFoodManager(SquirrelFoodManager copy) {
        this.name = copy.name;
        this.holdsInMouth = copy.holdsInMouth;
        this.hasInMidden = copy.hasInMidden;
    }
    
     /**
     * Sets the squirrel's name.
     * 
     * @param newName The new name to set
     */
    public void setName(String newName) {
        this.name = newName;
    }
    
    /**
     * Adds acorns to the midden, but no more than it can hold.
     * 
     * @param acorns The number of acorns to gather
     */
    public void gathersForMidden(int acorns) {
        if (acorns > holdsInMouth) {
            hasInMidden += holdsInMouth;
        } else {
            hasInMidden += acorns;
        }
    }    
    /**
     * Eats acorns from the midden, up to what is available.
     * 
     * @param acorns The number of acorns to eat
     */ 
    public void eatsFromMidden(int acorns) {
         if (acorns > hasInMidden) {
             hasInMidden = 0;
         } else {
             hasInMidden -= acorns;
         }
    }
    
    /**
     * Checks if another squirrel has the same mouth and midden values.
     * 
     * @param other The SquirrelFoodManager to compare
     * @return true if same, false otherwise
     */
    public boolean equals(SquirrelFoodManager other) {
        boolean status;
        if (this.holdsInMouth == other.holdsInMouth && this.hasInMidden == other.hasInMidden)
            status = true;  // The squirrels are equal
        else 
            status = false; // The squirrels are not equal

        return status;
    }
     /**
     * Returns a string with name, hold capacity, and midden count.
     * 
     * @return Info about the squirrel
     */
    public String toString() {
        return "Name: " + name + "\n" +
               "Holds In Mouth: " + holdsInMouth + "\n" +
               "Has In Midden: " + hasInMidden;
    }
    
}
