package src.com.syntax.class30;

//Create a collection of integers in which you can keep duplicates.
//Write a logic to find sum of all integers

import java.util.ArrayList;

public class Task7 {

    public static void main(String[] args) {

       ArrayList<Integer> collections = new ArrayList<>();

        collections.add(1589);
        collections.add(2048);
        collections.add(8700);
        collections.add(2048);

        int sum = 0;

        for (Integer col : collections) {
            sum = sum + col;
        }

        System.out.println(sum);
    }
}

