package org.stevi.gof.creational.factory;

public class FactoryExample {

    public static void main(String[] args) {
        FerrarriFactory ferrarriFactory = new FerrarriFactory();
        Car ferrarriCar = ferrarriFactory.getCar();

        ToyotaFactory toyotaFactory = new ToyotaFactory();
        Car factoryCar = toyotaFactory.createCar();
    }
}
