package entities;

public class Lectures {
    private long isbn;
    private String titolo;
    private int annoPub;
    private int numeroPagine;
    public Lectures(long isbn, String titolo, int annoPub, int numeroPagine) {
        this.isbn = isbn;
        this.titolo = titolo;
        this.annoPub = annoPub;
        this.numeroPagine = numeroPagine;
    }
    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPub() {
        return annoPub;
    }

    public void setAnnoPub(int annoPub) {
        this.annoPub = annoPub;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }
    @Override
   public String toString (){
        return "Lectures : isbn = " + getIsbn() + "titolo = " + getTitolo();
   }
}
