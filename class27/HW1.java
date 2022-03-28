package com.syntax.class27;
import java.util.*;


//Create an ArrayList that will store 5 names into it.
// Find out whether the given ArrayList is empty or not?
//Check whether the specific name is present in an ArrayList or not?
//Find the size of your arrayList and print all values from that


class HW1 {

    public static void main(String args[]) {

        ArrayList<String> alist = new ArrayList<String>();
        alist.add("Sepideh");
        alist.add("Omid");
        alist.add("Jaleh");
        alist.add("Ashkan");
        alist.add("Shahrokh");

        //Is empty or not
        boolean empty = alist.isEmpty();

        if (empty == true){
            System.out.println("The ArrayList is empty");
        } else {
            System.out.println("The ArrayList is not empty");
        }

        //whether a specif name is present in the ArrayList
        if (alist.contains("Jaleh")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        //display size
        System.out.println("Number of names in ArrayList is: " + alist.size());

        //display elements
        System.out.println(alist);

    }
}

