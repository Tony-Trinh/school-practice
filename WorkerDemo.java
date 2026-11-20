// Tony Trinh
// 09/23/2025
// Assignment 6
// This demo tests Employee, ProductionWorker, and ShiftSupervisor classes.

package java2.fall2025; 

public class WorkerDemo { 
    public static void main(String[] args) {
        // Test ProductionWorker
        ProductionWorker pw = new ProductionWorker(
            "John Smith", "123-A", "11-15-2015",
            ProductionWorker.DAY_SHIFT, 26.50);

        System.out.println("Here's the first production worker:");
        System.out.println(pw);

        // Test ProductionWorker
        ProductionWorker pw2 = new ProductionWorker();
        pw2.setName("Joan Jones");
        pw2.setEmployeeNumber("222-L");
        pw2.setHireDate("12-12-2015");
        pw2.setShift(ProductionWorker.NIGHT_SHIFT);
        pw2.setPayRate(28.50);

        System.out.println("\nHere's the second production worker:");
        System.out.println(pw2);

        // Test ShiftSupervisor 
        ShiftSupervisor visor = new ShiftSupervisor(
            "Tony Trinh", "789-C", "01-10-2023",
            65000, 5000);

        System.out.println("\nHere's the shift supervisor:");
        System.out.println(visor);
    }
}
