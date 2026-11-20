// Tony Trinh
// October 20, 2025
// Assignment 11
// This JavaFX program lets the user enter their title, first, middle, and last name,
// then click buttons to show different name formats.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NameFormatter extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        // Create text fields for user input
        TextField firstField = new TextField();        // for first name
        firstField.setPromptText("First Name");
        
        TextField middleField = new TextField();       // for middle name
        middleField.setPromptText("Middle Name");
        
        TextField lastField = new TextField();         // for last name
        lastField.setPromptText("Last Name");
        
        TextField titleField = new TextField();        // for title (Mr., Ms., etc.)
        titleField.setPromptText("Title (Mr., Mrs., Ms., Dr, etc.)");
        
        // Label to show the result
        Label resultLabel = new Label("Result will show here");
        
        // Create buttons for each name format
        Button b1 = new Button("Ms. Kelly Jane Smith");
        Button b2 = new Button("Kelly Jane Smith");
        Button b3 = new Button("Kelly Smith");
        Button b4 = new Button("Smith, Kelly Jane, Ms.");
        Button b5 = new Button("Smith, Kelly Jane");
        Button b6 = new Button("Smith, Kelly");
        
        // Button 1: show Title + First + Middle + Last
        b1.setOnAction(e -> {
            resultLabel.setText(titleField.getText() + " " +
                                firstField.getText() + " " +
                                middleField.getText() + " " +
                                lastField.getText());
        });

        // Button 2: show First + Middle + Last
        b2.setOnAction(e -> {
            resultLabel.setText(firstField.getText() + " " +
                                middleField.getText() + " " +
                                lastField.getText());
        });

        // Button 3: show First + Last
        b3.setOnAction(e -> {
            resultLabel.setText(firstField.getText() + " " +
                                lastField.getText());
        });

        // Button 4: show Last, First Middle, Title
        b4.setOnAction(e -> {
            resultLabel.setText(lastField.getText() + ", " +
                                firstField.getText() + " " +
                                middleField.getText() + ", " +
                                titleField.getText());
        });

        // Button 5: show Last, First Middle
        b5.setOnAction(e -> {
            resultLabel.setText(lastField.getText() + ", " +
                                firstField.getText() + " " +
                                middleField.getText());
        });

        // Button 6: show Last, First
        b6.setOnAction(e -> {
            resultLabel.setText(lastField.getText() + ", " +
                                firstField.getText());
        });
        
        // Create layout and add all elements
        VBox layout = new VBox(10);   // VBox with 10px spacing
        layout.getChildren().addAll(firstField, middleField, lastField, titleField,
                                    b1, b2, b3, b4, b5, b6, resultLabel);

        // Create the scene and set up the stage (window)
        Scene scene = new Scene(layout, 400, 400);   // width 400, height 400
        primaryStage.setTitle("Name Formatter");     // window title
        primaryStage.setScene(scene);                // attach scene to window
        primaryStage.show();                         // show the window
    }
}
