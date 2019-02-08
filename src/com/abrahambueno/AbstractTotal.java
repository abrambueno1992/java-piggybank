package com.abrahambueno;

public abstract class AbstractTotal implements Total{
    public abstract void printQuantity();
    public abstract double getTotal();
    public static double totalSum;

    public AbstractTotal() {
//        this.totalSum += totalSum;
    }

    @Override
    public void printSum() {
        System.out.println("The piggy bank holds " + totalSum);
    }

    @Override
    public String toString() {
        return "AbstractTotal{" +
                "totalSum=" + totalSum +
                '}';
    }

}
