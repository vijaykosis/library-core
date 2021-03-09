package com.amdocs.libraryservice.service;

import com.amdocs.libraryservice.model.Book;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BookService {

    public List<Book> getAllBooks();

    public Book createBook(Book book);

    public Book getBookById(Long bookId);


    public Book updateBook(Long bookId,Book bookDetails);

    public ResponseEntity<?> deleteBook(Long bookId);

   public List<Book> searchBooks(String keyword);
}
