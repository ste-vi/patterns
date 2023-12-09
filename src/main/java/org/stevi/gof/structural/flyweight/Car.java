package org.stevi.gof.structural.flyweight;

public class Car {

    private String name;
    private Engine engine;

    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }
}
