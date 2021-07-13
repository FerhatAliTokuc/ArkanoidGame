//Main menu using this code part for reads Hıgh Scores 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadHighScore {
    public static void main(String[] args) throws IOException {
  }
    public static String HighScoreListInOneLine(String returntext) throws FileNotFoundException {
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
        String HighScoreListInOneLinetemp="";
        String[] tempsArray = temps.toArray(new String[0]);
        
        for (String s : tempsArray) {
          System.out.println(s);
          HighScoreListInOneLinetemp=HighScoreListInOneLinetemp+s+"\n";
        }
        returntext=returntext+HighScoreListInOneLinetemp;
    	return returntext;
    }
}