package org.stevi.gof.behavioral.visitor;

public interface ProductItem {

    int accept(PriceVisitor visitor);

}
