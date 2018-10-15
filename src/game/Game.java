/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.Date;
import java.util.GregorianCalendar;
import javafx.scene.chart.PieChart.Data;

/**
 *
 * @author pasqu
 */
public class Game {
    private Team teamA, teamB;
    public Date dataPartita;
    

    public Game(Team teamA, Team teamB, Date dataPartita) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.dataPartita = dataPartita;
    }

    public Team getTeamA() {
        return teamA;
    }

    public void setTeamA(Team teamA) {
        this.teamA = teamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    public void setTeamB(Team teamB) {
        this.teamB = teamB;
    }

    public Date getDataPartita() {
        return dataPartita;
    }

    public void setDataPartita(Date dataPartita) {
        this.dataPartita = dataPartita;
    }
    
    public int esito(){
        int goalA, goalB;
        int esito;
        goalA=teamA.numeroTotGoal(dataPartita);
        goalB=teamB.numeroTotGoal(dataPartita);
        if(goalA>goalB){
            esito=1;
        }else if(goalA==goalB){
            esito=0;
        }else
            esito=-1;
        return esito;
    }
    
    public int[] calcolaPunteggio(){
        int es=esito();
        int[] punteggio=new int[2];
        if(es==1){
            punteggio[0]+=3;
        }else if(es==0){
            punteggio[0]+=1;
            punteggio[1]+=1;
        }else
            punteggio[1]+=3;
        return punteggio;
    }
    public Team teamVincente(){
        int es=esito();
         if(es==1){
            return teamA;
        }else if(es==0){
            return null;
        }else
            return teamB;
    }
     //_________________________COMBINAZIONI SQUADRE_______________
    public static String[][] combina(String[] teams){
        String[][] giornate=new String[(teams.length-1)*2][(teams.length/2)+(teams.length%2)];
        for(int i=0;i<teams.length-1;i++){
            String selezionato=teams[i];
            for(int j=i+1;j<=(teams.length/2)+(teams.length%2);j++){
                if(j%2>0){
                    giornate[i][j-1]=selezionato.concat("-"+teams[j]);
                }else
                    giornate[i][j-1]=teams[j].concat("-"+selezionato);
            }
        }
        return giornate;
    }
    
}
