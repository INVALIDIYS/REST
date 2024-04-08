package com.dbconnection.lab8.models;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title, author, fulltext;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getFulltext() {
        return fulltext;
    }
    public void setFulltext(String fulltext) {
        this.fulltext = fulltext;
    }

    public Book() {
    }
    public Book(String title, String author, String fulltext) {
        this.title = title;
        this.author = author;
        this.fulltext = fulltext;
    }
}
