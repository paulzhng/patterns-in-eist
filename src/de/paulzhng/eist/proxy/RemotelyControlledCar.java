package de.paulzhng.eist.proxy;

public class RemotelyControlledCar implements Car {

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
        System.out.println("Driving car...");
    }

    public boolean isStarted() {
        return started;
    }

}
