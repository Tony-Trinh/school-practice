// Tony Trinh
// November 18, 2025
// Assignment 17
// Draw a blue star with my name inside


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StarShape extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Create a 5-point star using Polygon
        Polygon star = new Polygon();
        star.getPoints().addAll(
                150.0, 20.0,     
                180.0, 110.0,
                270.0, 110.0,
                200.0, 165.0,
                230.0, 250.0,
                150.0, 200.0,
                70.0, 250.0,
                100.0, 165.0,
                30.0, 110.0,
                120.0, 110.0
        );

        star.setFill(Color.BLUE);        // Star color
        star.setStroke(Color.BLACK);     // Outline color
        star.setStrokeWidth(3);          // Outline thickness

        // Create text (your name) inside the star
        Text name = new Text("Tony Trinh");
        name.setFont(Font.font("Arial", 20)); // Font size
        name.setFill(Color.WHITE);            // Text color
        name.setX(100);                       // X position of name
        name.setY(150);                       // Y position of name
        
        // Create and show window
        Pane pane = new Pane();               
        pane.getChildren().addAll(star, name); 

        Scene scene = new Scene(pane, 300, 300); 
        primaryStage.setScene(scene);          
        primaryStage.setTitle("Star with My Name"); 
        primaryStage.show();                     
    }

    public static void main(String[] args) {
        launch(args); 
    }
}
