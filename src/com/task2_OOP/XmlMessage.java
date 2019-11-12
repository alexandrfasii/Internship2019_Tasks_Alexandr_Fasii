package com.task2_OOP;

public class XmlMessage implements MessageInterface {
    private String type = "XML";
    private String message = "no xml message";

    public XmlMessage () {
    }
    public XmlMessage (String message) {
        this.message = message;
    }
    public XmlMessage (String type, String message) {
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