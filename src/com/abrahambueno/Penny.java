package com.abrahambueno;

public class Penny {
    private double value = 0.01;
    private static double total = 0;

    public Penny(double quantity) {
        this.total += value * quantity;
    }
    public Penny() {
        this.total += value * 1;
    }
}
