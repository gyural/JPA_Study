package com.example.jpastudy.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter @Setter
public class BookStore {

    @Id @GeneratedValue
    private Long id;
    private String name;

    @OneToMany
    private Set<Book> books = new HashSet<>();

    public void addBook(Book book) {
        books.add(book);
    }

}
