package de.paulzhng.eist.proxy;

public class RemoteControlledCar implements ICar {

    private final Car car;
    private boolean started; // store it here to avoid calling isStarted() every time

    public RemoteControlledCar() {
        this.car = new Car();
    }

    @Override
    public void start() {
        if (!started) {
            car.start();
            started = true;
        } else {
            System.out.println("Car is already started.");
        }
    }

    @Override
    public void stop() {
        if (started) {
            car.stop();
            started = false;
        } else {
            System.out.println("Car is already stopped.");
        }
    }

    @Override
    public void drive() {
        if (started) {
            car.drive();
        } else {
            System.out.println("Car is not started.");
        }
    }

    @Override
    public boolean isStarted() {
        return started;
    }
}
