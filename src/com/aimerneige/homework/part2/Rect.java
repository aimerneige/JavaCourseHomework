package com.aimerneige.homework.part2;

public class Rect {
    private double height;
    private double width;

    public Rect() {
    }

    public Rect(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }
}
