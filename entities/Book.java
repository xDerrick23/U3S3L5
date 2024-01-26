package entities;

public class Book extends Lectures {

    public Book(long isbn, String titolo, int annoPub, int numeroPagine) {
        super(isbn, titolo, annoPub, numeroPagine);
    }
}
