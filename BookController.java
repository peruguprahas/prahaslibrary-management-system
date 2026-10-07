package com.anurag.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "*") // Allows your front-end dashboards to connect smoothly without security blocks
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    // 1. Get all books for the inventory dashboard
    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // 2. Add a new book to the library inventory
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        book.setAvailableCopies(book.getTotalCopies());
        book.setStatus("Available");
        return bookRepository.save(book);
    }
}
