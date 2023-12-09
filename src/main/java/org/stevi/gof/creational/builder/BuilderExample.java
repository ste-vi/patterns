package org.stevi.gof.creational.builder;

import java.time.LocalDate;

public class BuilderExample {

    public void test() {
        Book builderBook = Book.builder()
                .id(1L)
                .name("Name")
                .releaseDate(LocalDate.now())
                .build();

        Book accessorsBook = new Book()
                .id(1L)
                .name("Another name")
                .releaseDate(LocalDate.now());
    }
}
