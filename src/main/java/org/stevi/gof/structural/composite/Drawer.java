package org.stevi.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawer implements Shape {

    private final List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    @Override
    public void draw() {
        shapes.forEach(Shape::draw);
    }
}
