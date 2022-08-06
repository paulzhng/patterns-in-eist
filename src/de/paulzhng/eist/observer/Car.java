package de.paulzhng.eist.observer;

public class Car {

    private final Engine engine;
    private final FuelStatusHUD fuelStatusHUD;

    public Car(Engine engine, FuelStatusHUD fuelStatusHUD) {
        this.engine = engine;
        this.fuelStatusHUD = fuelStatusHUD;
        engine.subscribe(fuelStatusHUD);
    }

    public void drive() {
        engine.drive();
    }

    public void fill() {
        engine.fill();
    }

    public void setShowFuelStatus(boolean showFuelStatus) {
        fuelStatusHUD.setShowChange(showFuelStatus);
    }
}
