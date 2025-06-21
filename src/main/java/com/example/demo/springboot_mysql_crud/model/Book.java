package com.example.demo.springboot_mysql_crud.model;
// Defines the package where this model class resides.

/**
 * Represents the Book entity that maps to a table in the MySQL database.
 */
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity  // Marks this class as a JPA entity (will be mapped to a database table)
public class Book {

    @Id  // Marks this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Auto-generates the ID value using the database's identity column (e.g., AUTO_INCREMENT in MySQL)
    private Long id;

    private String title;  // Book title
    private String author; // Book author

    // Getter for 'title'
    public String getTitle() {
        return title;
    }

    // Setter for 'title'
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for 'author'
    public String getAuthor() {
        return author;
    }

    // Setter for 'author'
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for 'id'
    public Long getId() {
        return id;
    }

    // Setter for 'id'
    public void setId(Long id) {
        this.id = id;
    }

    // Getters & Setters provide access to private fields
}
