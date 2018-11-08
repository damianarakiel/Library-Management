package data;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Book extends Publication {

    private String author;
    private int pages;
    private String isbn;

    public Book(String title, String author, int year, int pages, String publisher, String isbn) {
        super(title, publisher,year);
        this.setAuthor(author);
        this.setPages(pages);
        this.setIsbn(isbn);
    }

//    public Book(Book book) {
//        this(book.getTitle(), book.getAuthor(), book.getYear(), book.getPages(), book.getPublisher(), book   .getIsbn());
//    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(32);
        builder.append(getTitle());
        builder.append(" ; ");
        builder.append(getAuthor());
        builder.append(" ; ");
        builder.append(getYear());
        builder.append(" ; ");
        builder.append(getPages());
        builder.append(" ; ");
        builder.append(getPublisher());
        builder.append(" ; ");
        builder.append(getIsbn());
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (getPages() != book.getPages()) return false;
        if (!getAuthor().equals(book.getAuthor())) return false;
        return getIsbn().equals(book.getIsbn());
    }

    @Override
    public int hashCode() {
        int result = getAuthor().hashCode();
        result = 31 * result + getPages();
        result = 31 * result + getIsbn().hashCode();
        return result;
    }
}
