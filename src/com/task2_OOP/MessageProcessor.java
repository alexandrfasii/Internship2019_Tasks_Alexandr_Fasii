package com.task2_OOP;

import java.util.ArrayList;
import java.util.List;

public class MessageProcessor {
    List<MessageInterface> messages = new ArrayList<MessageInterface>();
    public void add(MessageInterface message) {               //obiecte de orice tip care implementeaza interfata;
        messages.add(message);
    }
     public void printMessages() {
        for (MessageInterface message: messages) {
            message.prepareMessage();
            System.out.println();
        }
     }
}
