// Tony Trinh
// November 11, 2025
// Assignment 16
// Shopping Cart System: lets you choose books, add them to a cart,
// and see the total price with tax and discount.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ShoppingCartSystem extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Create ListView for Books
        ListView<String> listBook = new ListView<>();
        listBook.getItems().addAll("I Did It Your Way, 11.95",
                                   "The History of Scotland, 14.50",
                                   "Learn Calculus in One Day, 29.95",
                                   "Feel the Stress, 18.50",
                                   "Great Poems, 12.95",
                                   "Europe on a Shoestring, 10.95",
                                   "The Life of Mozart, 14.50" );
        
        // Create Shopping Cart
        ListView<String> cart = new ListView<>();
        
        // Labels for subtotal, tax, total
        Label subtotalLabel = new Label("Subtotal: $0.00");
        Label taxLabel = new Label("Tax (7%): $0.00");
        Label discountLabel = new Label("Discount(10%): $0.00");
        discountLabel.setVisible(false); // hide  discount label
        discountLabel.setManaged(false); // remove space of discount
        Label totalLabel = new Label("Total: $0.00");
        
        // Create Buttons
        Button addBtn = new Button("Add ->");
        Button removeBtn = new Button("<- Remove");
        Button clearBtn = new Button("Clear Cart");
        Button checkOutBtn = new Button("Check Out");
        
        // Add Button: move selected book to the cart
        addBtn.setOnAction(e -> {
            String selected = listBook.getSelectionModel().getSelectedItem();
            if (selected != null && !cart.getItems().contains(selected)) {
                cart.getItems().add(selected);
            }
        });
        
        // Remove Button: remove selected book from cart
        removeBtn.setOnAction(e -> {
            String selected = listBook.getSelectionModel().getSelectedItem();
            if (selected != null) {
                cart.getItems().remove(selected);
            }
        });
        
        // Clear Button: empty the cart, also hide discount
        clearBtn.setOnAction(e -> {
            cart.getItems().clear();
            subtotalLabel.setText("Subtotal: $0.00");
            taxLabel.setText("Tax (7%): $0.00");
            discountLabel.setText("Discount (10%): $0.00");
            totalLabel.setText("Total: $0.00");
            discountLabel.setVisible(false);
            discountLabel.setManaged(false);
        });
        
        // Check Out Button, and calculate total
        checkOutBtn.setOnAction(e -> {
            double totalCost = 0;
             
            // Set the prices
            for (String book : cart.getItems()) {
                if (book.equals("I Did It Your Way, 11.95")) totalCost += 11.95;
                else if (book.equals("The History of Scotland, 14.50")) totalCost += 14.50;
                else if (book.equals("Learn Calculus in One Day, 29.95")) totalCost += 29.95;
                else if (book.equals("Feel the Stress, 18.50")) totalCost += 18.50;
                else if (book.equals("Great Poems, 12.95")) totalCost += 12.95;
                else if (book.equals("Europe on a Shoestring, 10.95")) totalCost += 10.95;
                else if (book.equals("The Life of Mozart, 14.50")) totalCost += 14.50;
            }
            
            double subTotal = totalCost;
            double tax = subTotal * 0.07;  // 7% tax
            double discount = 0;  
            
            
            // 10% discount if the total before taxes is greater than $50.00
            if (subTotal > 50) {
                discount = subTotal * 0.10;  // 10% discount
                discountLabel.setText(String.format("Discount (10%%): -$%.2f", discount));
                discountLabel.setVisible(true); // show only if discount applies
                discountLabel.setManaged(true); // show and take space again
            } else {
                discountLabel.setVisible(false); // hide if no discount
                discountLabel.setManaged(false); // hide and remove space
            }
            
            double total = subTotal + tax - discount;
            
            // Update labels
            subtotalLabel.setText(String.format("Subtotal: $%.2f", subTotal));
            taxLabel.setText(String.format("Tax (7%%): $%.2f", tax));
            totalLabel.setText(String.format("Total: $%.2f", total));
        });
 
        // Layout setup
        VBox leftBox = new VBox(10, new Label("Available Books"), listBook);
        VBox middleBox = new VBox(10, addBtn, removeBtn, clearBtn, checkOutBtn);
        VBox rightBox = new VBox(10, new Label("Your Cart"), cart, subtotalLabel,
                                 taxLabel, discountLabel, totalLabel);
        HBox root = new HBox(15, leftBox, middleBox, rightBox);
        
        // Create and show window
        Scene scene = new Scene(root, 600, 350);
        primaryStage.setTitle("Book Shopping Cart");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
