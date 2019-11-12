package com.task2_OOP;

public interface MessageInterface {
    void prepareMessage();
    void prepareMessage(String message);
    void prepareMessage(String message1, String message2);

    String getMessage();
    String getType();
}