package de.paulzhng.eist.templatemethod;

public class Ferrari extends Car {

    public void flex() {
        System.out.println("Ferrari flex");
    }

    @Override
    public int getSpeed() {
        return 100;
    }
}
