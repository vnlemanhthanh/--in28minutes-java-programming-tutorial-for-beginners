/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.oops.inheritance;

public class Runner {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Thanh");
        student.setEmail("vnlemanh@gmail.com");
        student.setPhoneNumber("123456789");

        Person person = new Person();
        person.setName("Thanh");
        person.setEmail("vnlemanh@gmail.com");
        person.setPhoneNumber("123456789");
        String value = person.toString();
        System.out.println(value);
        System.out.println(person);

    }
}
