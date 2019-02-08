package com.abrahambueno;

public class Dime {
    private double value = 0.10;
    private static double total = 0;

    public Dime(double quantity) {
        this.total += value * quantity;
    }
    public Dime() {
        this.total += value * 1;
    }
}
