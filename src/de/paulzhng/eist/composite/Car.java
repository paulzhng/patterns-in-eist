package de.paulzhng.eist.composite;

import java.util.Collections;
import java.util.List;

public class Car implements CarParkObject {

    @Override
    public List<Car> getCars() {
        return Collections.singletonList(this);
    }
}
