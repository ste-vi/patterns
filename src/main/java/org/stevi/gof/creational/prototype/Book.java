package org.stevi.gof.creational.prototype;

public class Book implements Cloneable {

    private Long id;
    private Author author;

    public Book(Long id, Author author) {
        this.id = id;
        this.author = author;
    }

    @Override
    public Book clone() {
        try {
            Book clone = (Book) super.clone();
            clone.author = this.author.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
