package com.example.demo.springboot_mysql_crud.service;

import com.example.demo.springboot_mysql_crud.model.Book;
import com.example.demo.springboot_mysql_crud.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book getBookById(Long id){
        return bookRepository.findById(id).orElse(null);
    }

    public List<Book> addBook(List<Book> book){
        return bookRepository.saveAll(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
