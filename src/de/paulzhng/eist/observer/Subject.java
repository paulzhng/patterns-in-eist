package de.paulzhng.eist.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject<T> {

    private final List<Observer<T>> observers;

    protected Subject() {
        this.observers = new ArrayList<>();
    }

    public void subscribe(Observer<T> o) {
        this.observers.add(o);
    }

    public void unsubscribe(Observer<T> o) {
        this.observers.remove(o);
    }

    public void notifyObservers() {
        T update = this.getUpdate();
        for (Observer<T> o : this.observers) {
            o.update(update);
        }
    }

    public abstract T getUpdate();

}
