package com.example.jpastudy.repository;

import com.example.jpastudy.domain.entity.Book;
import com.example.jpastudy.domain.entity.BookStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookStoreRepository extends JpaRepository<BookStore, Long> {

}
