//Please Read ReadMe.txt file
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Main 
{
	ImageIcon iconDog;
	JLabel JlBackgroundImage;
	public static int ballmovespeed=100;
	public static int playerhealth=3;
	public static int playerscore=0;
	public static void main(String[] args) throws IOException 
	{
		
		JFrame jf = new JFrame();
		jf.setTitle("TermProject of Ferhat Ali Toku�");// Ba�l�k
		jf.setSize(1200,800);// panel boyutu
		jf.setLocation(100,200);
		//https://www.tutorialspoint.com/swing/swing_borderlayout.htm
		JPanel panel=new JPanelWithBackground("doge.png");
		panel.setLayout(null);
		panel.setVisible(true);
		//https://www.geeksforgeeks.org/java-awt-borderlayout-class/
		JButton button1 = new JButton("New Game");

		button1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
		        ImageIcon alllevels= new ImageIcon("Logoallinone.png");
		       // https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html#button
		        Object[] possibilities = {" Level 1 Easy, OOP is so hard, pls help me", " Level 2 Normal, I need to pass", " Level 3 Hard !Give me some oop project"};
		        JFrame frame=new JFrame();
				String s = (String)JOptionPane.showInputDialog(frame,"Choose Difficulty", "Choose Difficulty",JOptionPane.PLAIN_MESSAGE,alllevels,possibilities,"Please make a choice !");
				Main.playerhealth=3;
				Main.playerscore=0;
				if(s.equals(" Level 1 Easy, OOP is so hard, pls help me")) 
				{
					try{
							String audioFilePath = "[ONTIVA.COM]MagicGameStartSoundEffect-HQ.wav";
					        AudioPlayerExample1 player = new AudioPlayerExample1();
					        player.play(audioFilePath);	
							Levelcreator.createEasyLevel();
						}catch (IOException e1){
							e1.printStackTrace();
						}
				}
				
				if(s.equals(" Level 2 Normal, I need to pass")) 
				{
					try {
							String audioFilePath = "[ONTIVA.COM]MagicGameStartSoundEffect-HQ.wav";
					        AudioPlayerExample1 player = new AudioPlayerExample1();
					        player.play(audioFilePath);	
							Levelcreator.createMediumLevel();
					}catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				
				if(s.equals(" Level 3 Hard !Give me some oop project")) 
				{
					try {
							String audioFilePath = "[ONTIVA.COM]MagicGameStartSoundEffect-HQ.wav";
					        AudioPlayerExample1 player = new AudioPlayerExample1();
					        player.play(audioFilePath);	
							Levelcreator.createHardLevel();
					}
					catch (IOException e1) {
						e1.printStackTrace();
					}
				}
		      
			
			}
		});
		
		JButton button2 = new JButton("Options");
		button2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String getmovespeed=JOptionPane.showInputDialog(null," Please enter the  base ball latency speed : ( recomended 150) ,Level 1 1x speed, Level 2 2x speed,Level 3 3x speed","Please enter the ball latency speed",JOptionPane.PLAIN_MESSAGE);
				ballmovespeed=Integer.parseInt(getmovespeed);
				//String audioFilePath = "'Oops' SOUND EFFECT.wav";
		       // AudioPlayerExample1 player = new AudioPlayerExample1();
		       // player.play(audioFilePath);	
				// JOptionPane.showMessageDialog(null,"Oh no ! Master tacha moved all settings to  New Games !","Options",JOptionPane.WARNING_MESSAGE);
			}
		});
		
		JButton button3 = new JButton("High Scores");//Display highest 10 score
		button3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				String audioFilePath = "Sound Effect - Pes Dogrusu (Khontkar).wav";
		        AudioPlayerExample1 player = new AudioPlayerExample1();
		        player.play(audioFilePath);	
		       // JOptionPane.showMessageDialog(null,"All participants defated by Master Tacha so we have not any scores :/ ","High Scores",JOptionPane.WARNING_MESSAGE);

		        String HighScoreDisplay="Name    Score     Date      T�me \n";
		        try {
					HighScoreDisplay= ReadHighScore.HighScoreListInOneLine(HighScoreDisplay);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        JOptionPane.showMessageDialog(null,HighScoreDisplay,"High Scores",JOptionPane.WARNING_MESSAGE);
		        
		        
		        
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		JButton button4 = new JButton("Help");// 1 ses
		button4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String audioFilePath = "[ONTIVA.COM] Help Me! Sound Effect-HQ.wav";
		        AudioPlayerExample1 player = new AudioPlayerExample1();
		        player.play(audioFilePath);	
		        JOptionPane.showMessageDialog(null,"Bottom bar Left direction :left arrow   \n Bottom bar right direction :right arrow \n Level one brick(red) is 10 points \n Level two brick(oronge) is 30 points \n Level three brick(black) is 50 points\n Last thing God bless you!");
			}
		});

		JButton button5 = new JButton("About"); 	
		button5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				ImageIcon ferhatalitokucicon = new ImageIcon("ferhatalitokucsmall.jpg");
				String audioFilePath = "[ONTIVA.COM] Rick and Morty_ Wubalubadubdub Ringtone-HQ.wav";
		        AudioPlayerExample1 player = new AudioPlayerExample1();
		        player.play(audioFilePath);	
		        JOptionPane.showMessageDialog(new MessageDialogInFrame(),"Game Creator : Ferhat Ali Tokuc \n Yeditepe University Number:20180702071 \n E mail :tokucferhatali@gmail.com \n Special thanks to the Tacha Serif and Gulsah Gokhan Gokcek", "The Game Creator", JOptionPane.INFORMATION_MESSAGE, ferhatalitokucicon); 
			}
		});
		JButton button6 = new JButton("Story"); 
		button6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String audioFilePath = "Sound Effect - Dog Bark.wav";
		        AudioPlayerExample1 player = new AudioPlayerExample1();
		        player.play(audioFilePath);
				ImageIcon MasterTacha = new ImageIcon("MasterTacha.jpg");
				JOptionPane.showMessageDialog(null,"In one of the old times, there was a student . This student was taking CSE 212 from Master Tacha.\r\n"
						+ "One day, next to Master Tacha, he said, \"Why do we use so many functions in this java lesson?\"\r\n"
						+ "Because this sentence contained two forbidden words together, Master Tacha confiscated the student's dog with the power he received from OOP.\r\n"
						+ "The only way for the student to get his dog is to prove himself to the teacher by making more than 212 points in the game \"Ferhat's Arkanoid\".\r\n"
						+ "It's the only way to get to dog.\r\n"
						+ "You don't cheat! If you're wondering about Master Tacha, an old photo of him is on the FBI base. Just press OK to see it.",null, JOptionPane.PLAIN_MESSAGE);
				String audioFilePath1 = "NANI! - Sound Effect (HD).wav";
		        AudioPlayerExample1 player1 = new AudioPlayerExample1();
		        player1.play(audioFilePath1);
				JOptionPane.showMessageDialog(null,MasterTacha,null, JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		JButton button7 = new JButton("Exit");
		button7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String audioFilePath = "MicrosoftWindowsXPShutdown-Sound Effect(HD).wav";
		        AudioPlayerExample1 player = new AudioPlayerExample1();
		        player.play(audioFilePath);
		        System.exit(0);
			}
		});
		
		button1.setBounds(150,50,150,50);//325,50,150,50
		button2.setBounds(150,150,150,50);
		button3.setBounds(150,250,150,50);
		button4.setBounds(150,350,150,50);
		button5.setBounds(150,450,150,50);
		button6.setBounds(150,550,150,50);
		button7.setBounds(150,650,150,50);
		panel.add(button1);// -New Game
		panel.add(button2);// -Options
		panel.add(button3);// -Scores
		panel.add(button4);// -Help
		panel.add(button5);// -About
		panel.add(button6);// -Story
		panel.add(button7);// -Exit
		jf.add(panel);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setResizable(false);
		jf.setVisible(true);
	}
}