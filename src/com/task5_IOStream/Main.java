package com.task5_IOStream;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        /*IO methods*/

       File dir = new File("src/com/task5_IOStream/IO");
       dir.mkdir();
       File file = new File("src/com/task5_IOStream/IO/file.txt");

       IOStreamByteMethods testMethods = new IOStreamByteMethods(file);
       testMethods.write("Here you can type any text you would like to be added.\n This is a new line.");
       testMethods.read();
       testMethods.copyTo("src/com/task5_IOStream/IO/fileCopied.txt");

       File file2 = new File("src/com/task5_IOStream/IO/fileCopied.txt");
       IOStreamByteMethods testMethods2 = new IOStreamByteMethods(file2);
       testMethods2.read();

//        file.delete();
//        file2.delete();
//        dir.delete();


        /* NIO methods */
        File dir2 = new File("src/com/task5_IOStream/NIO");
        dir2.mkdir();
        NIOStreamTestMethods test = new NIOStreamTestMethods();
        test.createFile("src/com/task5_IOStream/NIO/Test.txt");
        test.createFile("src/com/task5_IOStream/NIO/Test2.txt");
        test.writeTo("src/com/task5_IOStream/NIO/Test.txt", "Hello world, this is a test text.");
        test.read("src/com/task5_IOStream/NIO/Test.txt");
        test.delete("src/com/task5_IOStream/NIO/Test2.txt");


    }
}
