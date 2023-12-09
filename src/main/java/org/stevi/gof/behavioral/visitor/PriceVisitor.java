package org.stevi.gof.behavioral.visitor;

public interface PriceVisitor {

    int visit(Book book);

    int visit(Apple apple);
}
