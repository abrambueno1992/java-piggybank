package com.abrahambueno;

public class Quarter extends AbstractTotal {
    private double value = 0.25;
    private static int quantity = 0;
    private static int lastQuantity = 0;
    private double total = 0;

    public Quarter(int quantity) {
        this.total = value * quantity;
        this.quantity += quantity;
        this.lastQuantity = quantity;
        totalSum += (double) value * quantity;
        printQuantity();
    }
    public Quarter() {
        this.total = value * 1;
        this.quantity += 1;
        this.lastQuantity = 1;
        printQuantity();
        totalSum += (double) value * 1;
    }


    @Override
    public void printQuantity() {
        System.out.println(lastQuantity + " Quarter");

    }

    @Override
    public double getTotal() {
        return total;
    }
}
