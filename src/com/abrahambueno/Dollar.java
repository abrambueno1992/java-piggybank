package com.abrahambueno;

public class Dollar {
    private int value = 1;
    private int total = 0;

    public Dollar(int quantity) {
        this.total += value * quantity;
    }
    public Dollar() {
        this.total += value * 1;
    }
}
