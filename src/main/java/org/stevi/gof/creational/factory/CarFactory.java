package org.stevi.gof.creational.factory;

public abstract class CarFactory {

    public Car getCar() {
        Car car = createCar();
        // do some other init logic here
        return car;
    }

    protected abstract Car createCar();
}
