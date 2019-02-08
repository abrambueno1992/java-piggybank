package com.abrahambueno;

public class Nickle extends AbstractTotal {
    private static final double value = 0.05;
    private static int quantity = 0;
    private double total = 0;
    private static int lastQuantity = 0;


    public Nickle(int quantity) {
        this.total =  value * quantity;
        this.quantity += quantity;
        this.lastQuantity = quantity;
        printQuantity();
        totalSum += (double) value * quantity;
    }
    public Nickle() {
        this.total = value * 1;
        this.quantity += 1;
        this.lastQuantity = 1;
        printQuantity();
        totalSum += (double) value * 1;
    }

    @Override
    public void printQuantity() {
        System.out.println(lastQuantity + " Nickel");

    }

    @Override
    public double getTotal() {
        return total;
    }
}
