package org.stevi.gof.bridge;

public class Circle implements Shape {

    @Override
    public void draw(Color color) {
        System.out.printf("Drawing %s circle%n", color.getColor());
    }
}
