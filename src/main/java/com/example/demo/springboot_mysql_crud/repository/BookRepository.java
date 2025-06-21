package com.example.demo.springboot_mysql_crud.repository;

import com.example.demo.springboot_mysql_crud.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long> {
}
