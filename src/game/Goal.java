package game;
import java.util.Date;
import java.util.GregorianCalendar;


public class Goal {
    private Date data;
    
    public Goal(){
        Date tmp=new Date();
        data=new Date(tmp.getYear(),tmp.getMonth(),tmp.getDay());
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
