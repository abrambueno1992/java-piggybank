package com.abrahambueno;

public class Quarter {
    private double value = 0.25;
    private static double total = 0;

    public Quarter(double quantity) {
        this.total += value * quantity;
    }
    public Quarter() {
        this.total += value * 1;
    }
}
