package de.paulzhng.eist.proxy;

public class CarProxy implements Car {

    private final RemotelyControlledCar remotelyControlledCar;
    private boolean cachedStarted; // store it here to avoid calling isStarted() every time

    public CarProxy() {
        this.remotelyControlledCar = new RemotelyControlledCar();
    }

    @Override
    public void start() {
        if (!cachedStarted) {
            remotelyControlledCar.start();
            cachedStarted = true;
        } else {
            System.out.println("Car is already started.");
        }
    }

    @Override
    public void stop() {
        if (cachedStarted) {
            remotelyControlledCar.stop();
            cachedStarted = false;
        } else {
            System.out.println("Car is already stopped.");
        }
    }

    @Override
    public void drive() {
        if (cachedStarted) {
            remotelyControlledCar.drive();
        } else {
            System.out.println("Car is not started.");
        }
    }

    @Override
    public boolean isStarted() {
        return cachedStarted;
    }
}
