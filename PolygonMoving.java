// Tony Trinh
// November 19, 2025
// Assignment 17
// This program displays a polygon at the bottom of the screen. 
// When the user presses the spacebar, the polygon moves to the top. 
// Pressing the spacebar again moves it back to the bottom.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;

public class PolygonMoving extends Application {

    private boolean atTop = false;   // Tracks if the polygon is at the top
    
    @Override
    public void start(Stage primaryStage) {

        // Create the polygon shape
        Polygon diamond = new Polygon();
        diamond.getPoints().addAll(
                160.0, 20.0,
                300.0, 120.0,
                160.0, 220.0,
                20.0, 120.0,
                160.0, 20.0
        );
        
        // Scale and position at the bottom
        diamond.setScaleX(0.5);
        diamond.setScaleY(0.5);
        diamond.setLayoutX(150);     // Horizontal position
        diamond.setLayoutY(300);     // Bottom position
        
        // Setup Layout
        Pane root = new Pane();
        root.getChildren().add(diamond);
        
        Scene scene = new Scene(root, 600, 500);

        // Move polygon when spacebar is pressed
        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.SPACE) { 
                if (!atTop) {
                    diamond.setLayoutY(0);     // Move to top
                    atTop = true;
                } else {
                    diamond.setLayoutY(300);   // Move back to bottom
                    atTop = false;
                }
            }
        });

        primaryStage.setTitle("Polygon Moving");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);  
    }
}
