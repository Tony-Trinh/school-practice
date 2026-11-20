// Tony Trinh
// 09/23/2025
// Assignment 6
// This class extends Employee with annual salary and bonus.

package java2.fall2025; 

public class ShiftSupervisor extends Employee { // subclass
    private double annualSalary; // yearly salary
    private double annualBonus;  // yearly bonus

    // full constructor
    public ShiftSupervisor(String n, String num, String date,
                           double salary, double bonus) {
        super(n, num, date);   // call parent
        annualSalary = salary; // set salary
        annualBonus = bonus;   // set bonus
    }

    // default constructor
    public ShiftSupervisor() {
        super();          // call parent default
        annualSalary = 0; // default salary
        annualBonus = 0;  // default bonus
    }

    // set salary
    public void setAnnualSalary(double salary) {
        annualSalary = salary;
    }

    // set bonus
    public void setAnnualBonus(double bonus) {
        annualBonus = bonus;
    }

    // get salary
    public double getAnnualSalary() {
        return annualSalary;
    }

    // get bonus
    public double getAnnualBonus() {
        return annualBonus;
    }

    // string output
    public String toString() {
        String str = super.toString(); // parent info
        str += String.format("\nAnnual Salary: $%,.2f", annualSalary); // add salary
        str += String.format("\nAnnual Production Bonus: $%,.2f", annualBonus); // add bonus
        return str; // return text
    }
}
