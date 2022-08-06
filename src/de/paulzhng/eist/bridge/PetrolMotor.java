package de.paulzhng.eist.bridge;

public class PetrolMotor implements Motor {
    @Override
    public int getPower() {
        return 150;
    }

    @Override
    public FuelType getFuelType() {
        return FuelType.PETROL;
    }
}
