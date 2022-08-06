package de.paulzhng.eist.bridge;

public abstract class Car {

    private final Motor motor;

    public Car(Motor motor) {
        this.motor = motor;
    }

    public FuelType getFuelType() {
        return motor.getFuelType();
    }
}
