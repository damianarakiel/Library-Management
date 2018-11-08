package utils;

import data.Book;
import data.Magazine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataReader {

    Scanner scanner = new Scanner(System.in);

    public void close() {
        scanner.close();
    }

    public int getInt() throws NumberFormatException {
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException ex) {
            throw new NumberFormatException("Nieprawidłowa forma liczby");
        } finally {
            scanner.nextLine();
        }
        return number;
    }

    public Book readAndCreateBook() throws InputMismatchException {
        System.out.println("Tytuł: ");
        String title = scanner.nextLine();
        System.out.println("Autor: ");
        String author = scanner.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = scanner.nextLine();
        System.out.println("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.println("Rok wydania: ");
        int year = 0;
        int pages = 0;
        try {
            year = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ilość stron: ");
            pages = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException ex) {
            scanner.nextLine();
            throw ex;
        }
        return new Book(title, author, year, pages, publisher, isbn);
    }

    public Magazine readAndCreateMagazine() {
        System.out.println("Tytuł: ");
        String title = scanner.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = scanner.nextLine();
        System.out.println("Język: ");
        String language = scanner.nextLine();
        System.out.println("Rok wydania: ");
        int year = 0;
        int month = 0;
        int day = 0;
        try {
            year = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Miesiąc: ");
            month = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Dzień: ");
            day = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException ex) {
            scanner.nextLine();
            throw ex;
        }
        return new Magazine(title, publisher, year, month, day, language);
    }

}
