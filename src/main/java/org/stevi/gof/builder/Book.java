package org.stevi.gof.builder;

import java.time.LocalDate;

public class Book {

    private Long id;
    private String name;
    private LocalDate releaseDate;

    public Book() {

    }

    public Book(Long id, String name, LocalDate releaseDate) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
    }

    // accessor pattern to try along with builder (setters return object)
    public Book id(Long id) {
        this.id = id;
        return this;
    }

    public Book name(String name) {
        this.name = name;
        return this;
    }

    public Book releaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Long id;
        private String name;
        private LocalDate releaseDate;

        Builder() {

        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder releaseDate(LocalDate releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public Book build() {
            return new Book(id, name, releaseDate);
        }

    }
}
