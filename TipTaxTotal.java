// Tony Trinh
// October 20, 2025
// Assignment 12
// This program asks the user to enter the food charge,
// then calculates an 18% tip, 7% tax, and shows the total

import javafx.application.Application;   
import javafx.scene.Scene;              
import javafx.scene.control.Button;      
import javafx.scene.control.Label;       
import javafx.scene.control.TextField;   
import javafx.scene.layout.VBox;         
import javafx.stage.Stage;               

public class TipTaxTotal extends Application {
    public static void main(String[] args) {
        launch(args);                     // Start JavaFX application
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        TextField foodCharge = new TextField();       // Create text box for input
        foodCharge.setPromptText("Enter food charge:"); // Text inside box
        
        Label result = new Label("Result will show here"); // Label to show output
        
        Button calBtn = new Button("Calculate");      // Create button
        
        // Action when button is clicked
        calBtn.setOnAction(e -> {
            double charge = Double.parseDouble(foodCharge.getText()); // Get number
            double tip = charge * 0.18;     // Calculate 18% tip
            double tax = charge * 0.07;     // Calculate 7% tax
            double total = charge + tip + tax; // Add up total
            
            // Show all results in label
            result.setText("Food Charge: $" + String.format("%.2f", charge) + 
                           "\nTip (18%): $" + String.format("%.2f", tip) +
                           "\nTax (7%): $" + String.format("%.2f", tax) +
                           "\nTotal: $" + String.format("%.2f", total));
        });
        
        VBox root = new VBox(10);          // Create layout with 10px spacing
        root.getChildren().addAll(foodCharge, calBtn, result); // Add items to layout

        Scene scene = new Scene(root, 300, 200); // Set window size
        primaryStage.setTitle("Tip, Tax, and Total"); // Set title
        primaryStage.setScene(scene);        // Add scene to window
        primaryStage.show();                 // Display window
    }
}
