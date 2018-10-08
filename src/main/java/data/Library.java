package data;

import lombok.Getter;

@Getter
public class Library {

    public static final int MAX_PUBLICATIONS = 2000;
    private int publicationsNumber;
    private Publication[] publications;

    public Library() {
        publications = new Publication[MAX_PUBLICATIONS];
    }

    public void addPublication(Publication publication) {
        if (publicationsNumber < MAX_PUBLICATIONS) {
            publications[publicationsNumber] = publication;
            publicationsNumber++;
        } else {
            System.out.println("Jest już maksymalna liczba publikacji.");
        }
    }

    public void addBook(Book book) {
        addPublication(book);
    }

    public void addMagazine(Magazine magazine) {
        addPublication(magazine);
    }

    public void printBooks() {
        int countBooks = 0;
        for (int i = 0; i < publicationsNumber; i++) {
            if (publications[i] instanceof Book){
                System.out.println(publications[i]);
                countBooks++;
            }
        }
        if (countBooks == 0) {
            System.out.println("Brak książek.");
        }
    }

    public void printMagazines() {
        int countMagazines = 0;
        for (int i = 0; i < publicationsNumber; i++) {
            if(publications[i] instanceof Magazine) {
                System.out.println(publications[i]);
                countMagazines++;
            }
        }
        if (countMagazines == 0) {
            System.out.println("Brak magazynów.");
        }
    }

}
