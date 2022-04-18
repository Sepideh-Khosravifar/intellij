package src.com.syntax.Class31;

//Create the collection that will store single unique Objects of a String type
// in which order is preserved.
//Write a logic to concatenate all string from the collection.

import java.util.LinkedHashSet;

    public class Task2 {

        public static void main(String[] args) {

            LinkedHashSet<String> drinks = new LinkedHashSet<>();

            drinks.add("Coke");
            drinks.add("Vodka");
            drinks.add("tequila");
            drinks.add("margarita");
            drinks.add("Gin&Tonic");

            StringBuilder allDrinks= new StringBuilder();

            for (String drink:drinks) {

                allDrinks.append(drink).append(" ");
            }

            System.out.println(allDrinks);
        }
    }
