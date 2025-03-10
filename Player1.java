package org.example;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Player1 {
    private double height;
    private double width;
    private double x;
    private double y;

    public Player1(double height, double width, double x, double y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public Rectangle createRectangle() {
        Rectangle playerRectangle = new Rectangle(x, y, width, height);
        playerRectangle.setFill(Color.BLACK);
        return playerRectangle;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
