package com.amdocs.libraryservice.service;

import com.amdocs.libraryservice.model.Book;
import com.amdocs.libraryservice.model.Library;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LibraryService {

    public List<Library> getAllBooks(Long bookId);

    public Library createBook(Library library);
}
