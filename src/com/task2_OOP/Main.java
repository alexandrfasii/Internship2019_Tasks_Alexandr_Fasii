package com.task2_OOP;

public class Main {
    public static void main(String[] args) {
        XmlMessage xmlMessage = new XmlMessage("An XML message is displayed."); //Initial XML message.

        MessageConverter converter = new MessageConverter();
        JSONMessage jsonMessage = converter.convertToJSON(xmlMessage); //Convert to JSON. (name changes, body remains)

        CSVMessage  csvMessage = converter.convertToCSV(jsonMessage);  //Convert to CSV.  (name changes, body remains)

        MessageProcessor msgProcessor = new MessageProcessor();
        msgProcessor.add(xmlMessage);
        msgProcessor.add(jsonMessage);
        msgProcessor.add(csvMessage);
        msgProcessor.printMessages();
    }
}
