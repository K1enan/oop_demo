package oop_exercises.ex2;

import java.util.Scanner;

public class Rectangle {
    private double height;
    private double width;
    private double area;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {

        return height;
    }

    public double getWidth() {

        return width;
    }

    public double setHeight(double height) {
        this.height = height;
        return height;
    }

    public double setWidth(double width) {
        this.width = width;
        return width;
    }

    public double getArea(double h, double w) {
        height = h;
        width = w;
        return h * w;
    }


}
