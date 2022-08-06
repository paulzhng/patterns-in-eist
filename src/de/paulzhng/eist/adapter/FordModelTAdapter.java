package de.paulzhng.eist.adapter;

public class FordModelTAdapter implements Car {
    private final FordModelT fordModelT;

    public FordModelTAdapter(FordModelT fordModelT) {
        this.fordModelT = fordModelT;
    }

    @Override
    public void start() {
        // try to start the engine until it works
        while (!fordModelT.isStarted()) {
            fordModelT.crankIgnition();
        }
    }
}
