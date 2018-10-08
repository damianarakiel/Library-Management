package data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Publication {

    private String title;
    private String publisher;
    private int year;

    protected Publication(String title, String publisher, int year) {
        this.title = title;
        this.year = year;
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publication)) return false;

        Publication that = (Publication) o;

        if (getYear() != that.getYear()) return false;
        if (!getTitle().equals(that.getTitle())) return false;
        return getPublisher().equals(that.getPublisher());
    }

    @Override
    public int hashCode() {
        int result = getTitle().hashCode();
        result = 31 * result + getPublisher().hashCode();
        result = 31 * result + getYear();
        return result;
    }
}
