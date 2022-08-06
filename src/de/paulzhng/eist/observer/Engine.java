package de.paulzhng.eist.observer;

class Engine extends Subject<Integer> {

    private int fuel;

    public void drive() {
        fuel--;
        notifyObservers();
    }

    public void fill() {
        fuel = 100;
        notifyObservers();
    }

    @Override
    public Integer getUpdate() {
        return fuel;
    }
}
