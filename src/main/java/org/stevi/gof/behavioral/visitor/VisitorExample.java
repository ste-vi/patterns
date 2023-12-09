package org.stevi.gof.behavioral.visitor;

import java.util.List;

public class VisitorExample {

    public static void main(String[] args) {
        List<ProductItem> productItems = List.of(new Book(), new Apple(), new Apple());
        PriceVisitorImpl priceVisitor = new PriceVisitorImpl();

        Integer sum = calculatePrice(productItems, priceVisitor);

        System.out.println(sum);
    }

    private static Integer calculatePrice(List<ProductItem> productItems, PriceVisitorImpl priceVisitor) {
        return productItems
                .stream()
                .map(productItem -> productItem.accept(priceVisitor))
                .reduce(0, Integer::sum);
    }
}
