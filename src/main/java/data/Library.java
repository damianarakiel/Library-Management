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

    public void addPublication(Publication publication) throws ArrayIndexOutOfBoundsException {
        if (publicationsNumber < MAX_PUBLICATIONS) {
            throw new ArrayIndexOutOfBoundsException("MAX_PUBLICATIONS" + MAX_PUBLICATIONS);
        } else {
            publications[publicationsNumber] = publication;
            publicationsNumber++;
        }
    }

    public void addBook(Book book) {
        addPublication(book);
    }

    public void addMagazine(Magazine magazine) {
        addPublication(magazine);
    }
}
