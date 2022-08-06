package de.paulzhng.eist.composite;

public class Main {

    public static void main(String[] args) {
        CarPark carPark = new CarPark(new Car(), new CarPark(new Car(), new Car()));
        System.out.println("carPark.getCars().size() = " + carPark.getCars().size());
    }

}
