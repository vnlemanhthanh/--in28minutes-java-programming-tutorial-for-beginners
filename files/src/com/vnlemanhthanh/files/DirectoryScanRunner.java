/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirectoryScanRunner {
    public static void main(String[] args) throws IOException {

        Files.list(Paths.get(".")).forEach(System.out::println);
    }
}
