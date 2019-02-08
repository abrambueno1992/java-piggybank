package com.abrahambueno;

import java.util.ArrayList;

import static com.abrahambueno.AbstractTotal.totalSum;

public class Main {

    public static void main(String[] args) {
        ArrayList<AbstractTotal> piggyBank = new ArrayList<>();
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickle(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));
        double total;
        System.out.println("The piggy bank holds $" + totalSum);
    }
}
