package com.syntax.class24;

public class Parent {

        final String name = "Vladlen";

        final void method(){

            // name="ABC"; can reassign if a variable is final

            System.out.println("I am a parent");
        }

        void method2(){

        }
    }

    class Child extends Parent{

   /* void method(){
        can't override because it is final method
    }*/

    }
