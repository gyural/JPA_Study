package com.example.jpastudy.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Book {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne
    BookStore bookStore;

}
