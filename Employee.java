// Tony Trinh
// 09/23/2025
// Assignment 6
// This class creates an Employee with name, number, and hire date.

package java2.fall2025; 

public class Employee { 
    private String name;            // employee name
    private String employeeNumber;  // employee number
    private String hireDate;        // hire date
    
    // full constructor
    public Employee(String n, String num, String date){
        name = n;               // set name
        employeeNumber = num;   // set number
        hireDate = date;        // set date
    }
    
    // default constructor
    public Employee(){
        name = "";              // empty name
        employeeNumber = "";    // empty number
        hireDate = "";          // empty date
    }
    
    // set name
    public void setName(String n){
        name = n;
    }
    
    // set number with check
    public void setEmployeeNumber (String e){
        if (isValidEmpNum(e))
            employeeNumber = e;
        else
            employeeNumber = "";
    }
    
    // set date
    public void setHireDate(String h){
        hireDate = h;
    }
    
    // get name
    public String getName(){
        return name;
    }
    
    // get number
    public String getEmployeeNumber(){
        return employeeNumber;
    }
    
    // get date
    public String getHireDate(){
        return hireDate;
    }
    
    // check valid number
    private boolean isValidEmpNum (String e){
        boolean status = true; // assume ok
        
        if (e.length() != 5) // must be 5 chars
            status = false;
        else {
            if ((!Character.isDigit(e.charAt(0))) ||  // first 3 digits
                (!Character.isDigit(e.charAt(1))) ||
                (!Character.isDigit(e.charAt(2))) ||
                (e.charAt(3) != '-') ||              // 4th must be '-'
                (Character.toUpperCase(e.charAt(4)) < 'A') || // last A–M
                (Character.toUpperCase(e.charAt(4)) > 'M'))
                  status = false;
        }
        return status; // return result
    }
    
    // string output
    public String toString(){
        String str = "Name: " + name + "\nEmployee Number: ";
        
        if (employeeNumber == "") // invalid number
            str += "INVALID EMPLOYEE NUMBER";
        else
            str += employeeNumber;
        
        str += ("\nHire Date: " + hireDate); // add date
        return str; // return text
    }
}
