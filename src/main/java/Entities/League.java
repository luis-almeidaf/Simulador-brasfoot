package Entities;

import java.util.List;

public class League {
    private List<Team> teams;
    private List<Match> matches;

    public League(List<Team> teams, List<Match> matches) {
        this.teams = teams;
        this.matches = matches;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }
}
