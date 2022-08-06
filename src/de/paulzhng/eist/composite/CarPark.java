package de.paulzhng.eist.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarPark implements CarParkObject {

    private final List<CarParkObject> carParkObjects;

    public CarPark(List<CarParkObject> carParkObjects) {
        this.carParkObjects = carParkObjects;
    }

    public CarPark(CarParkObject... carParkObjects) {
        this.carParkObjects = new ArrayList<>();
        this.carParkObjects.addAll(Arrays.asList(carParkObjects));
    }

    @Override
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();

        for (CarParkObject carParkObject : carParkObjects) {
            cars.addAll(carParkObject.getCars());
        }

        return cars;
    }
}
