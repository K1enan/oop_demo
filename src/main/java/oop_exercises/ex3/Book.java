package oop_exercises.ex3;

public class Book {

    private String bookTitle;
    private double price;
    private Author author;

    public Book() {
    }

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Book(String bookTitle, double price, Author author) {
        this.bookTitle = bookTitle;
        this.price = price;
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public double getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }

    public void displayAuthor() {
        try {
            System.out.println("Author that has been written book " + bookTitle + " is:\n" + author.getAuthorName());

        } catch (NullPointerException n) {

            System.out.println("Null");
        }
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", price=" + price +
                ", author=" + author +
                '}';
    }
}