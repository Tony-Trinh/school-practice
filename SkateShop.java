// Tony Trinh
// November 3, 2025
// Assignment 15
// Skate Shop — lets the user choose skateboard parts and shows the subtotal,
// 7% sales tax, and total cost for the order.

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SkateShop extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Create ComboBox for Decks
        ComboBox<String> decksBox = new ComboBox<>();
        decksBox.getItems().addAll( "The Master Thrasher $60",
                                    "The Dictator $45",
                                    "The Street King $50" );
        // Create ComboBox for Truck Assemblies
        ComboBox<String> truckBox = new ComboBox<>();
        truckBox.getItems().addAll( "7.75-inch axle $35",
                                    "8-inch axle $40",
                                    "8.5-inch axle $45" );
        
        // Create ComboBox for Wheels
        ComboBox<String> wheelsBox = new ComboBox<>();
        wheelsBox.getItems().addAll( "51 mm $20",
                                     "55 mm $22",
                                     "58 mm $24",
                                     "61 mm $28" );
        
        // Create ListView for miscellaneous products
        ListView<String> productList = new ListView<>();
        productList.getItems().addAll( "Grip tape: $10",
                                     "Bearings: $30",
                                     "Riser pads: $2",
                                     "Nuts & bolts kit: $3" );
        
        // Allow multiple selections
        productList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        // Labels for subtotal, tax, total
        Label subtotalLabel = new Label("Subtotal: $0.00");
        Label taxLabel = new Label("Tax (7%): $0.00");
        Label totalLabel = new Label("Total: $0.00");
        
        // Create button to calculator total
        Button calcButton = new Button("Show Total");
        calcButton.setOnAction(e -> {
            double deckCost = 0;
            double truckCost = 0;
            double wheelCost = 0;
            double productCost = 0;
            
            // Get Decks selection
            String deck = decksBox.getValue();
            if (deck != null) {
                if (deck.equals("The Master Thrasher $60")) deckCost = 60;
                else if (deck.equals("The Dictator $45")) deckCost = 45;
                else if (deck.equals("The Street King $50")) deckCost = 50;
            }
            
            //Get Truck Assemblies selection
            String truck = truckBox.getValue();
            if (truck != null) {
                if(truck.equals("7.75-inch axle $35")) truckCost = 35;
                else if(truck.equals("8-inch axle $40")) truckCost = 40;
                else if(truck.equals("8.5-inch axle $45")) truckCost = 45;
            }
            
            // Get Wheels selection
            String wheel = wheelsBox.getValue();
            if (wheel != null) {
                if (wheel.equals("51 mm $20")) wheelCost = 20;
                else if (wheel.equals("55 mm $22")) wheelCost = 22;
                else if (wheel.equals("58 mm $24")) wheelCost = 24;
                else if (wheel.equals("61 mm $28")) wheelCost = 28;
            }
            
            // Allow multiple selections
            ObservableList<String> selectedItems = productList.getSelectionModel().getSelectedItems();
            
            // Add prices based on selected items
            for (String item: selectedItems) {
                if (item.equals("Grip tape: $10")) productCost += 10;
                else if (item.equals("Bearings: $30")) productCost += 30;
                else if (item.equals("Riser pads: $2")) productCost += 2;
                else if (item.equals("Nuts & bolts kit: $3")) productCost += 3;
            }
            
            // Calculate subtotal, tax, total
            double subtotal = deckCost + truckCost + wheelCost + productCost;
            double tax = subtotal * 0.07;
            double total = subtotal + tax;
            
            // Update labels
            subtotalLabel.setText(String.format("Subtotal: $%.2f", subtotal));
            taxLabel.setText(String.format("Tax (7%%): $%.2f", tax));
            totalLabel.setText(String.format("Total: $%.2f", total));   
            
        });
        
        // Layout
        VBox layout = new VBox(10);
        layout.getChildren().addAll(new Label("Select Decks:"), decksBox,
                                    new Label("Select Truck Assemblies:"), truckBox,
                                    new Label("Select Wheels:"), wheelsBox,
                                    new Label("Select Miscellaneous Products (Ctrl/Cmd + click for multiple):"), productList,
                                    calcButton,
                                    subtotalLabel,
                                    taxLabel,
                                    totalLabel);

        // Scene Setup
        Scene scene = new Scene(layout, 400, 500);
        primaryStage.setTitle("SkateBoard Products");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
