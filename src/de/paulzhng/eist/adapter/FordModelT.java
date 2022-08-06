package de.paulzhng.eist.adapter;

import java.util.concurrent.ThreadLocalRandom;

public class FordModelT {

    private boolean started;

    public void crankIgnition() {
        System.out.println("Cranking ignition...");
        started = ThreadLocalRandom.current().nextBoolean();
        System.out.println("Started: " + started);
    }

    public boolean isStarted() {
        return started;
    }
}
