package app;

import data.Book;
import data.Library;
import data.Magazine;
import utils.DataReader;


public class LibraryControl {

    private DataReader dataReader;
    private Library library;

    public LibraryControl() {
        dataReader = new DataReader();
        library = new Library();
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        for(Option option: Option.values()){
            System.out.println(option);
        }
    }

    public void control() {
        Option option;
        printOptions();
        while ((option = Option.createFromInt(dataReader.getInt())) != Option.EXIT) {
            switch (option) {
                case ADD_BOOK:
                    addBook();
                    break;
                case ADD_MAGAZINE:
                    addMagazine();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case PRINT_MAGAZINES:
                    printMagazines();
                    break;
            }
            printOptions();
        }
        dataReader.close();
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printBooks() {
        library.printBooks();
    }

    private void addMagazine() {
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
    }

    private void printMagazines() { library.printMagazines(); }

}
