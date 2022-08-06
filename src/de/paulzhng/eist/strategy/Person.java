package de.paulzhng.eist.strategy;

public class Person {

    private Wealth wealth;
    private Car car;

    public Person(Wealth wealth) {
        this.wealth = wealth;
    }

    public Wealth getWealth() {
        return wealth;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
