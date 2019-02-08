package com.abrahambueno;

public class Nickle {
    private double value = 0.05;
    private static double total = 0;

    public Nickle(double quantity) {
        this.total += value * quantity;
    }
    public Nickle() {
        this.total += value * 1;
    }
}
