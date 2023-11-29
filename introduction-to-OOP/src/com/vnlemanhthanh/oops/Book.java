/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.oops;

public class Book {
    private int noOfCopies;

    public void setNoOfCopies(int noOfCopies) {
        if (noOfCopies > 0) {
            this.noOfCopies = noOfCopies;
        }
    }

    public void increaseNoOfCopies(int howMany) {
        setNoOfCopies(this.noOfCopies + howMany);
    }

    public void decreaseNoOfCopies(int howMany) {
        setNoOfCopies(this.noOfCopies - howMany);
    }
}
