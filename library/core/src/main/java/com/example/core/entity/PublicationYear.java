package com.example.core.entity;

import jakarta.persistence.*;

@Entity
public class PublicationYear {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer year;

    private String country;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    public PublicationYear() {
    }

    public PublicationYear(Integer year, String country, Book book) {
        this.year = year;
        this.country = country;
        this.book = book;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
