package com.example.demo.springboot_mysql_crud.controller;
// Defines the package for the controller layer, which handles HTTP requests.

import com.example.demo.springboot_mysql_crud.model.Book;
import com.example.demo.springboot_mysql_crud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // Marks this class as a REST controller (returns JSON responses)
@RequestMapping("/books")  // Base URL for all endpoints in this controller
public class BookController {

    @Autowired  // Automatically injects the BookService
    private BookService bookService;

    /**
     * GET /books
     * Fetches all books from the database.
     * @return List of all books
     */
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();  // Calls service to get all books
    }

    /**
     * GET /books/{id}
     * Fetches a single book by its ID.
     * @param id ID of the book
     * @return Book object if found
     */
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);  // Calls service to get book by ID
    }

    /**
     * POST /books
     * Adds one or more books to the database.
     * @param book List of Book objects from the request body
     * @return List of saved books
     */
    @PostMapping
    public List<Book> addBook(@RequestBody List<Book> book) {
        return bookService.addBook(book);  // Calls service to save books
    }

    /**
     * DELETE /books/{id}
     * Deletes a book with the given ID.
     * @param id ID of the book to delete
     */
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);  // Calls service to delete book
    }
}
