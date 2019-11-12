package com.task2_OOP;

public class XmlMessage implements MessageInterface {
    private String name;
    private String message;

    public XmlMessage () {
        this.name = "XML";
        this.message = "no xml message";
    }

    public XmlMessage (String message) {
        this.name = "XML";
        this.message = message;
    }

    public XmlMessage (String name, String message) {
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