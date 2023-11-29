/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsCollectionsRunner {
    public static void main(String[] args) {

        List<Student> students =
                List.of(new Student(1, "Thanh"),
                new Student(100, "Adam"),
                new Student(3, "Eve"));

        List<Student> studentsAl = new ArrayList<Student>(students);

        System.out.println(students);
        System.out.println(studentsAl);

        Collections.sort(studentsAl);
        System.out.println(studentsAl);

    }

}
