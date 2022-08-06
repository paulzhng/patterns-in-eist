package de.paulzhng.eist.facade;

public class Car {

    private final Blinker blinker;
    private final Engine engine;

    public Car() {
        this.blinker = new Blinker();
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void drive() {
        engine.drive();
    }

    public void fillFuel() {
        engine.fillFuel();
    }

    public int getFuel() {
        return engine.getFuel();
    }

    public void blink() {
        blinker.blink();
    }
}
