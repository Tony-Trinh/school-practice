import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.input.KeyCode;  // Code add

public class DormAndMealPlanCalculator extends Application {
    
    public static void main (String[] args){
    //launch the application
        launch (args);
    }  
    public void start(Stage primaryStage) {
        
        // Create ComboBoxes for dorms and meal plans
        ComboBox<String> dormBox = new ComboBox<>();
        dormBox.getItems().addAll("Allen Hall - $1800", "Pike Hall - $2200", 
                                  "Farthing Hall - $2800", "University Suites - $3000");
        
         Label dormPromptLabel = new Label("Select a Dorm");
         VBox dormVBox = new VBox(10, dormPromptLabel, dormBox);
                                  
        ComboBox<String> mealBox = new ComboBox<>();
        mealBox.getItems().addAll("7 meals per week" ,
                                   "14 meals per week", 
                                  "Unlimited meals per week");

        // Labels
        Label mealPromptLabel = new Label("Select a meal plan");
        VBox mealVBox = new VBox(10, mealPromptLabel,mealBox);
        HBox dormAndMealHBox = new HBox(10, dormVBox, mealVBox);
        
        //creat the output lable for the totlal cost
        Label costDescriptor = new Label ("Cost");
        Label costOutputLabel = new Label ("0.00");
        HBox costHBox = new HBox (10,costDescriptor, costOutputLabel);
        costHBox.setAlignment(Pos.CENTER);
        
        // Button for calcultion
        Button calcButton = new Button("Calculate Cost");
        
        
        
        // Handle button click
        calcButton.setOnAction(event -> {
            double dormCharges = 0.0;
            double mealCharges = 0.0;
            double totalCharges = 0.0;

            if (dormBox.getValue() != null) {
                String dorm = dormBox.getValue();
                if (dorm.equals("Allen Hall - $1800")) 
                dormCharges = 1800.0;
                else if (dorm.equals("Pike Hall - $2200")) 
                dormCharges = 2200.;
                else if (dorm.equals( "Farthing Hall - $2800")) 
                dormCharges = 2800;
                else if (dorm.equals("University Suites - $3000"))
                dormCharges = 3000;
                else
                    dormCharges = 0.0;
            }

            if (mealBox.getValue() != null) {
                String meal = mealBox.getValue();
                if (meal.equals("7 meals per week"))
                mealCharges = 600;
                else if (meal.equals("14 meals per week"))
                mealCharges = 1100;
                else if (meal.equals("Unlimited meals per week"))
                mealCharges = 1800;
                else
                mealCharges = 0.0;
            }    
             
            //get the total charges
            totalCharges = dormCharges + mealCharges;
        
            //display the chargares
            costOutputLabel.setText(String.format("%,.2f", totalCharges));
        });       
        
        // Layout of VBox
        VBox mainvbox = new VBox(10,dormAndMealHBox, costHBox,calcButton );
        mainvbox.setAlignment(Pos.CENTER);
        mainvbox.setPadding(new Insets(10));

        // Scene
        Scene scene = new Scene(mainvbox);

        // Allow pressing ENTER to trigger the button
        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                calcButton.fire();  // manually trigger the button          
            }
        });    
        
        //title
        primaryStage.setTitle("Dorm and Meal Plan Calculator");
    
        // Stage
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}