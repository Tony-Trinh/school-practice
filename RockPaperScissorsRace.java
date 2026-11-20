// Tony Trinh
// Assignment 20: Rock Paper Scissors Race Game
// December 12, 2025
// This program lets two players play Rock Paper Scissors.
// Each win moves the player forward in a race. First player to reach the end wins.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.animation.PauseTransition;
import javafx.util.Duration;

public class RockPaperScissorsRace extends Application {

    int p1Pos = 1;
    int p2Pos = 11;

    boolean p1Ready = false;
    boolean p2Ready = false;

    boolean inputLocked = false;

    @Override
    public void start(Stage primaryStage) {

        // screen where players type their names
        Pane namePane = new Pane();
        Scene nameScene = new Scene(namePane, 815, 600);
        
        Text bigTitle = new Text("Rock Paper Scissors Race");
        bigTitle.setFont(Font.font("Arial", 40));
        bigTitle.setX(170);
        bigTitle.setY(50);
        
        Label labelTitle = new Label("Enter Player Names");
        labelTitle.setFont(Font.font("Arial", 36));
        labelTitle.setLayoutX(230);
        labelTitle.setLayoutY(100);

        Label labelP1 = new Label("Player 1 Name:");
        labelP1.setLayoutX(200);
        labelP1.setLayoutY(200);

        javafx.scene.control.TextField inputP1 = new javafx.scene.control.TextField();
        inputP1.setLayoutX(350);
        inputP1.setLayoutY(195);

        Label labelP2 = new Label("Player 2 Name:");
        labelP2.setLayoutX(200);
        labelP2.setLayoutY(260);

        javafx.scene.control.TextField inputP2 = new javafx.scene.control.TextField();
        inputP2.setLayoutX(350);
        inputP2.setLayoutY(255);

        Button btnStart = new Button("Start Game");
        btnStart.setLayoutX(360);
        btnStart.setLayoutY(330);

        namePane.getChildren().addAll(bigTitle, labelTitle, labelP1, inputP1, labelP2, inputP2, btnStart);

        // makes the race track circles
        Pane root = new Pane();

        Player p1 = new Player();
        Player p2 = new Player();
        Round round = new Round(p1, p2);
        Game game = new Game();

        Circle[] trackCircles = new Circle[13];

        for (int i = 0; i <= 12; i++) {
            trackCircles[i] = new Circle(30, Color.LIGHTGRAY);
            trackCircles[i].setCenterX(35 + i * 62);
            trackCircles[i].setCenterY(300);

            Text t = new Text();
            t.setFont(Font.font("Arial", 10));
            t.setText("END");
            t.setX(24);
            t.setY(305);

            switch (i) {
                case 0:
                    trackCircles[i].setFill(Color.ORANGE);
                    break;
                case 1:
                    trackCircles[i].setFill(Color.RED);
                    break;
                case 11:
                    trackCircles[i].setFill(Color.BLUE);
                    break;
                case 12:
                    trackCircles[i].setFill(Color.ORANGE);
                    t.setX(770);
                    break;
            }

            root.getChildren().addAll(trackCircles[i], t);
        }

        // loads the rock, paper, scissors pictures
        Image rockImage = new Image(getClass().getResource("/images/rock.png").toExternalForm());
        Image paperImage = new Image(getClass().getResource("/images/paper.png").toExternalForm());
        Image scissorsImage = new Image(getClass().getResource("/images/scissors.png").toExternalForm());

        // icons at the bottom for both players
        ImageView rockP1 = new ImageView(rockImage);
        rockP1.setFitWidth(60);
        rockP1.setFitHeight(60);
        rockP1.setX(25);
        rockP1.setY(460);

        ImageView paperP1 = new ImageView(paperImage);
        paperP1.setFitWidth(60);
        paperP1.setFitHeight(60);
        paperP1.setX(90);
        paperP1.setY(460);

        ImageView scissorsP1 = new ImageView(scissorsImage);
        scissorsP1.setFitWidth(60);
        scissorsP1.setFitHeight(60);
        scissorsP1.setX(155);
        scissorsP1.setY(460);

        ImageView rockP2 = new ImageView(rockImage);
        rockP2.setFitWidth(60);
        rockP2.setFitHeight(60);
        rockP2.setX(585);
        rockP2.setY(460);

        ImageView paperP2 = new ImageView(paperImage);
        paperP2.setFitWidth(60);
        paperP2.setFitHeight(60);
        paperP2.setX(650);
        paperP2.setY(460);

        ImageView scissorsP2 = new ImageView(scissorsImage);
        scissorsP2.setFitWidth(60);
        scissorsP2.setFitHeight(60);
        scissorsP2.setX(715);
        scissorsP2.setY(460);

        // pictures that show the chosen move
        ImageView rockP1move = new ImageView(rockImage);
        rockP1move.setFitWidth(70);
        rockP1move.setFitHeight(70);
        rockP1move.setX(250);
        rockP1move.setY(155);

        ImageView paperP1move = new ImageView(paperImage);
        paperP1move.setFitWidth(70);
        paperP1move.setFitHeight(70);
        paperP1move.setX(250);
        paperP1move.setY(155);

        ImageView scissorsP1move = new ImageView(scissorsImage);
        scissorsP1move.setFitWidth(70);
        scissorsP1move.setFitHeight(70);
        scissorsP1move.setX(250);
        scissorsP1move.setY(155);

        ImageView rockP2move = new ImageView(rockImage);
        rockP2move.setFitWidth(70);
        rockP2move.setFitHeight(70);
        rockP2move.setX(500);
        rockP2move.setY(155);

        ImageView paperP2move = new ImageView(paperImage);
        paperP2move.setFitHeight(70);
        paperP2move.setFitWidth(70);
        paperP2move.setX(500);
        paperP2move.setY(155);

        ImageView scissorsP2move = new ImageView(scissorsImage);
        scissorsP2move.setFitWidth(70);
        scissorsP2move.setFitHeight(70);
        scissorsP2move.setX(500);
        scissorsP2move.setY(155);

        // labels that show player names
        Text p1NameLabel = new Text();
        p1NameLabel.setFont(Font.font("Arial", 22));
        p1NameLabel.setX(260);
        p1NameLabel.setY(130);

        Text p1NameTagLabel = new Text();
        p1NameTagLabel.setFont(Font.font("Arial", 22));
        p1NameTagLabel.setX(100);
        p1NameTagLabel.setY(400);

        Text p2NameLabel = new Text();
        p2NameLabel.setFont(Font.font("Arial", 22));
        p2NameLabel.setX(510);
        p2NameLabel.setY(130);

        Text p2NameTagLabel = new Text();
        p2NameTagLabel.setFont(Font.font("Arial", 22));
        p2NameTagLabel.setX(660);
        p2NameTagLabel.setY(400);

        root.getChildren().addAll(p1NameLabel, p2NameLabel, p1NameTagLabel, p2NameTagLabel);

        // text that shows round results
        Text roundResult = new Text();
        roundResult.setFont(Font.font("Arial", 26));
        roundResult.setX(310);
        roundResult.setY(360);

        // text that shows waiting messages
        Text waitText = new Text();
        waitText.setFont(Font.font("Arial", 26));
        waitText.setX(310);
        waitText.setY(360);

        root.getChildren().addAll(roundResult, waitText);

        // title and keyboard guides
        Text title = new Text("Rock Paper Scissors Race");
        title.setFont(Font.font("Arial", 40));
        title.setX(170);
        title.setY(50);

        Text keyP1 = new Text("A     S     D");
        keyP1.setFont(Font.font("Arial", 30));
        keyP1.setX(45);
        keyP1.setY(560);

        Text keyP2 = new Text("J      K      L");
        keyP2.setFont(Font.font("Arial", 30));
        keyP2.setX(608);
        keyP2.setY(560);

        // score counters
        Text p1Win = new Text("P1 Wins: 0");
        p1Win.setFont(Font.font("Arial", 15));
        p1Win.setX(26);
        p1Win.setY(450);

        Text p2Win = new Text("P2 Wins: 0");
        p2Win.setFont(Font.font("Arial", 15));
        p2Win.setX(585);
        p2Win.setY(450);

        Text p1Loss = new Text("P1 Losses: 0");
        p1Loss.setFont(Font.font("Arial", 15));
        p1Loss.setX(130);
        p1Loss.setY(450);

        Text p2Loss = new Text("P2 Losses: 0");
        p2Loss.setFont(Font.font("Arial", 15));
        p2Loss.setX(690);
        p2Loss.setY(450);

        Text ties = new Text("Ties: 0");
        ties.setFont(Font.font("Arial", 15));
        ties.setX(380);
        ties.setY(490);

        // game over text
        Text reset = new Text();
        reset.setFont(Font.font("Arial", 30));
        reset.setX(260);
        reset.setY(400);

        Text p1Won = new Text();
        p1Won.setFont(Font.font("Arial", 30));
        p1Won.setX(350);
        p1Won.setY(360);

        Text p2Won = new Text();
        p2Won.setFont(Font.font("Arial", 30));
        p2Won.setX(350);
        p2Won.setY(360);

        root.getChildren().addAll(
                keyP1, keyP2, rockP1, rockP2, paperP1, paperP2,
                scissorsP1, scissorsP2, p1Win, p2Win, p1Loss,
                p2Loss, ties, reset, p1Won, p2Won, title
        );

        Scene scene = new Scene(root, 815, 600);

        // update player names when Start button is pressed
        btnStart.setOnAction(e -> {
            String n1 = inputP1.getText().trim();
            String n2 = inputP2.getText().trim();

            if (n1.isEmpty()) n1 = "Player 1";
            if (n2.isEmpty()) n2 = "Player 2";

            p1.setPlayerName(n1);
            p2.setPlayerName(n2);

            p1NameLabel.setText(n1.toUpperCase());
            p2NameLabel.setText(n2.toUpperCase());
            p1NameTagLabel.setText(n1.toUpperCase());
            p2NameTagLabel.setText(n2.toUpperCase());

            primaryStage.setScene(scene);
        });

        // handles all key presses
        scene.setOnKeyPressed(e -> {

            if (inputLocked) return;

            // reset the game after someone wins
            if (game.gameOver) {

                int[] resetPos = game.resetPositions();
                p1Pos = resetPos[0];
                p2Pos = resetPos[1];

                p1.wins = p2.wins = 0;
                p1.losses = p2.losses = 0;
                p1.ties = p2.ties = 0;

                resetTrack(trackCircles);
                trackCircles[p1Pos].setFill(Color.RED);
                trackCircles[p2Pos].setFill(Color.BLUE);

                p1Ready = p2Ready = false;
                roundResult.setText("");
                waitText.setText("");
                reset.setText("");
                p1Won.setText("");
                p2Won.setText("");
                
                p1Win.setText("P1 Wins: 0");
                p2Win.setText("P2 Wins: 0");
                p1Loss.setText("P1 Losses: 0");
                p2Loss.setText("P2 Losses: 0");
                ties.setText("Ties: 0");

                root.getChildren().removeAll(
                        rockP1move, paperP1move, scissorsP1move,
                        rockP2move, paperP2move, scissorsP2move
                );

                game.gameOver = false;
                return;
            }

            // player 1 keys A S D
            if (e.getCode() == KeyCode.A) {
                p1.setChoice("rock");
                p1Ready = true;
                if (!p2Ready) 
                    waitText.setText("Waiting for " + p2.getPlayerName().toUpperCase() + "...");
            }
            if (e.getCode() == KeyCode.S) {
                p1.setChoice("paper");
                p1Ready = true;
                if (!p2Ready) 
                    waitText.setText("Waiting for " + p2.getPlayerName().toUpperCase() + "...");
            }
            if (e.getCode() == KeyCode.D) {
                p1.setChoice("scissors");
                p1Ready = true;
                if (!p2Ready) 
                    waitText.setText("Waiting for " + p2.getPlayerName().toUpperCase() + "...");
            }

            // player 2 keys J K L
            if (e.getCode() == KeyCode.J) {
                p2.setChoice("rock");
                p2Ready = true;
                if (!p1Ready) 
                    waitText.setText("Waiting for " + p1.getPlayerName().toUpperCase() + "...");
            }
            if (e.getCode() == KeyCode.K) {
                p2.setChoice("paper");
                p2Ready = true;
                if (!p1Ready) 
                    waitText.setText("Waiting for " + p1.getPlayerName().toUpperCase() + "...");
            }
            if (e.getCode() == KeyCode.L) {
                p2.setChoice("scissors");
                p2Ready = true;
                if (!p1Ready) 
                    waitText.setText("Waiting for " + p1.getPlayerName().toUpperCase() + "...");
            }

            // check if both players picked
            if (p1Ready && p2Ready) {

                waitText.setText("");

                int winner = round.getWinner();
                int oldP1 = p1Pos;
                int oldP2 = p2Pos;

                // show the chosen move pictures
                if (p1.choice.equals("rock")) root.getChildren().add(rockP1move);
                if (p1.choice.equals("paper")) root.getChildren().add(paperP1move);
                if (p1.choice.equals("scissors")) root.getChildren().add(scissorsP1move);

                if (p2.choice.equals("rock")) root.getChildren().add(rockP2move);
                if (p2.choice.equals("paper")) root.getChildren().add(paperP2move);
                if (p2.choice.equals("scissors")) root.getChildren().add(scissorsP2move);

                // decide who wins the round
                if (winner == 1) {
                    roundResult.setText(p1.getPlayerName().toUpperCase() + " Wins Round!");

                    // move the players on the track
                    if (oldP1 + 1 == oldP2) {
                        if (oldP1 + 1 <= 11) p1Pos = oldP2;
                        if (oldP2 + 1 <= 12) p2Pos = oldP2 + 1;
                    } else {
                        if (oldP1 + 1 <= 11) p1Pos = oldP1 + 1;
                    }
                    p1.addWin();
                    p2.addLoss();
                }
                else if (winner == 2) {
                    roundResult.setText(p2.getPlayerName().toUpperCase() + " Wins Round!");

                    // move the players on the track
                    if (oldP2 - 1 == oldP1) {
                        if (oldP2 - 1 >= 1) p2Pos = oldP1;
                        if (oldP1 - 1 >= 0) p1Pos = oldP1 - 1;
                    } else {
                        if (oldP2 - 1 >= 1) p2Pos = oldP2 - 1;
                    }
                    p2.addWin();
                    p1.addLoss();
                }
                else {
                    roundResult.setText("     Tie Round!");
                    p1.addTies();
                    p2.addTies();
                }

                // check if the game is over
                if (game.hasSomeoneWon(p1Pos, p2Pos)) {

                    resetTrack(trackCircles);
                    roundResult.setText("");

                    int gameWinner = game.getGameWinner(p1Pos, p2Pos);

                    if (gameWinner == 2) {
                        trackCircles[0].setFill(Color.RED);
                        trackCircles[p2Pos].setFill(Color.BLUE);
                        p2Won.setText(p2.getPlayerName().toUpperCase() + " WIN");
                    }

                    if (gameWinner == 1) {
                        trackCircles[12].setFill(Color.BLUE);
                        trackCircles[p1Pos].setFill(Color.RED);
                        p1Won.setText(p1.getPlayerName().toUpperCase() + " WIN");
                    }

                    game.gameOver = true;
                    reset.setText("Press any key to reset");
                    return;
                }

                // update scoreboard
                p1Win.setText("P1 Wins: " + p1.getWin());
                p2Win.setText("P2 Wins: " + p2.getWin());
                p1Loss.setText("P1 Losses: " + p1.getLosses());
                p2Loss.setText("P2 Losses: " + p2.getLosses());
                ties.setText("Ties: " + p1.getTies());

                resetTrack(trackCircles);
                trackCircles[p1Pos].setFill(Color.RED);
                trackCircles[p2Pos].setFill(Color.BLUE);

                p1Ready = p2Ready = false;

                // lock input for 1 second
                inputLocked = true;

                PauseTransition pause = new PauseTransition(Duration.seconds(1));
                pause.setOnFinished(ev -> {
                    root.getChildren().removeAll(
                            rockP1move, paperP1move, scissorsP1move,
                            rockP2move, paperP2move, scissorsP2move
                    );

                    // remove round text after delay
                    roundResult.setText("");

                    inputLocked = false;
                });
                pause.play();
            }
        });

        primaryStage.setScene(nameScene);
        primaryStage.show();
    }

    // set race circles back to start colors
    private void resetTrack(Circle[] track) {
        for (int i = 0; i < 13; i++) track[i].setFill(Color.LIGHTGRAY);
        track[0].setFill(Color.ORANGE);
        track[12].setFill(Color.ORANGE);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

// Player class stores name, score, and choice
class Player {
    String playerName = "Player";
    int wins;
    int losses;
    int ties;
    String choice;

    void setPlayerName(String name) { this.playerName = name; }
    
    String getPlayerName() { return playerName; }

    void setChoice(String c) { choice = c; }

    void addWin() { wins++; }
    int getWin() { return wins; }

    void addLoss() { losses++; }
    int getLosses() { return losses; }

    void addTies() { ties++; }
    int getTies() { return ties; }
}

// Round class decides who wins each round
class Round {
    Player p1, p2;

    Round(Player a, Player b) {
        p1 = a;
        p2 = b;
    }

    int getWinner() {
        if (p1.choice.equals(p2.choice)) return 0;
        if ((p1.choice.equals("rock") && p2.choice.equals("scissors")) ||
            (p1.choice.equals("paper") && p2.choice.equals("rock")) ||
            (p1.choice.equals("scissors") && p2.choice.equals("paper")))
            return 1;
        return 2;
    }
}

// Game class checks for winner and resets game
class Game {

    boolean gameOver = false;

    boolean hasSomeoneWon(int p1Pos, int p2Pos) {
        return (p1Pos == 0 || p2Pos == 12);
    }

    int getGameWinner(int p1Pos, int p2Pos) {
        if (p2Pos == 12) return 1;
        if (p1Pos == 0) return 2;
        return 0;
    }

    int[] resetPositions() {
        gameOver = false;
        return new int[]{1, 11};
    }
}
