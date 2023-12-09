package org.stevi.gof.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightCarFactory {

    private static final Map<EngineType, Engine> engines = new HashMap<>();

    public static Car createCar(EngineType engineType) {
        Engine engine = engines.computeIfAbsent(engineType, newEngineType -> new Engine());
        return new Car("Ferrari", engine);
    }

}
