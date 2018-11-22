package app;

import data.Book;
import data.Library;
import data.Magazine;
import utils.DataReader;
import utils.LibraryUtils;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;


public class LibraryControl {

    private DataReader dataReader;
    private Library library;

    public LibraryControl() {

        dataReader = new DataReader(); // zmienna do komunikacji z użytkownikiem
        library = new Library(); // "biblioteka" przechowująca dane
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        for(Option option: Option.values()){
            System.out.println(option);
        }
    }

    /*
     * Główna pętla programu, która pozwala na wybór opcji i interakcję
     */
    public void control() {
        Option option = null;
        while (option != Option.EXIT){
            try {
                printOptions();
                option = Option.createFromInt(dataReader.getInt());
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
                    case EXIT:
                        ;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Nie poprawne dane. Nie dodano publikacji.");
            } catch (NumberFormatException | NoSuchElementException ex){
                System.out.println("Wybrana opcja nie istnieje, wybierz ponownie:");
            }
        }
        dataReader.close();
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printBooks() {
        LibraryUtils.printBooks(library);
    }

    private void addMagazine() {
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
    }

    private void printMagazines() {
        LibraryUtils.printMagazines(library);
    }



    /*
     *Prywatną klasą wewnętrzną w LibraryControl
     */
    private enum Option {
        EXIT(0, "Wyjście z programu"),
        ADD_BOOK(1, "Dodanie książki"),
        ADD_MAGAZINE(2,"Dodanie magazynu/gazety"),
        PRINT_BOOKS(3, "Wyświetlenie dostępnych książek"),
        PRINT_MAGAZINES(4, "WYświetlenie dostępnych magazynów/gazet");

        private int value;
        private String description;

        @Override
        public String toString() {
            return value + " - " + description;
        }

        Option(int value, String description) {
            this.value = value;
            this.description = description;
        }

        public static Option createFromInt(int option) throws NoSuchElementException {
            Option result = null;
            try {
                result = Option.values()[option];
            } catch (ArrayIndexOutOfBoundsException ex){
                throw new NoSuchElementException("Brak elementu o takim ID");
            }
            return result;
        }
    }
}
