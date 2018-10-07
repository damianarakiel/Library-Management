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
        this.setTitle(title);
        this.setAuthor(author);
        this.setYear(year);
        this.setPages(pages);
        this.setPublisher(publisher);
        this.setIsbn(isbn);
    }

//    public Book(Book book) {
//        this(book.getTitle(), book.getAuthor(), book.getYear(), book.getPages(), book.getPublisher(), book   .getIsbn());
//    }

    public void printInfo() {
        String info = getTitle() + " ; " + getAuthor() + " ; " + getYear() + " ; " + getPages() + " ; " + getPublisher() + " ; " + getIsbn();
        System.out.println(info);
    }
}
