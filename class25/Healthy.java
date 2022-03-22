package com.syntax.class25;

public interface Healthy {
    void Healty();

    void Healthy();
}

interface Portable{

    void canCarry();
}

interface Eatable {
    void eat();
}

class Orange implements Healthy, Portable, Eatable {

    @Override
    public void Healty() {
        System.out.println("Orange is healthy to eat");
    }

    @Override
    public void canCarry() {
        System.out.println("WE can carry orange easily");
    }

    @Override
    public void eat() {
        System.out.println("We can eat Orange");
    }

    @Override
    public void Healthy() {

    }
}

class Laptop implements Portable {

    @Override
    public void canCarry() {

          System.out.println("We can carry a laptop easily");
    }
}