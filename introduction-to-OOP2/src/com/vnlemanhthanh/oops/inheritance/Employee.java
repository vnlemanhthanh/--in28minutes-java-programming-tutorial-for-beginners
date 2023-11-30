/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.oops.inheritance;

import java.math.BigDecimal;

public class Employee extends Person {

    private String title;
    private String employeeName;
    private char employeeGrade;
    private BigDecimal salary;

    public Employee(String name, String title) {
        super(name);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public char getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(char employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "#" + title + "#" + employeeName + "#" + employeeGrade + "#" + salary;
    }
}
