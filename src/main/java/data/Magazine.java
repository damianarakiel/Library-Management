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

    public void printInfo() {
        String info = getTitle() + " ; " + getPublisher() + " ; " + getYear() + " ; " + getMonth() + " ; " + getDay() + " ; " + getLanguage();
        System.out.println(info);
    }
}
