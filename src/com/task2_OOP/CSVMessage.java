package com.task2_OOP;

public class CSVMessage implements MessageInterface {
    private String type = "CSV";
    private String message = "no csv message";

    public CSVMessage () {
    }
    public CSVMessage (String message) {
        this.message = message;
    }
    public CSVMessage (String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public void prepareMessage() {
        System.out.println("Message Type: " + this.type);
        System.out.println("Message: " + this.message);
    }

    @Override
    public void prepareMessage(String message) {
        this.message = message;
        System.out.println("Message Type: " +this.type);
        System.out.println("Message: " +this.message);
    }

    @Override
    public void prepareMessage(String message1, String message2) {
        this.message = message1 + " , " + message2;
        System.out.println("Message Type: " +this.type);
        System.out.println("Message: " + this.message);
    }

    @Override
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}