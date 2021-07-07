//This java file for sort score list(Special Comperator). 
import java.util.Comparator;
public class ComperatorHighScore implements Comparator<Playerinfo> { // COLLECTIONS PART 2 SLIDES ON COADSYSEXAM
	//Playerinfo =User Score
	@Override
	public int compare(Playerinfo p1, Playerinfo p2) {
		if(p1.Score>p2.Score) {
			return -1;
		}
		else if(p1.Score<p2.Score) {
			return 1;
		}
		
		return 0;
		
	}

}
