package oop_exercises.ex3;

import java.util.Arrays;

public class Author {

    private String authorName;
    private int numberOfBooks;
    private Book[] books;

    public Author() {
    }

    public Author(String authorName) {
        this.authorName = authorName;
    }

    public Author(String authorName, int numberOfBooks, Book[] books) {
        this.authorName = authorName;
        this.numberOfBooks = numberOfBooks;
        this.books = books;
    }

    public void displayInformation() {
        try {
            System.out.println("Author name: " + authorName + "\n" + "No of books: " + numberOfBooks + "\n");
            printAllBooks();
        } catch (NullPointerException n) {
            System.out.println("Null");
        }
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {

        this.authorName = authorName;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public void printAllBooks() {
        try {
            System.out.println("The books that have been written by " + authorName + " are: ");
            for (Book b : books)
                System.out.println(b.getBookTitle());
        } catch (NullPointerException n) {
            System.out.println("Null");
        }
    }

    public Author(Book[] books) {
        this.books = books;
    }

    public void setBooks() {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", numberOfBooks=" + numberOfBooks +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}


