package com.task5_IOStream;

import java.io.*;

public class IOStreamByteMethods {
    private File file;
    private FileOutputStream outputStream;
    private FileInputStream inputStream;

    public IOStreamByteMethods(File file) {
        this.file = file;
    }

    public void write(String text) throws Exception {
        this.outputStream  = new FileOutputStream(this.file, false);
        outputStream.write(text.getBytes());
        outputStream.close();
        }

    public void read() throws Exception {
        this.inputStream = new FileInputStream(this.file);
        int b = 0;
        StringBuilder sBuilder = new StringBuilder();
        while ((b = inputStream.read()) != -1) {
            sBuilder.append((char) b);
        }
        inputStream.close();
        System.out.println(sBuilder);
    }

    public void copyTo(String filePath) throws Exception {
        this.inputStream = new FileInputStream(this.file);
        this.outputStream = new FileOutputStream(filePath);
        int r = 0;
        while (r != -1) {
            r = inputStream.read();
            outputStream.write(r);
        }
        inputStream.close();
        outputStream.close();
    }
}
