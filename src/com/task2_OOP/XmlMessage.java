package com.task2_OOP;

public class XmlMessage implements MessageInterface {
    private String name = "XMLMessage";
    private String body = "no xml message";

    public XmlMessage () {
    }
    public XmlMessage (String inputText) {
        this.body = inputText;
    }
    public XmlMessage (String name, String body) {
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