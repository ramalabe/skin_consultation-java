import javax.print.Doc;
import java.time.LocalDateTime;
import java.util.Date;

public class Consultation extends Doctor {


    public Consultation(Doctor doctor,Date consulationDateandTime, int cost,String notes) {

    }

    private Date ConsulationDateandTime;
    private int cost;
    private String notes;

    public Date getConsulationDateandTime() {
        return ConsulationDateandTime;
    }

    public void setConsulationDateandTime(Date consulationDateandTime) {
        ConsulationDateandTime = consulationDateandTime;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
