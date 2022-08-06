package de.paulzhng.eist.composite;

public abstract class Car {

    private boolean started;

    public void start() {
        started = true;
        System.out.println("Starting car...");
    }

    public void stop() {
        started = false;
        System.out.println("Stopping car...");
    }

    public void drive() {
        System.out.println("Driving car " + getSpeed() + " meters...");
    }

    public boolean isStarted() {
        return started;
    }

    public abstract int getSpeed();

}
