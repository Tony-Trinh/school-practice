// Tony Trinh
// November 3, 2025
// Assignment 14
// This program lets the user choose a dorm and a meal plan,
// then shows the total cost for the semester.

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DormMealCost extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Create ComboBox for dorms
        ComboBox<String> dormBox = new ComboBox<>();
        dormBox.getItems().addAll( "Allen Hall",
                                   "Pike Hall",
                                   "Farthing Hall",
                                   "University Suites");
        
        // Create ComboBox for meal plans
        ComboBox<String> mealBox = new ComboBox<>();
        mealBox.getItems().addAll( "7 meals per week",
                                  "14 meals per week",
                                  "Unlimited meals");
        
        // Label to show result
        Label totalLabel = new Label("Total: $0.00");
        
        // Create button to calculate total
        Button calcButton = new Button("Show Total");
        
        calcButton.setOnAction(e -> {
            double dormCost = 0;
            double mealCost = 0;
            
            // Get dorm selection
            String dorm = dormBox.getValue();
            if (dorm != null) {
                if (dorm.equals("Allen Hall")) dormCost = 1800;
                else if (dorm.equals("Pike Hall")) dormCost = 2200;
                else if (dorm.equals("Farthing Hall")) dormCost = 2800;
                else if (dorm.equals("University Suites")) dormCost = 3000;                     
            }
            
            //Get meal plan selection
            String meal = mealBox.getValue();
            if (meal != null) {
                if (meal.equals("7 meals per week")) mealCost = 600;
                else if (meal.equals("14 meals per week")) mealCost = 1100;
                else if (meal.equals("Unlimited meals")) mealCost = 1100;
            }
            
            // Calculate total
            double total = dormCost + mealCost;
            totalLabel.setText(String.format("Total: $%.2f", total));
        });
        
        // Layout
        VBox layout = new VBox(10);
        layout.getChildren().addAll( new Label("Choose a Dorm:"), dormBox,
                                     new Label("Choose a Meal Plan:"), mealBox,
                                     calcButton, totalLabel );
        
        // Scene Setup
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setTitle("Dorm and Meal Plan Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
