package app;

public class LibraryApp {

    public static final String APP_NAME = "Bibliotek v0.9"; // wersja aplikacji

    public static void main(String[] args) {

        System.out.println(APP_NAME);
        LibraryControl libraryControl = new LibraryControl();
        libraryControl.control();


//        Book[] books = new Book[1000];
//        DataReader dataReader = new DataReader();

//        books[0] = new Book(
//                "W pustyni i w puszczy", "Henryk Sienkiewicz",
//                2010, 296, "Greg", "9788373271890");
//        books[1] = new Book("Java. Efektywne programowanie. Wydanie II",
//                "Joshua Bloch", 2009, 352,
//                "Helion", "9788324620845");
//        books[2] = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide",
//                "Bert Bates, Katherine Sierra", 2008, 851,
//                "McGraw-Hill Osborne Media", "9780071591065");
//
//        System.out.println(APP_NAME);
//        System.out.println("Książki dostępne w bibliotece:");
//        books[0].printInfo();
//        books[1].printInfo();
//        books[2].printInfo();
//        System.out.println("System może przechowywać " + books.length + " książek");

//        System.out.println(APP_NAME);
//        System.out.println("Wprowadź nową książkę:");
//        books[0] = dataReader.readAndCreateBook();
//        books[1] = dataReader.readAndCreateBook();
//        dataReader.close();
//
//        books[0].printInfo();
//        books[1].printInfo();
//        System.out.println("System może przechowywać do " + books.length + " książek");
    }
}
