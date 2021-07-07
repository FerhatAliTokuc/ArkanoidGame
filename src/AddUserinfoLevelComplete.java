import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AddUserinfoLevelComplete {
	public static void adduserinfo(int score) 
	{
		ArrayList<Playerinfo> playerinfo =new ArrayList<Playerinfo>();
		LocalDate scoredate=LocalDate.now();
		LocalTime scoretime=LocalTime.now();
		ImageIcon levelcomplete = new ImageIcon("levelcomplete.jpg");
		JOptionPane.showMessageDialog(new MessageDialogInFrame(),"", "Level Complete!", JOptionPane.INFORMATION_MESSAGE, levelcomplete); 
		String Name=JOptionPane.showInputDialog(null," Level Complete!  Please write your name without space:","Level Complete! Please write your name without space");
		//System.out.println(Name);
		playerinfo.add(new Playerinfo(Name,score,scoredate,scoretime));
		// Logical problem
		 
		try {
            BufferedReader bufferedreader = new BufferedReader(new FileReader("HighScore.txt"));
            String fileread;
            while((fileread = bufferedreader.readLine())!= null) {
                String splitted [] = fileread.split(" ");
                playerinfo.add(new Playerinfo(splitted[0],Integer.parseInt(splitted[1]), LocalDate.parse(splitted[2]), LocalTime.parse(splitted[3])));
            }
            bufferedreader.close();
        }
        catch(Exception e1) {
            JOptionPane.showMessageDialog(null,"File not readable /not found");
        }

        Collections.sort(playerinfo, new ComperatorHighScore());
        try {
            BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter("HighScore.txt"));

            String filewrite= "";
            // 10 kiþi limiti !
            if(playerinfo.size()>10) {
            	for(int i = 0; i < 10; i++) {
                	filewrite = playerinfo.get(i).Name +" "+ Integer.toString(playerinfo.get(i).Score)+" "+ playerinfo.get(i).locDate.toString() +" "+ playerinfo.get(i).locTime.toString()+"\n"; 
                	bufferedwriter.write(filewrite);
                }
            }
            else {
            	for(int i = 0; i < playerinfo.size(); i++) {
                	filewrite = playerinfo.get(i).Name +" "+ Integer.toString(playerinfo.get(i).Score)+" "+ playerinfo.get(i).locDate.toString() +" "+ playerinfo.get(i).locTime.toString()+"\n"; 
                	bufferedwriter.write(filewrite);
                }
            }
            
            bufferedwriter.close();
        }
        catch(Exception e1) {
            JOptionPane.showMessageDialog(null,"File not writeable /not found");
        }
		
		
		
		
	}

}
