package design_pattern.creational.builder;

public class Book {

    private int pages;
    private String author;

    public Book(Builder builder) {
        pages = builder.pages;
        author = builder.author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                ", author='" + author + '\'' +
                '}';
    }

    public static class Builder {
        //required
        private final String author;

        //optional
        private int pages = 0;

        public Builder(String author) {
            this.author = author;
        }

        public Builder pages(int pages) {
            pages = pages;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
