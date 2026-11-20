// Tony Trinh
// October 28, 2025
// Assignment 13
// This program rolls two dice using images and shows which die is greater.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import java.util.Random;

public class DiceSimulator extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Make an array to hold 6 dice images
        Image[] diceImages = new Image[6];
        for (int i = 0; i < 6; i++) {
            // Load each dice picture
            diceImages[i] = new Image("/images/Die" + (i + 1) + ".png");
        }

        // Create 2 dice pictures to show on screen
        ImageView die1View = new ImageView(diceImages[0]);
        ImageView die2View = new ImageView(diceImages[0]);
        die1View.setPreserveRatio(true);  // Keep shape
        die2View.setPreserveRatio(true);  // Keep shape

        // Text that shows results
        Label resultLabel = new Label("Click 'Roll Dice' to start!");

        // Button to roll dice
        Button rollButton = new Button("Roll Dice");

        Random rand = new Random();  // Random number maker

        // When button is clicked, roll dice
        rollButton.setOnAction(e -> {
            int die1 = rand.nextInt(6) + 1;  // Dice 1 random 1–6
            int die2 = rand.nextInt(6) + 1;  // Dice 2 random 1–6

            // Change images to match rolls
            die1View.setImage(diceImages[die1 - 1]);
            die2View.setImage(diceImages[die2 - 1]);

            // Show who wins or tie
            if (die1 > die2)
                resultLabel.setText("Die 1 wins! (" + die1 + " vs " + die2 + ")");
            else if (die1 < die2)
                resultLabel.setText("Die 2 wins! (" + die1 + " vs " + die2 + ")");
            else
                resultLabel.setText("It's a tie! (" + die1 + " vs " + die2 + ")");
        });

        // Put dice side by side
        HBox diceBox = new HBox(20, die1View, die2View);
        diceBox.setAlignment(Pos.CENTER);

        // Stack everything up and center
        VBox root = new VBox(20, diceBox, rollButton, resultLabel);
        root.setAlignment(Pos.CENTER);

        // Make and show the window
        Scene scene = new Scene(root, 400, 350);
        primaryStage.setTitle("Dice Simulator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
