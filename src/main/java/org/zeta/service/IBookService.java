// Package to create a service which helps in building the logic
package org.zeta.service;

// Importing DAO
import org.zeta.model.Book;

// Required collections
import java.util.List;
import java.util.Optional;

// Interface
public interface IBookService {
    // Get all Books
    public List<Book> getBooks();
    // Get book by id
    public Optional<Book> getBookById(int bookId);
    // Add book
    public Book addBook(Book bk);
    // Update book
    public Book updateBook(Book bk);
    // Delete book
    public void deleteBook(int bookId);
    // Delete all books
    public void deleteAllBooks();
}
