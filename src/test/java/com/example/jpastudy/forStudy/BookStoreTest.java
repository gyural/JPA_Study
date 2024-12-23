package com.example.jpastudy.forStudy;

import com.example.jpastudy.domain.entity.Book;
import com.example.jpastudy.domain.entity.BookStore;
import com.example.jpastudy.repository.BookRepository;
import com.example.jpastudy.repository.BookStoreRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookStoreTest {
    @Autowired
    private BookStoreRepository bookStoreRepository;
    @Autowired
    private BookRepository bookRepository;

    @Test
    public void BookStoreAddBook() {
        // 새로운 책방 생성
        BookStore bookStore = new BookStore();
        bookStore.setName("new BookStore");
        bookStoreRepository.save(bookStore);

        // 책 생성 후 책방에 추가
        Book newBook = new Book();
        newBook.setName("new Book");

        bookStore.addBook(newBook);

        // 책방 저장 (Cascade 설정으로 인해 Book도 자동 저장됨)
        bookRepository.save(newBook);

    }
}
