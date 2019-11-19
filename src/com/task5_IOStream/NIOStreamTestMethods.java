package com.task5_IOStream;

import java.nio.file.Files;
import java.nio.file.Paths;

public class NIOStreamTestMethods {

    public void createFile(String file) throws Exception {
        Files.createFile(Paths.get(file));
        System.out.println("Created File Path: " + Paths.get(file));
    }

    public void writeTo(String file, String text) throws Exception {
        Files.write(Paths.get(file), text.getBytes());
    }

    public void read(String file) throws Exception {
        byte[] array = Files.readAllBytes(Paths.get(file));
        for (int i = 0; i <array.length ; i++) {
            System.out.print((char) array[i]);
        }
        System.out.println();
    }

    public void delete(String file) throws Exception {
        Files.deleteIfExists(Paths.get(file));
    }
}
