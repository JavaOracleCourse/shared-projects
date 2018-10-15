package game;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;



public class Team {
    private String nome;
    private ArrayList<Player> player;

    public Team(String nome, ArrayList<Player> player) {
        this.nome = nome;
        this.player = player;
    }
    public Team(String nome) {
        this(nome,new ArrayList<Player>());
    }
    
    public void addPlayer(Player p){
        player.add(p);
    }
    
    public Player ricercaGiocatore(String nome, String cognome){
        for(Player p: player){
            if(p.getName()==nome && p.getCognome()==cognome){
                return p;
            }
        }
        return null;
    }
    
    public void goal(Player p){
        p.addGoal();
    }
    
    public int numeroTotGoal(){
        int s=0;
        for(Player p: player){
            s+=p.goalTotali();
        }
        return s;
    }
    
    public int numeroTotGoal(Date data){
        int s=0;
        for(Player p: player)
            for(Goal g: p.getGoal())
                if(g.getData().equals(data))
                    s+=p.goalTotali();
        
        return s;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Player> getPlayer() {
        return player;
    }

    public void setPlayer(ArrayList<Player> player) {
        this.player = player;
    }
    
    public void printPlayer(){
        String message="";
        for(Player p: player){
            message+=p.toString();
        }
        System.out.println(message);
    }
    
    
}
