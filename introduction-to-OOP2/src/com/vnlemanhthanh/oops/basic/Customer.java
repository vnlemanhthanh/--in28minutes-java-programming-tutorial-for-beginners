/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.oops.basic;

public class Customer {
    private String name;
    private Address homeAddress;
    private Address workAddress;

    public Customer(String name, Address homeAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public String toString() {
        return String.format("name - [%s] home address [%s] word address [%s]", name, homeAddress, workAddress);
    }


    //Test Client
    public static void main(String[] args) {
        Address homeAddress = new Address("line 1", "PDG", "71913");
        Customer customer = new Customer("Thanh", homeAddress);

        Address workAddress = new Address("line 1 for work", "Q9", "12376");
        customer.setWorkAddress(workAddress);

        System.out.println(customer);

    }

}

class Address {
    private String line1;
    private String city;
    private String zip;

    public Address(String line1, String city, String zip) {
        this.line1 = line1;
        this.city = city;
        this.zip = zip;
    }

    public String toString() {
        return line1 + " " + city + " " + zip;
    }
}