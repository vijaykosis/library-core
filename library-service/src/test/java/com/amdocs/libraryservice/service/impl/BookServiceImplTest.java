package com.amdocs.libraryservice.service.impl;

import com.amdocs.libraryservice.repository.BookRepository;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class BookServiceImplTest {

    @Mock
    BookServiceImpl bookService;

    @Mock
    BookRepository bookRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        Mockito.when(bookRepository.findAll()).thenReturn(Mockito.anyList());
    }

    @Test
    void test_getAllBooks()
    {
       // Assertions.assertNull(bookService.getAllBooks());
    }

    @Test
    void createBook() {
    }

    @Test
    void getBookById() {
    }

    @Test
    void updateBook() {
    }

    @Test
    void deleteBook() {
    }
}