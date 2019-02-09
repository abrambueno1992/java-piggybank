package com.abrahambueno;

public class Penny extends AbstractTotal {
    private double value = 0.01;
    private double total = 0;
    private static int lastQuantity = 0;


    public Penny(int quantity) {
        this.total = value * quantity;
        this.lastQuantity = quantity;
        printQuantity();
    }
    public Penny() {
        this.total = value * 1;
        this.lastQuantity = 1;
        printQuantity();
    }

    @Override
    public void printQuantity() {
        System.out.println(lastQuantity + " Penny");
    }

    @Override
    public double getTotal() {
        return total;
    }
}
