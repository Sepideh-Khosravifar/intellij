package com.syntax.class28;

import java.util.ArrayList;

public class task3 {

    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>();

        drinks.add("pepsi");
        drinks.add("cocacola");
        drinks.add("orange juice");
        drinks.add("fanta");

        for (int i = 0; i < drinks.size(); i++) {

            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {

                drinks.set(i, "water");


                System.out.println(drinks);

            }
        }
    }
}