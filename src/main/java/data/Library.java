package data;

import lombok.Getter;

@Getter
public class Library {
    public static final int MAX_BOOKS = 1000;
    public static final int MAX_MAGAZINES = 1000;
    private int booksNumber;
    private int magazinesNumber;
    private Book[] books;
    private Magazine[] magazines;

    public Library() {
        books = new Book[MAX_BOOKS];
        magazines = new Magazine[MAX_MAGAZINES];
    }

    public void addBook(Book book) {
        if (booksNumber < MAX_BOOKS) {
            books[booksNumber] = book;
            booksNumber++;
        } else {
            System.out.println("Jest już maksymalna liczba książek.");
        }
    }

    public void addMagazine(Magazine magazine) {
        if (magazinesNumber < MAX_MAGAZINES) {
            magazines[magazinesNumber] = magazine;
            magazinesNumber++;
        } else {
            System.out.println("Jest już maksymalna liczba magazynów.");
        }
    }

    public void printBooks() {
        if (booksNumber == 0) {
            System.out.println("Brak książek.");
        }
        for (int i = 0; i < MAX_BOOKS; i++) {
            System.out.println(books[i]);        }
    }

    public void printMagazines() {
        if (magazinesNumber == 0) {
            System.out.println("Brak magazynów.");
        }
        for (int i = 0; i < MAX_MAGAZINES; i++){
            System.out.println(magazines[i]);
        }
    }

}
