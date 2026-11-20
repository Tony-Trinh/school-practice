// Tony Trinh
// September 9, 2025
// Assignment 3
// This program tests the Month class using all the constructors and methods

package java2.fall2025;

public class MonthTest {

    public static void main(String[] args) {
        // Try the no-arg constructor
        Month m1 = new Month();
        System.out.println("No-arg constructor: " + m1); // Should be January

        // Try the number constructor
        Month m2 = new Month(4);
        System.out.println("Month(4): " + m2); // Should be April

        // Try a bad number (should go to 1)
        Month m3 = new Month(20);
        System.out.println("Month(20): " + m3); // Should be January

        // Try the name constructor
        Month m4 = new Month("October");
        System.out.println("Month(\"October\"): " + m4); // Should be October

        // Try a bad name (should go to January)
        Month m5 = new Month("Nothing");
        System.out.println("Month(\"Nothing\"): " + m5); // Should be January

        // Set month to 6
        m1.setMonthNumber(6);
        System.out.println("m1 set to 6: " + m1); // Should be June

        // Try equals
        Month m6 = new Month(6);
        System.out.println("m1 equals m6? " + m1.equals(m6)); // Should be true

        // Try greaterThan
        System.out.println("m6 > m2? " + m6.greaterThan(m2)); // 6 > 4, should be true

        // Try lessThan
        System.out.println("m2 < m4? " + m2.lessThan(m4)); // 4 < 10, should be true
    
    }    
}
