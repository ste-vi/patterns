package org.stevi.gof.behavioral.visitor;

public class Book implements ProductItem {

    public int getPrice() {
        return 10;
    }

    @Override
    public int accept(PriceVisitor visitor) {
        return visitor.visit(this);
    }
}
