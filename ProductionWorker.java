// Tony Trinh
// 09/23/2025
// Assignment 6
// This class extends Employee with shift and hourly pay rate.

package java2.fall2025; 

public class ProductionWorker extends Employee { // subclass
    public static final int DAY_SHIFT = 1;   // day shift code
    public static final int NIGHT_SHIFT = 2; // night shift code
    
    private int shift;        // shift number
    private double payRate;   // hourly pay
    
    // full constructor
    public ProductionWorker(String n, String num, String date,
                            int sh, double rate) {
        super(n, num, date); // call parent
        shift = sh;          // set shift
        payRate = rate;      // set rate
    }
    
    // default constructor
    public ProductionWorker(){
        super();             // call parent default
        shift = DAY_SHIFT;   // default shift
        payRate = 0.0;       // default pay
    }
    
    // set shift
    public void setShift(int s){
        shift = s;
    }
    
    // set pay
    public void setPayRate(double p){
        payRate = p;
    }
    
    // get shift
    public int getShift(){
        return shift;
    }
    
    // get pay
    public double getPayRate(){
        return payRate;
    }
    
    // string output
    public String toString(){
        String str = super.toString(); // parent info
        
        str += "\nShift: ";
        if (shift == DAY_SHIFT)        // check shift
            str += "Day";
        else if (shift == NIGHT_SHIFT)
            str += "Night";
        else 
            str += "INVALID SHIFT NUMBER";
        
        str += String.format("\nHourly Pay Rate: $%,.2f", payRate); // add pay
        return str; // return text
    }
}
