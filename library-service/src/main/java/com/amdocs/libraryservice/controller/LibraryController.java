package com.amdocs.libraryservice.controller;

import com.amdocs.libraryservice.model.Library;
import com.amdocs.libraryservice.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class LibraryController {

    @Autowired
    LibraryService libraryService;

    @GetMapping("/library/{library_id}")
    public List<Library> getAllBooks(@PathVariable(value = "library_id") Long library_id) {
        return libraryService.getAllBooks(library_id);
    }

    @PostMapping("/library/{library_id}/book/{book_id}")
    public Library createBook(@RequestBody Library library) {
        return libraryService.createBook(library);
    }

}
