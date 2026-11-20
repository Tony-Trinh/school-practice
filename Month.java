// Tony Trinh
// September 9, 2025
// Assignment 3
// This class stores a number for a month and lets us work with months using numbers or names

package java2.fall2025;

public class Month {
    private int monthNumber;
    
    // No-argument constructor: sets the month to 1 (January)
    public Month(){
        monthNumber = 1;
    }
    
    // Constructor that takes a number
    public Month(int month){
        if (month < 1 || month > 12) {
            monthNumber = 1;
        } else {
            monthNumber = month;
        }
    }
    
     // Constructor that takes a month name 
    public Month(String monthName) {
        switch (monthName.toLowerCase()) {
            case "january": monthNumber = 1; break;
            case "february": monthNumber = 2; break;
            case "march": monthNumber = 3; break;
            case "april": monthNumber = 4; break;
            case "may": monthNumber = 5; break;
            case "june": monthNumber = 6; break;
            case "july": monthNumber = 7; break;
            case "august": monthNumber = 8; break;
            case "september": monthNumber = 9; break;
            case "october": monthNumber = 10; break;
            case "november": monthNumber = 11; break;
            case "december": monthNumber = 12; break;
            default: monthNumber = 1; break;
        }    
    }
    
    // Set a new month number
    public void setMonthNumber(int month) {
        if (month < 1 || month > 12) {
            monthNumber = 1;
        } else {
            monthNumber = month;
        }
    }
    
    // Get the number of the month
    public int getMonthNumber() {
        return monthNumber;
    }
    
    // Get the name of the month
    public String getMonthName() {
        switch (monthNumber) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Invalid";
        }
    }   
    
    // Returns the name of the month
    public String toString() {
        return getMonthName();
    }

    // Check if two months are the same
    public boolean equals(Month other) {
        return this.monthNumber == other.monthNumber;
    }

    // greaterThan method
    public boolean greaterThan(Month other) {
        return this.monthNumber > other.monthNumber;
    }

    // lessThan method
    public boolean lessThan(Month other) {
        return this.monthNumber < other.monthNumber;
    }
}

