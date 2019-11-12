package com.task2_OOP;

public class JSONMessage implements MessageInterface {
    private String name = "JSON";
    private String message = "no json message";

    public JSONMessage(String message) {
        this.message = message;
    }

    public JSONMessage(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public JSONMessage() {
    }

    @Override
    public void prepareMessage() {
        System.out.println("Message Name: " + this.name);
        System.out.println("Message: " + this.message);
    }

    @Override
    public void prepareMessage(String message) {
        this.message = message;
        System.out.println("Message Name: " + this.name);
        System.out.println("Message: " + this.message);
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
