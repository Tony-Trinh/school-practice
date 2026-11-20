// Tony Trinh
// November 18, 2025
// Assignment 17
// Image Swap - Dog image changes to Cat image on mouse hover

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ImageOfAnimal extends Application {

    @Override
    public void start(Stage primaryStage) {
        Image dog = new Image("/images/dog.png");   // Load dog image
        Image cat = new Image("/images/cat.png");   // Load cat image
        
        ImageView animal = new ImageView(dog);      // Display dog image first

        animal.setFitWidth(200);                    // Set image width
        animal.setFitHeight(200);                   // Set image height
        animal.setPreserveRatio(false);             // Do not keep original ratio
        animal.setX(150);                           // X position on screen
        animal.setY(150);                           // Y position on screen

        animal.setOnMouseEntered(e -> {             // When mouse enters
            animal.setImage(cat);                   // Switch to cat image
        });

        animal.setOnMouseExited(e -> {              // When mouse leaves
            animal.setImage(dog);                   // Switch back to dog image
        });
        
        // Create and show window
        Pane root = new Pane();                  
        root.getChildren().add(animal);      
        
        Scene scene = new Scene(root, 500, 500);   
        
        primaryStage.setTitle("Image Swap");     
        primaryStage.setScene(scene);       
        primaryStage.show();                
    }

    public static void main(String[] args) {
        launch(args);                               
    }
}
