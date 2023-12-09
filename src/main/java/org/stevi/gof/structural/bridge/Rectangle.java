package org.stevi.gof.structural.bridge;

public class Rectangle implements Shape {

    @Override
    public void draw(Color color) {
        System.out.printf("Drawing %s rectangle%n", color.getColor());
    }
}
