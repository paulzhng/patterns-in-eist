package de.paulzhng.eist.strategy;

public class Context {

    private Wealth wealth;
    private Car car;

    public Car chooseCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setWealth(Wealth wealth) {
        this.wealth = wealth;
    }

    public Wealth getWealth() {
        return wealth;
    }
}
