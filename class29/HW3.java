package com.syntax.class29;

//Create a Set of cities in which you want to make sure that insertion
// order is maintained. Then remove any city that starts with "A".

import java.util.LinkedHashSet;

public class HW3 {

    public static void main(String[] args) {

        LinkedHashSet<String> cities = new LinkedHashSet<>();

        cities.add("Tehran");
        cities.add("Astaneh");
        cities.add("Berlin");
        cities.add("Rome");
        cities.add("Paris");

        System.out.println(cities);

        cities.removeIf(s -> s.toLowerCase().startsWith("a"));

        System.out.println(cities);

    }
}
