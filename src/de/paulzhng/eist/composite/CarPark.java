package de.paulzhng.eist.composite;

import java.util.ArrayList;
import java.util.List;

public class CarPark extends CarParkObject {

    private final List<CarParkObject> carParkObjects;

    public CarPark(List<CarParkObject> carParkObjects) {
        this.carParkObjects = carParkObjects;
    }

    @Override
    List<Car> getCars() {
        List<Car> cars = new ArrayList<>();

        for (CarParkObject carParkObject : carParkObjects) {
            cars.addAll(carParkObject.getCars());
        }

        return cars;
    }
}
