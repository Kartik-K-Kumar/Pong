package org.example;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage stage) {
        stage.setTitle("Pong");

        Group root = new Group();
        Player1 player1 = new Player1(100.0, 35.0, 900, 550);
        Player2 player2 = new Player2(100.0, 35.0, 100, 550);

        Rectangle playerRectangle = player1.createRectangle();
        root.getChildren().add(playerRectangle);
        Rectangle player2Rectangle = player2.createRectangle();
        root.getChildren().add(player2Rectangle);

        Scene scene = new Scene(root, 1000, 700);

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                switch (keyEvent.getCode()) {
                    case UP:
                        player1.setY(player1.getY() - 10);
                        break;
                    case DOWN:
                        player1.setY(player1.getY() + 10);
                        break;
                    case W:
                        player2.setY(player2.getY() - 10);
                        break;
                    case S:
                        player2.setY(player2.getY() + 10);
                        break;
                    default:
                        break;
                }
                playerRectangle.setY(player1.getY());
                player2Rectangle.setY(player2.getY());
            }
        });

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
