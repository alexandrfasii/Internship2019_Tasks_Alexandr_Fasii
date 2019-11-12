package com.task2_OOP;

public class CSVMessage implements MessageInterface {
    private String name = "CSVMessage";
    private String body = "no csv message";

    public CSVMessage () {
    }
    public CSVMessage (String inputText) {
        this.body = inputText;
    }
    public CSVMessage (String name, String body) {
        this.name = name;
        this.body = body;
    }

    @Override
    public void prepareMessage() {
        System.out.println("Message Type: " + this.name);
        System.out.println("Message: " + this.body);
    }

    @Override
    public void prepareMessage(String message) {
        this.body = message;
        System.out.println("Message Type: " +this.name);
        System.out.println("Message: " +this.body);
    }

    @Override
    public void prepareMessage(String message1, String message2) {
        this.body = message1 + " , " + message2;
        System.out.println("Message Type: " +this.name);
        System.out.println("Message: " + this.body);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}