package de.paulzhng.eist.strategy;

public class Policy {

    private final Context context;

    public Policy(Context context) {
        this.context = context;
    }

    public void configure() {
        Car car = switch (context.getWealth()) {
            case RICH -> new Car.Lamborghini();
            case MIDDLE_RICH -> new Car.BMW();
            case POOR -> new Car.Mini();
        };
        context.setCar(car);
    }
}
