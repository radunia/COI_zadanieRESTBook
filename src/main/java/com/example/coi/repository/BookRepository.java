package com.example.coi.repository;

import com.example.coi.persitance.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    Book findBookByIBAN(Long IBAN);
    List<Book> findBookByPartOfName(String partName);

//    @Query (value = "select * from book where book.name like ?1", nativeQuery = true)
//    Page<Book> findBookByPartOfName(String partName, Pageable pageable);
}
