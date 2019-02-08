package com.abrahambueno;

public class Dime extends AbstractTotal {


    private double value = 0.10;
    private static int lastQuantity = 0;
    private static int quantity;
    private static double total = 0;

    public Dime(int quantity) {
        this.total += value * quantity;
        this.quantity += quantity;
        this.lastQuantity = quantity;
        printQuantity();

    }
    public Dime() {
        this.total += value * 1;
        this.quantity += 1;
        this.lastQuantity = 1;
        printQuantity();
    }

    @Override
    public void printQuantity() {
        System.out.println(lastQuantity + " Dime");

    }

    @Override
    public double getTotal() {
        return total;
    }
}
