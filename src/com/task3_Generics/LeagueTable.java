package com.task3_Generics;

import java.util.*;

public class LeagueTable<T extends AbstractTeam> {
    private List<T> teams = new ArrayList<T>();
    private String tableName;

    public LeagueTable(String tableName) {
        this.tableName = tableName;
    }

    public void add(T team) {
        teams.add(team);
    }

    public void remove(T team) {
        teams.remove(team);
    }

    public List<T> getTeams() {
        return teams;
    }

    public void print() {
        Collections.sort(teams);
        System.out.println("_______________________________________");
        System.out.println("\t\t  " + tableName);
        System.out.println("Name \t\t\t    Players \t Rating");
        for (T team : teams) {
            team.print();
        }
        System.out.println("_______________________________________");
    }
}