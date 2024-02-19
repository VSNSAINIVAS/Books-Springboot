// Model Package to define the DAO book
package org.zeta.model;

// Importing required annotations from Persistence
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Creating a Table from the Entity Book
@Table
@Entity
public class Book {
    // Id -- Primary key
    // Defining different variables to define a book
    @Id
    @Column
    private int bookId;
    @Column
    private String bookTitle;
    @Column
    private String bookAuthor;
    @Column
    private String bookISBN;
    @Column
    private String bookAbstract;
    // Getters and Setters methods
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public String getBookAbstract() {
        return bookAbstract;
    }

    public void setBookAbstract(String bookAbstract) {
        this.bookAbstract = bookAbstract;
    }

}
