package com.task3_Generics;

public class BaseballTeam extends AbstractTeam {
    private String name;
    private int players;
    private int avgWeight;

    public BaseballTeam(String name, int players, int avgWeight) {
        this.name = name;
        this.players = players;
        this.avgWeight = avgWeight;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public int getPlayers() {
        return players;
    }

    public void setAvgWeight(int avgWeight) {
        this.avgWeight = avgWeight;
    }

    public int getAvgWeight() {
        return avgWeight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        //Next 7 lines of code is a kind of formatting the output table.
        int maxNameLength = 20;
        int spacesToAdd = maxNameLength - name.length(); //The amount of spaces to add till the name has the maxNameLength(20);
        String tempBox;                                  //A simple temporary box for using in 'for' statement.
        for (int i = 0; i <spacesToAdd; i++) {
            tempBox = name;
            name = name + " ";                          // Adding spaces to maximum name length.
        }
        System.out.println(name + "" + players + "           " + avgWeight);
        this.name = name.replace(" ", "");// Removing the added spaces.
    }

    @Override
    public String toString() {
        return "BaseballTeam{" +
                "name='" + name + '\'' +
                ", players=" + players +
                ", avgWeight=" + avgWeight +
                '}';
    }
}
