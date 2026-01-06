package com.example.library.controller;

import com.example.library.entity.BookEntity;
import com.example.library.service.BookService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // GET /api/books
    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public List<BookEntity> getAllBooks() {
        return bookService.getAllBooks();
    }

    // POST /api/books
    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public BookEntity addBook(@RequestBody BookEntity book) {
        return bookService.addBook(book);
    }
}
