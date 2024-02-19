// Package for the controllers which redirects the requests to a particular method
package org.zeta.controllers;

// Importing required packages
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zeta.helper.Helper;
import org.zeta.model.Book;
import org.zeta.service.BookServiceImpl;
import org.zeta.validate.Validation;

import java.util.List;
import java.util.Optional;
@RestController
public class BookController {
    @Autowired
    BookServiceImpl bookSvc;

    // URL mapping to get all the books
    @GetMapping("/books/all")
    public List<Book> getAllBooks(){
        List<Book> res = bookSvc.getBooks();
        System.out.println(res);
        if(Validation.checkNull(res)){
            Helper.getLogger(BookController.class).error("Null value returned which cannot be parsed [URL : /books/all].");
            return null;
        }
        return res;
    }

    // URL mapping to get the book by id
    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable("id") int id){
        Optional<Book> res = bookSvc.getBookById(id);
        if(Validation.checkNull(res)){
            Helper.getLogger(BookController.class).error("Null value returned which cannot be parsed [URL : /book/id].");
            return null;
        }
        return res.orElse(null);
    }

    // URL mapping to add the book
    @PostMapping("/book/add")
    public Book addBook(@RequestBody Book bk){
        Book res = bookSvc.addBook(bk);
        if(Validation.checkNull(res)){
            Helper.getLogger(BookController.class).error("Null value returned which cannot be parsed [URL : /book/add].");
            return null;
        }
        return res;
    }

    // URL mapping to add multiple books
    @PostMapping("/book/add/multiple")
    public List<Book> addMultipleBooks(@RequestBody List<Book> bks){
        for (Book bk : bks) {
            if (Validation.checkNull(bk)) {
                Helper.getLogger(BookController.class).error("Null value returned which cannot be parsed [URL : /book/add].");
                return null;
            }
            bookSvc.addBook(bk);
        }
        return bks;
    }

    // URL mapping to update the book
    @PutMapping("/book/update")
    public Book updateBook(@RequestBody Book bk){
        Book res = bookSvc.updateBook(bk);
        if(Validation.checkNull(res)){
            Helper.getLogger(BookController.class).error("Null value returned which cannot be parsed [URL : /book/add].");
            return null;
        }
        return res;
    }

    // URL mapping to delete the book
    @DeleteMapping("/delete/{id}")
    public void deleteBookById(@PathVariable("id") int id){
        bookSvc.deleteBook(id);
    }

    // URL mapping to delete all books
    @DeleteMapping("/delete/all")
    public void deleteAllBooks(){
        bookSvc.deleteAllBooks();
    }
}
