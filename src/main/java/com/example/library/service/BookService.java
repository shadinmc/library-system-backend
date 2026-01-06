package com.example.library.service;

import com.example.library.entity.BookEntity;
import com.example.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    // Constructor Injection (BEST PRACTICE)
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Fetch all books
    public List<BookEntity> getAllBooks() {
        return bookRepository.findAll();
    }

    // Add a new book
    public BookEntity addBook(BookEntity book) {
        return bookRepository.save(book);
    }
}
