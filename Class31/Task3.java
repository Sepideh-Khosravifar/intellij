package src.com.syntax.Class31;

//Create a collection of integers in which you can keep duplicates.
//Write a logic to find sum of all integers

import java.util.ArrayList;

    public class Task3{

        public static void main(String[] args) {

            ArrayList <Integer> numbers = new ArrayList<>();

            numbers.add(10);
            numbers.add(10);
            numbers.add(10);
            numbers.add(10);
            numbers.add(10);

            int sum = 0;

            for (int i = 0; i < numbers.size(); i++) {

                sum += numbers.get(i);      //This logic calculates the sum of all integers
            }

            System.out.println(sum);
        }
    }
