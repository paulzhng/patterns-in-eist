package de.paulzhng.eist.bridge;

public class ElectricMotor implements Motor {

    @Override
    public int getPower() {
        return 100;
    }

    @Override
    public FuelType getFuelType() {
        return FuelType.ELECTRIC;
    }
}
