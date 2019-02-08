package com.abrahambueno;

public class Dollar extends AbstractTotal{
    private int value = 1;
    private static int quantity = 0;
    private int total = 0;
    private static int lastQuantity = 0;


    public Dollar(int quantity) {
        this.total = value * quantity;
        this.quantity += quantity;
        this.lastQuantity = quantity;
        printQuantity();
        totalSum += (double) value * quantity;
    }
    public Dollar() {
        this.total = value * 1;
        this.quantity += 1;
        this.lastQuantity = 1;
        printQuantity();
        totalSum += (double) 1;
    }

    @Override
    public void printQuantity() {
        System.out.println("$" + lastQuantity);

    }

    @Override
    public double getTotal() {
        return total;
    }
}
