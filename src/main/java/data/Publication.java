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
}
