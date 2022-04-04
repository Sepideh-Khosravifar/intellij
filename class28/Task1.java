package com.syntax.class28;

import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {

        ArrayList<String> Cars = new ArrayList<>();

        Cars.add("toyota");
        Cars.add("mazda");
        Cars.add("Mercedes");
        Cars.add("BMW");

       /* Iterator <String> iterator = Cars.iterator(); //1st method
        System.out.println(  iterator.hasNext());
        System.out.println(iterator.next()); */

        /* Iterator<String> iterator =Cars.iterator(); //2nd method
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); */

        for (int i = 0; i < Cars.size(); i++) {         //3rd method
            System.out.println(((String) Cars.get(i)));

        }
    }
}


