package de.paulzhng.eist.proxy;

public class Player {

    private final Car car;

    public Player(Car car) {
        this.car = car;
    }

    public void playCars() {
        car.start();
        car.drive();
        car.stop();
    }

}
