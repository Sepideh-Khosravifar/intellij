package com.syntax.class29;

import java.util.Iterator;
import java.util.TreeSet;

//Create a Set collection in which you need to add names of the countries. In this Set,
// we want all objects to be sorted in alphabetical order. Using 2 differnet ways to retrieve all elements from Set.
public class HW2 {

    public static void main(String[] args) {

        TreeSet<String> countries = new TreeSet<>();

        countries.add("Iran");
        countries.add("USA");
        countries.add("Germany");
        countries.add("Italy");
        countries.add("France");
        System.out.println(countries);

        Iterator<String> iterator = countries.iterator(); // metod 1
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();

        for (String count : countries) {     //method 2
            System.out.println(count + " ");
        }
    }
}

