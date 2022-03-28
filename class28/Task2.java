package com.syntax.class28;

//Create an arrayList of words. Remove every word that ends with “e”.

import java.util.ArrayList;

public class Task2{

    public static void main(String[] args) {

        ArrayList<String> Words = new ArrayList<>();

        Words.add("telephone");
        Words.add("tea");
        Words.add("mercedes");
        Words.add("candle");


        Words.set(Words.indexOf("telephone"), "");
        Words.set(Words.indexOf("candle"), "");

        System.out.println(Words);

    }
}