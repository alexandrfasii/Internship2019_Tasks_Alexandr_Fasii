package com.task3_Generics;

public class FootballTeam extends AbstractTeam{
    private String name;
    private int players;
    private int rating;

    public FootballTeam(String name, int players, int rating) {
        this.name = name;
        this.players = players;
        this.rating = rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public int getPlayers() {
        return players;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
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
        System.out.println(name + "" + players + "           " + rating);
        this.name = name.replace(" ", "");// Removing the added spaces.
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "name='" + name + '\'' +
                ", players=" + players +
                ", rating=" + rating +
                '}';
    }
}