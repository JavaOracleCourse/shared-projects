package game;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;


public class Player {
    
    
    private String name;
    private String cognome;
    private ArrayList<Goal> goal;
    private int eta;

    public Player(String name, String cognome, int eta) {
        this.name = name;
        this.cognome = cognome;
        this.goal =new ArrayList<Goal>();
        this.eta = eta;
    }
    

    
    
    public int goalTotali(){
        return goal.size();
    }  

    public int goalPerData(Date data){
        int s=0;
        for(Goal g : goal)
        {
            if(g.getData().equals(data))
                s+=1;
        }
        return s;
        
    }
    
    public void addGoal(){
        goal.add(new Goal());
    }
            
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public ArrayList<Goal> getGoal() {
        return goal;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", cognome="  +cognome +", eta=" + eta + " Goal totali: " + goalTotali()+"}\n";
    }
    
    
            
    
}
