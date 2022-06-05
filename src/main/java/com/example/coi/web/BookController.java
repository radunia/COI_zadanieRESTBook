package com.example.coi.web;

import com.example.coi.persitance.Book;
import com.example.coi.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;


    @GetMapping("/{IBAN}")
    public ResponseEntity<Book> getId(@PathVariable Long id){
        return ResponseEntity.ok(bookService.findBookByIBAN(id));
    }

    @GetMapping("/{partName}/books?")
    public ResponseEntity<List<Book>> getBooksByPartOfName(@PathVariable String partName){
        return ResponseEntity.ok(bookService.findBookByPartOfName(partName));
    }


}
