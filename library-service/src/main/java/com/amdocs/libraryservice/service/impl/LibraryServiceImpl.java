package com.amdocs.libraryservice.service.impl;

import com.amdocs.libraryservice.model.Library;
import com.amdocs.libraryservice.repository.LibraryRepository;
import com.amdocs.libraryservice.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService {

    @Autowired
    LibraryRepository libraryRepository;

    @Override
    public List<Library> getAllBooks(Long libId) {
        return libraryRepository.findAll();
    }

    @Override
    public Library createBook(Library library) {
        return libraryRepository.save(library);
    }
}
