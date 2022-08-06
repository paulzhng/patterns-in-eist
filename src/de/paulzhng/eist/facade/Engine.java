package de.paulzhng.eist.facade;

class Engine {

    private boolean started;
    private int fuel;

    public void start() {
        started = true;
    }

    public void stop() {
        started = false;
    }

    public void drive() {
        if (started) {
            fuel--;
            System.out.println("Driving...");
        }
    }

    public void fillFuel() {
        fuel = 100;
    }

    public  int getFuel() {
        return fuel;
    }
}
