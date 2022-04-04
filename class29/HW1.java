package com.syntax.class29;
import java.util.*;

//How can you remove all duplicates from the ArrayList
    public class HW1 {
        public static void main(String[] args) {

            List<String> aList = new ArrayList<>();

            aList.add("Jaleh");
            aList.add("Sepideh");
            aList.add("Omid");
            aList.add("Ashkan");
            aList.add("Omid");
            aList.add("Shahla");

            System.out.println("Array List with duplicates: ");
            System.out.println(aList);

            LinkedHashSet<String> aListOfUniqueNames = new LinkedHashSet<>(aList);
            aList.clear();
            aList.addAll(aListOfUniqueNames);

            System.out.println("Array List with no duplicates: ");
            System.out.println(aList);

        }
    }



