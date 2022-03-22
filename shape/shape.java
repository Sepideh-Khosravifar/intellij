package com.syntax.shape;

//Create an interface 'Shape' with undefined methods
//as calculateArea and calculatePerimeter. Create 2
//classes Circle and Square that implement functionality
//defined in the Shape interface.Test your code.

public interface shape {

        void calculateArea();
        void calculatePerimeter();
    }

class Circle implements shape {

        @Override
        public void calculateArea() {

            double radius = 9;
            System.out.println("Area of Circle: " + (3.14 * radius * radius));
        }

        @Override
        public void calculatePerimeter() {

            double radius = 9;
            System.out.println("Perimeter of Circle is: " + (2 * 3.14 * radius));
        }

    }

class Square implements shape {

        @Override
        public void calculateArea() {

            double side = 8;
            System.out.println("The area of Square: " + (side * side));
        }

        @Override
        public void calculatePerimeter() {

            double side = 8;
            System.out.println("The perimeter of a Square: " + (side * 4));
        }

   }



