package game;
import java.util.ArrayList;
import java.util.LinkedList;


public class League {
    private ArrayList<Team> team;
    private ArrayList<Game> game;

    public League() {
        this.team = new ArrayList<Team>();
        this.game = new ArrayList<Game>();
    }
    
    
    
    public void addTeam(Team t){
        team.add(t);
    }
    
    public void addGame(Game g){
        game.add(g);
    }

    public ArrayList<Team> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<Team> team) {
        this.team = team;
    }

    public ArrayList<Game> getGame() {
        return game;
    }

    public void setGame(ArrayList<Game> game) {
        this.game = game;
    }
    
    
}
