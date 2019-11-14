package com.task3_Generics;

public abstract class AbstractTeam implements Comparable<AbstractTeam> {
    public abstract String getName();

    public void print() {
    }

    @Override
    public int compareTo(AbstractTeam abstractTeam) {
        return getName().compareTo(abstractTeam.getName());
    }
}
