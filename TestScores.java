// Tony Trinh
// October 7, 2025
// Assignment 9
// This class checks if test scores are valid and finds the average.

package java2.fall2025;

public class TestScores {
    private double[] scores; // holds all test scores

    // Constructor checks if each score is valid
    public TestScores(double[] scores) throws TestScoresException {
        this.scores = new double[scores.length]; // copy array size
        String badScores = ""; // store invalid scores
        
        for (int i = 0; i < scores.length; i++) {  // go through each score
            if (scores[i] < 0 || scores[i] > 100) { // check for invalid score
                badScores += scores[i] + ", "; // add to invalid list
            } else {
                this.scores[i] = scores[i]; // store valid score
            }
        }    
        
        // If any invalid scores found, show them all
        if (!badScores.isEmpty()) {
            throw new TestScoresException("Invalid scores: " + badScores);
        }
    }

    // Method to find average of all scores
    public double getAverage() {
        double total = 0; // total of all scores
        for (double score : scores) { // add each score
            total += score;
        }
        return total / scores.length; // return average
    }
}
