package com.example.demo.springboot_mysql_crud.repository;
// Defines the package for repository interfaces (data access layer).

import com.example.demo.springboot_mysql_crud.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for Book entity.
 * Extends JpaRepository to provide built-in CRUD operations like:
 * - findAll()
 * - findById()
 * - save()
 * - deleteById()
 * - and more...
 *
 * No need to write implementation — Spring Data JPA provides it automatically.
 */
public interface BookRepository extends JpaRepository<Book, Long> {
    // <Book, Long> means: Entity is Book, and primary key (ID) is of type Long.
}
