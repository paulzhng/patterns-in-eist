package de.paulzhng.eist.strategy;

import java.util.List;

public class Client {

    private static final List<Person> PEOPLE = List.of(
            new Person(Wealth.RICH),
            new Person(Wealth.MIDDLE_RICH),
            new Person(Wealth.POOR)
    );

    public static void main(String[] args) {
        Context context = new Context();
        Policy policy = new Policy(context);

        for (Person person : PEOPLE) {
            context.setWealth(person.getWealth());
            policy.configure();

            Car car = context.chooseCar();
            person.setCar(car);
        }
    }

}
