package org.stevi.gof.composite;

public class CompositeExample {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle();
        Shape square = new Square();

        Drawer drawer = new Drawer();
        drawer.addShape(rectangle);
        drawer.addShape(square);

        drawer.draw();;
    }
}
