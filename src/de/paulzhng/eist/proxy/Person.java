package de.paulzhng.eist.proxy;

public class Person {

    private final Car car;

    public Person(Car car) {
        this.car = car;
    }

    public void useCar() {
        car.start();
        car.drive();
        car.stop();
    }

}
