package com.abrahambueno;

import java.util.ArrayList;

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

    }
}
