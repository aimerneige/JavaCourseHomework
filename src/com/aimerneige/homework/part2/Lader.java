package com.aimerneige.homework.part2;

public class Lader {
    private double above;
    private double bottom;
    private double height;

    public Lader() {
    }

    public Lader(double above, double bottom, double height) {
        this.above = above;
        this.bottom = bottom;
        this.height = height;
    }

    public double getAbove() {
        return above;
    }

    public void setAbove(double above) {
        this.above = above;
    }

    public double getBottom() {
        return bottom;
    }

    public void setBottom(double bottom) {
        this.bottom = bottom;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return (above + bottom) * height * 0.5;
    }

}
