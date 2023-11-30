/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.oops.basic;

public class Review {
    private int id;
    private String description;
    private int rating;

    public Review(int id, String description, int rating) {
        this.id = id;
        this.description = description;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Review{" + "id=" + id + ", description='" + description + '\'' + ", rating=" + rating + '}';
    }
}
