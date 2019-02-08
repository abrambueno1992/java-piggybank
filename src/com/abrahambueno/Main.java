package com.abrahambueno;

import java.util.ArrayList;

import static com.abrahambueno.AbstractTotal.totalSum;

public class Main {

    public static void main(String[] args) {
        ArrayList<AbstractTotal> piggyBank = new ArrayList<>();
        piggyBank.add(new Quarter());
//        piggyBank.forEach(v -> v.printSum());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickle(3));
//        piggyBank.forEach(v -> v.printSum());
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));
//        double total;

        System.out.println("The piggy bank holds $" + totalSum);
//        int length = piggyBank.size() - 1;
//        System.out.println("Length: " + length);
//        piggyBank.forEach((v1, v2) -> v.getTotal() + );
//        System.out.println(piggyBank.get(length).printSum());
        double sumValues = 0;
        for (AbstractTotal v : piggyBank) {
//            System.out.println("Each value: " + v.getTotal());
            sumValues += v.getTotal();
        }
        System.out.println("The piggy bank holds $" + sumValues);
    }
}
