package org.stevi.gof.creational.factory;

public class ToyotaFactory extends CarFactory {

    @Override
    protected Car createCar() {
        return new Toyota();
    }
}
