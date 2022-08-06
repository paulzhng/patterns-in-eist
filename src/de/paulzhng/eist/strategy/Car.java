package de.paulzhng.eist.strategy;

public abstract class Car {

    public abstract String getName();

    public static class Lamborghini extends Car {
        @Override
        public String getName() {
            return "Lamborghini";
        }
    }

    public static class BMW extends Car {
        @Override
        public String getName() {
            return "BMW";
        }
    }

    public static class Mini extends Car {
        @Override
        public String getName() {
            return "Mini";
        }
    }

}
