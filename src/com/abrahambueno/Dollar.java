package com.abrahambueno;

public class Dollar extends AbstractTotal{
    private int value = 1;
    private int total = 0;
    private static int lastQuantity = 0;


    public Dollar(int quantity) {
        this.total = value * quantity;
        this.lastQuantity = quantity;
        printQuantity();
    }
    public Dollar() {
        this.total = value * 1;
        this.lastQuantity = 1;
        printQuantity();
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
