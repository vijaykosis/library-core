package com.amdocs.libraryservice.controller;

import com.amdocs.libraryservice.model.Book;
import com.amdocs.libraryservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class BookController {
    private static final Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        logger.info("enter in getAllBooks..{}");
        return bookService.getAllBooks();
    }

    @PostMapping("/book")
    public Book createBook(@RequestBody Book book) {
        logger.info("enter in createBook..{}");
        return bookService.createBook(book);
    }

    @GetMapping("/book/{bookId}")
    public Book getBookById(@PathVariable(value = "bookId") Long bookId) {
        logger.info("enter in getBookById..{}");
        return bookService.getBookById(bookId);
    }

    @PutMapping("/book/{id}")
    public Book updateBook(@PathVariable(value = "id") Long bookId,
                           @RequestBody Book bookDetails) {
        logger.info("enter in updateBook..{}");
        return bookService.updateBook(bookId, bookDetails);
    }

    @DeleteMapping("/book/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable(value = "id") Long bookId) {
        logger.info("enter in deleteBook..{}");
        return bookService.deleteBook(bookId);
    }

    @GetMapping("/search/books")
    public List<Book> searchBook(@Param("category_id") String category_id) {
        logger.info("enter in searchBook..{}");
        return bookService.searchBooks(category_id);
    }


}
