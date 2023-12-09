package org.stevi.gof.behavioral.visitor;

public class PriceVisitorImpl implements PriceVisitor {

    @Override
    public int visit(Book book) {
        return book.getPrice();
    }

    @Override
    public int visit(Apple apple) {
        return apple.getPricePerKilo() * apple.getWeight();
    }
}
