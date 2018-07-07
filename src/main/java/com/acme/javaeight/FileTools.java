package com.acme.javaeight;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;

public class FileTools {

    public static void main(String[] args) throws IOException {

        // Print all files
        Files.list(FileSystems.getDefault().getPath(".")).forEach(System.out::println);

        // Print all lines from a file that contains target
        Files.lines(FileSystems.getDefault().getPath("build.xml"))
            .filter((l) -> l.contains("target"))
            .forEach(System.out::println);

    }
}
