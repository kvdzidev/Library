package com.example.core.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class RentalPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal price;

    private String currency;

    @OneToOne
    @JoinColumn(name = "book_id")
    private Book book;

    public RentalPrice() {
    }

    public RentalPrice(BigDecimal price, String currency, Book book) {
        this.price = price;
        this.currency = currency;
        this.book = book;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
