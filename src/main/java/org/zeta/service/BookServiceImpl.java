// Package for services
package org.zeta.service;

// Importing required packages
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zeta.model.Book;
import org.zeta.repository.IBookRepository;

// Importing required collections
import java.util.List;
import java.util.Optional;
@Service
public class BookServiceImpl implements IBookService {
    // Connecting service layer to repository layer
    @Autowired
    IBookRepository dao;
    // Getting books
    @Override
    public List<Book> getBooks() {
        return dao.findAll();
    }
    // Getting book by id
    public Optional<Book> getBookById(int bookId) {
        return dao.findById(bookId);
    }
    // Adding book
    @Override
    public Book addBook(Book bk) {
        return dao.save(bk);
    }
    // Updating book
    @Override
    public Book updateBook(Book bk) {
        return dao.save(bk);
    }
    // Deleting book
    @Override
    public void deleteBook(int bookId) {
        dao.deleteById(bookId);
    }
    // Deleting all the books
    @Override
    public void deleteAllBooks() {
        dao.deleteAll();
    }
}
