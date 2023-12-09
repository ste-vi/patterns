package org.stevi.gof.structural.bridge;

public class BridgeExample {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.draw(new Blue());

        Circle circle = new Circle();
        circle.draw(new Green());
    }
}
