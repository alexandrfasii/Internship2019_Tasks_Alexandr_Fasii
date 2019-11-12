package com.task2_OOP;

public class CSVMessage implements MessageInterface {
    private String name;
    private String message;

    public CSVMessage () {
        this.name = "CSV";
        this.message = "no csv message";
    }
    public CSVMessage (String message) {
        this.name = "CSV";
        this.message = message;
    }
    public CSVMessage (String name, String message) {
        this.name = name;
        this.message = message;
    }

    @Override
    public void prepareMessage() {
        System.out.println("Message Name: " + this.name);
        System.out.println("Message: " + this.message);
    }

    @Override
    public void prepareMessage(String message) {
        this.message = message;
        System.out.println("Message Name: " +this.name);
        System.out.println("Message: " +this.message);
    }

    @Override
    public void prepareMessage(String message1, String message2) {
        this.message = message1 + " , " + message2;
        System.out.println("Message Name: " +this.name);
        System.out.println("Message: " + this.message);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}