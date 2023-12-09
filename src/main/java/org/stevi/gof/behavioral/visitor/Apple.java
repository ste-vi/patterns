package org.stevi.gof.behavioral.visitor;

public class Apple implements ProductItem {

    public int getPricePerKilo() {
        return 2;
    }

    public int getWeight() {
        return 5;
    }

    @Override
    public int accept(PriceVisitor visitor) {
        return visitor.visit(this);
    }
}
