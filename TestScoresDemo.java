// Tony Trinh
// October 7, 2025
// Assignment 9
// This program checks test scores and throws an exception if any score is invalid.

package java2.fall2025;


public class TestScoresDemo {
    public static void main(String[] args) {
        // Test with valid scores
        try {
            double[] myScores = {75.5, 87.0, 99.0, 80.5}; // valid scores
            TestScores test = new TestScores(myScores);    // create object
            System.out.println("Average score: " + test.getAverage()); // print average
        } 
        catch (TestScoresException e) {
            System.out.println(e.getMessage()); // show error message
        }

        // Test with an invalid score
        try {
            double[] badScores = {70, -3.0 ,90, 104, 130}; // invalid (-3, 104, 130)
            TestScores badTest = new TestScores(badScores); // create object
            System.out.println("Average score: " + badTest.getAverage());
        } 
        catch (TestScoresException e) {
            System.out.println(e.getMessage()); // show error message
        }
    }
}
