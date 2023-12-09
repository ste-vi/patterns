package org.stevi.gof.flyweight;

public class FlyweightExample {

    public static void main(String[] args) {

        FlyweightCarFactory.createCar(EngineType.V6);
        FlyweightCarFactory.createCar(EngineType.V8);
        FlyweightCarFactory.createCar(EngineType.V4);
    }
}
