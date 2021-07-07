import java.util.Comparator;

public class ComperatorHighScore implements Comparator<Playerinfo> { // COLLECTIONS PART 2 SLIDES ON COADSYSEXAM

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
