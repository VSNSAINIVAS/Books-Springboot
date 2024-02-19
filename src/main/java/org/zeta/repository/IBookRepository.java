// Package for the Repository
package org.zeta.repository;

// Importing required packages
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.zeta.model.Book;
// Interface extending JpaRepository to get access to the methods
@Repository
public interface IBookRepository extends JpaRepository<Book, Integer> {
}
