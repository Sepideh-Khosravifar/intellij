package com.syntax.class24;

public interface Human {
    //public static final are redundant because by
    // default all the variables are public,
    // static and final

    //public static final int legs=2;
   int legs=2;
   //public abstract void walk(); REDUNDANT use public methods

   void walk();
   static void printLegs() {
       System.out.println(legs);
   }

   public default void noNeedToWorry() {

       System.out.println("default methods are there to use functional programming");
   }
}

interface LivingBeing{
    static void printLegs() {
        System.out.println("Not Sure");
    }
}


class Maha implements Human,LivingBeing {

    @Override
    public void walk() {
        System.out.println("I can walk");
    }
}