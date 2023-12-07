package org.stevi.gof.prototype;

public class PrototypeExample {

    public static void main(String[] args) {
        Book book = new Book(1L, new Author("author"));
        Book clone = book.clone();
        System.out.println(book.equals(clone));
    }
}
