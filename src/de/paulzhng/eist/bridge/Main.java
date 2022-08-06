package de.paulzhng.eist.bridge;

public class Main {

    public static void main(String[] args) {
        Motor ferrariMotor;
        Motor teslaMotor;

        System.out.println("Which motor do you want the Ferrari to use?");
        System.out.println("1. Petrol Motor");
        System.out.println("2. Electric Motor");
        int motorChoice = Integer.parseInt(System.console().readLine());

        if (motorChoice == 1) {
            ferrariMotor = new PetrolMotor();
        } else {
            ferrariMotor = new ElectricMotor();
        }

        System.out.println("Which motor do you want the Tesla to use?");
        System.out.println("1. Petrol Motor");
        System.out.println("2. Electric Motor");

        motorChoice = Integer.parseInt(System.console().readLine());
        if (motorChoice == 1) {
            teslaMotor = new PetrolMotor();
        } else {
            teslaMotor = new ElectricMotor();
        }

        Ferrari ferrari = new Ferrari(ferrariMotor);
        Tesla tesla = new Tesla(teslaMotor);

        System.out.println("Fuel Types:");
        System.out.println("- Ferrari: " + ferrari.getFuelType());
        System.out.println("- Tesla: " + tesla.getFuelType());
    }
}
