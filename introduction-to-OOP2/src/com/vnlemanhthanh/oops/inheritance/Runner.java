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

        Employee employee = new Employee();
        employee.setName("Thanh");
        employee.setEmail("vnlemanhthanh@gmail.com");
        employee.setPhoneNumber("123456789");
        employee.setTitle("Programmer");
        employee.setEmployeeGrade('A');
        //String value = employee.toString();
        //System.out.println(value);
        System.out.println(employee);

    }
}
