package org.stevi.gof.creational.factory;

public class FerrarriFactory extends CarFactory {

    @Override
    protected Car createCar() {
        return new Ferrarri();
    }
}
