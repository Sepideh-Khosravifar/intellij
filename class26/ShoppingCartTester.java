package com.syntax.class26;

public class ShoppingCartTester {
        public static void main(String[] args) {

            ShoppingCart shoppingCart = new ShoppingCart();

     /*  shoppingCart.originalPrice=100;
       shoppingCart.discount=0.20; */

            // shoppingCart.setDiscount(0.20);

            System.out.println(shoppingCart.getDiscount());

            shoppingCart.calculatePrice();


        }
    }
