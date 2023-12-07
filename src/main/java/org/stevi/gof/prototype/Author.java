package org.stevi.gof.prototype;

public class Author implements Cloneable {

    private String name;

    public Author(String name) {
        this.name = name;
    }

    @Override
    public Author clone() {
        try {
            return (Author) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Author(name);
        }
    }
}
