package com.syntax.class28;
//Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
import java.util.ArrayList;

public class task3 {

        public static void main(String[] args) {

            ArrayList<String> drinks = new ArrayList<>();

            drinks.add("pepsi");
            drinks.add("cocacola");
            drinks.add("orange juice");
            drinks.add("fanta");


            drinks.set(drinks.indexOf("pepsi"), "water");
            drinks.set(drinks.indexOf("cocacola"), "water");
            drinks.set(drinks.indexOf("orange juice"), "water");
            drinks.set(drinks.indexOf("fanta"), "water");


            System.out.println(drinks);

        }
    }