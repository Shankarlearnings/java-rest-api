package com.example.demo.springboot_mysql_crud.service;
// Defines the package for the service layer which handles business logic.

import com.example.demo.springboot_mysql_crud.model.Book;
import com.example.demo.springboot_mysql_crud.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  // Marks this class as a Spring service component (used for business logic)
public class BookService {

    @Autowired  // Injects the BookRepository bean automatically
    private BookRepository bookRepository;

    /**
     * Retrieves all books from the database.
     * @return List of all Book entities.
     */
    public List<Book> getAllBooks() {
        return bookRepository.findAll();  // Fetches all book records
    }

    /**
     * Retrieves a single book by its ID.
     * @param id Book ID
     * @return Book object or null if not found
     */
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);  // Returns book or null if not found
    }

    /**
     * Adds a list of new books to the database.
     * @param book List of books to save
     * @return List of saved Book objects
     */
    public List<Book> addBook(List<Book> book) {
        return bookRepository.saveAll(book);  // Saves all books to the DB
    }

    /**
     * Deletes a book by its ID.
     * @param id ID of the book to delete
     */
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);  // Deletes book with the specified ID
    }
}
