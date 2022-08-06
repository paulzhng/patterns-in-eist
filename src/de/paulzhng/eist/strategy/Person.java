package de.paulzhng.eist.strategy;

public class Client {

    private Wealth wealth;

    public Client(Wealth wealth) {
        this.wealth = wealth;
    }

    public Car chooseCar() {
        Context context = new Context();
        context.setWealth(wealth);
        new Policy(context).configure();
        return context.getCar();
    }

}
