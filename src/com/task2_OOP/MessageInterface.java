package com.task2_OOP;

public interface MessageInterface {
    void prepareMessage();
    void prepareMessage(String a);
    void prepareMessage(String a, String b);

    String getBody();
    String getName();
}