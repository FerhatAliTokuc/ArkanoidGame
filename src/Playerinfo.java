//Store user score for HıghScore
import java.time.LocalDate;
import java.time.LocalTime;
public class Playerinfo {
	 public String Name;
	    public int Score;
	    public LocalDate locDate;
	    public LocalTime locTime;

	    public Playerinfo(String userName,int score,  LocalDate locDate, LocalTime locTime) {
	        this.Name = userName;
	        this.Score = score;
	        this.locDate = locDate;
	        this.locTime = locTime;
	       // System.out.println("SCORE"+score+userName+userName+locDate+locTime);
	        
	    }

		
}

