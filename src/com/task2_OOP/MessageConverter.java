package com.task2_OOP;

public class MessageConverter {

    public JSONMessage convertToJSON(MessageInterface message) { //obiecte de orice tip care implementeaza interfata;
        return new JSONMessage(message.getMessage());
    }

    public XmlMessage convertToXML(MessageInterface message) {
        return new XmlMessage(message.getMessage());
    }

    public CSVMessage convertToCSV(MessageInterface message) {
        return new CSVMessage(message.getMessage());
    }
}
