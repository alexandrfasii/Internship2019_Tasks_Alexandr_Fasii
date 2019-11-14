package com.task3_Generics;

public class Main {
    public static void main(String[] args) {
        LeagueTable<BaseballTeam> baseballMajorLeague = new LeagueTable<>("Baseball Major League");

        BaseballTeam baseballTeam1 = new BaseballTeam("Alligator", 4, 100);
        BaseballTeam baseballTeam2 = new BaseballTeam("The Eagle", 4, 95);
        BaseballTeam baseballTeam3 = new BaseballTeam("Freedom", 4, 93);
        BaseballTeam baseballTeam4 = new BaseballTeam("Champions", 4, 97);
        BaseballTeam baseballTeam5 = new BaseballTeam("Pokemon", 4, 102);

        baseballMajorLeague.add(baseballTeam3);
        baseballMajorLeague.add(baseballTeam4);
        baseballMajorLeague.add(baseballTeam5);
        baseballMajorLeague.add(baseballTeam2);
        baseballMajorLeague.add(baseballTeam1);

        baseballMajorLeague.print();

        LeagueTable<FootballTeam> fbLeagueTwo = new LeagueTable<>("Football Premier League");

        FootballTeam fbTeam1 = new FootballTeam("Endava", 11, 10);
        FootballTeam fbTeam2 = new FootballTeam("Elation", 11, 9);
        FootballTeam fbTeam3 = new FootballTeam("Allied", 11, 5);
        FootballTeam fbTeam4 = new FootballTeam("Moldova", 11, 7);
        FootballTeam fbTeam5 = new FootballTeam("USA", 11, 6);

        fbLeagueTwo.add(fbTeam1);
        fbLeagueTwo.add(fbTeam2);
        fbLeagueTwo.add(fbTeam3);
        fbLeagueTwo.add(fbTeam4);
        fbLeagueTwo.add(fbTeam5);

        fbLeagueTwo.print();

        baseballMajorLeague.remove(baseballTeam1);
        baseballMajorLeague.print();
        fbLeagueTwo.remove(fbTeam5);
        fbLeagueTwo.print();
    }
}
