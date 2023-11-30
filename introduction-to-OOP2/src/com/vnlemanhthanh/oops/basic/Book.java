/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.oops.basic;

import java.util.ArrayList;

public class Book {
    private int id;
    private String name;
    private String author;
    private ArrayList<Review> reviews = new ArrayList<>();

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    public String toString() {
        return "Book{" + "id=" + id + ", name='" + name + '\'' + ", author='" + author + '\'' + ", reviews=" + reviews + '}';
    }

    //Test Client
    public static void main(String[] args) {
        Book book = new Book(123, "Object Oriented Programming with Java", "Thanh");

        book.addReview(new Review(10, "Greater Book", 5));
        book.addReview(new Review(101, "Awesome Book",5));

        System.out.println(book);


    }
}
