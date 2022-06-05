package com.example.coi.service;

import com.example.coi.persitance.Book;
import com.example.coi.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public Book findBookByIBAN(Long IBAN) {
        return bookRepository.findBookByIBAN(IBAN);
    }

    public List<Book> findBookByPartOfName(String partName) {
        Book book = new Book();
        boolean contains = book.getTitle().contains(partName);
        List<Book> bookList = new ArrayList<>();
        List<Book> matchingBooks = new ArrayList<>();
        for (Book b : bookList) {
            if (b.getTitle().contains(partName)) {
                matchingBooks.add(b);
            }
        }
        return matchingBooks;
    }

}
