package data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Magazine extends Publication {

    private int month;
    private int day;
    private String language;

    public Magazine(String title, String publisher, int year, int month, int day, String language) {
        super(title, publisher, year);
        this.setMonth(month);
        this.setDay(day);
        this.setLanguage(language);
    }

    @Override
    public String toString() {
        return getTitle() + " ; " + getPublisher() + " ; " + getYear() + " ; " + getMonth() + " ; " + getDay() + " ; " + getLanguage();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Magazine)) return false;

        Magazine magazine = (Magazine) o;

        if (getMonth() != magazine.getMonth()) return false;
        if (getDay() != magazine.getDay()) return false;
        return getLanguage().equals(magazine.getLanguage());
    }

    @Override
    public int hashCode() {
        int result = getMonth();
        result = 31 * result + getDay();
        result = 31 * result + getLanguage().hashCode();
        return result;
    }
}
