package game;
import java.util.Date;
import java.util.LinkedList;


public class Principale {
    public static League league;
    public static Team team,team2;

    public Principale() {}
    
    
    
    
    public static void main(String[] args){
        Date tmp=new Date();
        Date data=new Date(tmp.getYear(),tmp.getMonth(),tmp.getDay());
        league = new League();
        team=new Team("squadra 1");
        Player p = null,p2=null;
        for(int i=0;i<10;i++){
            team.addPlayer(p=new Player(""+Math.random()*20,""+Math.random()*20,(int)(Math.random()*20)));
        }
        league.addTeam(team);
        team2=new Team("squadra 2");
        for(int i=0;i<10;i++){
            team2.addPlayer(p2=new Player(""+Math.random()*20,""+Math.random()*20,(int)(Math.random()*20)));
        }
        league.addTeam(team2);
        Game game=new Game(team,team2,data);
        league.addGame(game);
        for(int i=0;i<Math.random()*20;i++){
          team.goal(p);  
        }
        
        team2.goal(p2);
        int[] vet=game.calcolaPunteggio();
        for(int i:vet)
            System.out.println(i);
        System.out.println(game.getTeamA().getNome()+" goal "+game.getTeamA().numeroTotGoal());
        System.out.println(game.getTeamB().getNome()+" goal "+game.getTeamB().numeroTotGoal());
        System.out.println("Team vincente: "+game.teamVincente()==null?"Pareggio":game.teamVincente().getNome());
        team.printPlayer();
        
    }
}
