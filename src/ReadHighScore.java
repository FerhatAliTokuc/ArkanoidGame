import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadHighScore {
// KULLANIYORUM 23/05/2021 18:34
	// main skoru buradan alýyor
    public static void main(String[] args) throws IOException {
 
    
  }
    public static String HighScoreListInOneLýne(String returntext) throws FileNotFoundException {
    	// it's mixed code  stackoverflow+Ferhat Ali Tokuc :)
    	int tenlinecheck=0;
    	String token1 = "";
        Scanner inFile1 = new Scanner(new File("HighScore.txt")).useDelimiter(",\\s*");
        List<String> temps = new ArrayList<String>();
        while (inFile1.hasNext()) {
          token1 = inFile1.next();
          temps.add(token1);
        } 
        System.out.println("tempsize"+temps.size());
        inFile1.close();
        String HighScoreListInOneLýnetemp="";
        String[] tempsArray = temps.toArray(new String[0]);
        
        for (String s : tempsArray) {
          System.out.println(s);
          HighScoreListInOneLýnetemp=HighScoreListInOneLýnetemp+s+"\n";
        }
        returntext=returntext+HighScoreListInOneLýnetemp;
    	return returntext;
    }
}