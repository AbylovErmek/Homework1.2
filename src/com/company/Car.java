package com.company;

public class Car {
    private int glass;
    private Color color;
    private double volume;

    public Car(int glass, Color color, double volume) {
        this.glass = glass;
        this.color = color;
        this.volume = volume;
    }

    public Car() {
    }

    public int getGlass() {
        return glass;
    }

    public Color getColor() {
        return color;
    }

    public double getVolume() {
        return volume;
    }
}
