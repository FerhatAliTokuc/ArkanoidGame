import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
// Take keyboard order logic from Lab 9 CSE 212 Examples
public class MediumLevel implements KeyListener,LevelDesign // Tester class 
// ADD ON : H�GH SCORE PART
//ADD ON : BALL PART
//setResizable(false); part

{
	 
	  
	  
	  int hardlevelflag=0;
	  int mediumlevelflag=1;
	  int easylevelflag=0;
	  private JFrame frame;
	  private JPanel panel;
	  private Icon actor;
	  Icon actor3=new ImageIcon(getClass().getResource("redbrick.png")); // TOP LEVEL  BRICK ICON
	  Icon actor2=new ImageIcon(getClass().getResource("orongebrick.png"));//MID LEVEL  BRICK ICON
	  Icon actor1=new ImageIcon(getClass().getResource("redbrick.png"));// BOTTOM LEVEL BRICK ICON
	  Icon ballicon=new ImageIcon(getClass().getResource("ballheadv1.png"));// BOTTOM LEVEL BRICK ICON
	  private JLabel label1;
	  private int xActor=375;
	  //900-150=750 -- 750/2 =375
	  private int yActor=750;
	  //900-150=750 -- 750/2 =375
	  // TOP
	  int ballx=500;
	  int bally=400;
	  //TOP
	  public void createGUI() throws IOException
	  {
		  frame = new JFrame("Level 2");  
		  frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		  panel = new JPanelWithBackground("MediumLevelBackgorund.jpg");
		  panel.setLayout(null);
		  /////////////////////// TOP INFORMATION
		  JLabel labelleveltext = new JLabel("Level 2");
		  labelleveltext.setFont(new Font("Serif", Font.PLAIN, 40));
		  labelleveltext.setForeground(Color.WHITE);
		  labelleveltext.setBounds(450,-50,200,200);
		  panel.add(labelleveltext);
		  actor=new ImageIcon(getClass().getResource("crushbar2.png"));
		  label1 = new JLabel(actor);  
		  label1.setBounds(xActor, yActor, 150, 30); //crushbar
		  panel.add(label1);
		  
		  JLabel userscoretext = new JLabel("Score "+Integer.toString(Main.playerscore));
		  userscoretext.setFont(new Font("Serif", Font.PLAIN, 40));
		  userscoretext.setForeground(Color.WHITE);
		  userscoretext.setBounds(50,-50,200,200);
		  panel.add(userscoretext);
		  
		  JLabel userlifetext = new JLabel("Lives "+Integer.toString(Main.playerhealth));
		  userlifetext.setFont(new Font("Serif", Font.PLAIN, 40));
		  userlifetext.setForeground(Color.WHITE);
		  userlifetext.setBounds(850,-50,200,200);
		  panel.add(userlifetext);
		  
		  /////////////////////// TOP INFORMATION
		  
		  
		  //Brick
		  //9 brick each line-total 3 line
		  JLabel ball = new JLabel(ballicon);// BALL
		  
		  ball.setBounds(ballx, bally, 50, 50);
		  panel.add(ball);
		  // TOP LEVEL BRICK
		  JLabel label30 = new JLabel(actor3);
		  JLabel label31 = new JLabel(actor3);
		  JLabel label32 = new JLabel(actor3);
		  JLabel label33 = new JLabel(actor3);
		  JLabel label34 = new JLabel(actor3);
		  JLabel label35 = new JLabel(actor3);
		  JLabel label36 = new JLabel(actor3);
		  JLabel label37 = new JLabel(actor3);
		  JLabel label38 = new JLabel(actor3);
		  label30.setBounds(100, 100, 75, 50);
		  label31.setBounds(200, 100, 75, 50);
		  label32.setBounds(300, 100, 75, 50);
		  label33.setBounds(400, 100, 75, 50);
		  label34.setBounds(500, 100, 75, 50);
		  label35.setBounds(600, 100, 75, 50);
		  label36.setBounds(700, 100, 75, 50);
		  label37.setBounds(800, 100, 75, 50);
		  label38.setBounds(900, 100, 75, 50);
		  panel.add(label30);
		  panel.add(label31);
		  panel.add(label32);
		  panel.add(label33);
		  panel.add(label34);
		  panel.add(label35);
		  panel.add(label36);
		  panel.add(label37);
		  panel.add(label38);
		 // MID LEVEL BRICK
		  JLabel label20 = new JLabel(actor2);
		  JLabel label21 = new JLabel(actor2);
		  JLabel label22 = new JLabel(actor2);
		  JLabel label23 = new JLabel(actor2);
		  JLabel label24 = new JLabel(actor2);
		  JLabel label25 = new JLabel(actor2);
		  JLabel label26 = new JLabel(actor2);
		  JLabel label27 = new JLabel(actor2);
		  JLabel label28 = new JLabel(actor2);
		  label20.setBounds(100, 200, 75, 50);
		  label21.setBounds(200, 200, 75, 50);
		  label22.setBounds(300, 200, 75, 50);
		  label23.setBounds(400, 200, 75, 50);
		  label24.setBounds(500, 200, 75, 50);
		  label25.setBounds(600, 200, 75, 50);
		  label26.setBounds(700, 200, 75, 50);
		  label27.setBounds(800, 200, 75, 50);
		  label28.setBounds(900, 200, 75, 50);
		  panel.add(label20);
		  panel.add(label21);
		  panel.add(label22);
		  panel.add(label23);
		  panel.add(label24);
		  panel.add(label25);
		  panel.add(label26);
		  panel.add(label27);
		  panel.add(label28);
		  //BOTTOM LEVEL BRICK
		  JLabel label10 = new JLabel(actor1);
		  JLabel label11 = new JLabel(actor1);
		  JLabel label12 = new JLabel(actor1);
		  JLabel label13 = new JLabel(actor1);
		  JLabel label14 = new JLabel(actor1);
		  JLabel label15 = new JLabel(actor1);
		  JLabel label16 = new JLabel(actor1);
		  JLabel label17 = new JLabel(actor1);
		  JLabel label18 = new JLabel(actor1);
		  label10.setBounds(100, 300, 75, 50);
		  label11.setBounds(200, 300, 75, 50);
		  label12.setBounds(300, 300, 75, 50);
		  label13.setBounds(400, 300, 75, 50);
		  label14.setBounds(500, 300, 75, 50);
		  label15.setBounds(600, 300, 75, 50);
		  label16.setBounds(700, 300, 75, 50);
		  label17.setBounds(800, 300, 75, 50);
		  label18.setBounds(900, 300, 75, 50);
		  panel.add(label10);
		  panel.add(label11);
		  panel.add(label12);
		  panel.add(label13);
		  panel.add(label14);
		  panel.add(label15);
		  panel.add(label16);
		  panel.add(label17);
		  panel.add(label18);

		  frame.add(panel);
		  frame.setSize(1075,830);// x 950 y 850
		  //http://www.cpcwiki.eu/forum/games/arkanoid/
		  // Forum says 192*256 but � increase resulation 
		  frame.addKeyListener(this);
		  frame.setVisible(true);
		  frame.setResizable(false);
		  
		  
		  
		  //THREAD PART
	
		  int delay = Main.ballmovespeed/2;
		  //https://stackoverflow.com/questions/33333225/how-to-check-two-rectangles-are-touching-from-left-or-top-or-right
		  //https://stackoverflow.com/questions/13226164/how-to-move-jlabel-every-second
		  ActionListener taskPerformer = new ActionListener() {
			  int xhiz=10;
			  int yhiz=10;
			  int flag=1;
			  int bricklife20=2;
			  int bricklife21=2;
			  int bricklife22=2;
			  int bricklife23=2;
			  int bricklife24=2;
			  int bricklife25=2;
			  int bricklife26=2;
			  int bricklife27=2;
			  int bricklife28=2;
			  int bricklife30=1;
			  int bricklife31=1;
			  int bricklife32=1;
			  int bricklife33=1;
			  int bricklife34=1;
			  int bricklife35=1;
			  int bricklife36=1;
			  int bricklife37=1;
			  int bricklife38=1;
			  int brokenbrickmediumlevel=0;
			  int flaglevelcompletemedium=1;
			  synchronized  public void actionPerformed(ActionEvent evt) {
		    	
		    	  // 1075 /830 window size
		    	  if(ballx>1035) {//x up limit
		    		  xhiz=-xhiz;
		    	  }
		    	  if(ballx<10) {//x down limit
		    		  xhiz=-xhiz;
		    	  }
		    	  // x normal y reverse !
		    	  if(bally>820) {//y up limit // life checker
		    		  yhiz=-yhiz;
		    		  if(mediumlevelflag==1) {
		    			  Main.playerhealth=Main.playerhealth-1;
		    		  }
		    		  userlifetext.setBounds(850,-50,200,200);
		    		  userlifetext.setText("Lives "+Integer.toString(Main.playerhealth));
		    		  ballx=500;
		    		  bally=400;
		    		  
		    		  if(Main.playerhealth<1&&flag==1) {
		    			  flag=0;
		    			  frame.setVisible(false);
		    			  AddUserInfo.adduserinfo(Main.playerscore);
		    			  
		    		  }
		    	  }
		    	  if(bally<10) {//y down limit
		    		  yhiz=-yhiz;
		    	  }
		    	  /////////////////////// 1 hit bricks
		    	  if (ball.getBounds().intersects(label38.getBounds())) {
		    		  	xhiz=-xhiz;
		    		  	yhiz=-yhiz;
	    	        	bricklife38=bricklife38-1;
	    	        	if(bricklife38<1) {
	    	        		Main.playerscore+=10;
	    	        		label38.setBounds(0,0,0,0);
	    	        		frame.remove(label38);
	    	        		brokenbrickmediumlevel++;
	    	        		
	    	        	}
		    	  }
		    	  if (ball.getBounds().intersects(label37.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	bricklife37=bricklife37-1;
	    	        	if(bricklife37<1) {
	    	        		Main.playerscore+=10;
	    	        		label37.setBounds(0,0,0,0);
	    	        		frame.remove(label37);
	    	        		brokenbrickmediumlevel++;
	    	        	}
		    	  }
		    	  if (ball.getBounds().intersects(label36.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	bricklife36=bricklife36-1;
	    	        	if(bricklife36<1) {
	    	        		Main.playerscore+=10;
	    	        		label36.setBounds(0,0,0,0);
	    	        		frame.remove(label36);
	    	        		brokenbrickmediumlevel++;
	    	        	}
		    	  }
		    	  if (ball.getBounds().intersects(label35.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	bricklife35=bricklife35-1;
	    	        	if(bricklife35<1) {
	    	        		Main.playerscore+=10;
	    	        		label35.setBounds(0,0,0,0);
	    	        		frame.remove(label35);
	    	        		brokenbrickmediumlevel++;
	    	        	}
		    	  }
		    	  if (ball.getBounds().intersects(label34.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	bricklife34=bricklife34-1;
	    	        	if(bricklife34<1) {
	    	        		Main.playerscore+=10;
	    	        		label34.setBounds(0,0,0,0);
	    	        		frame.remove(label34);
	    	        		brokenbrickmediumlevel++;
	    	        	}
		    	  }
		    	  if (ball.getBounds().intersects(label33.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	bricklife33=bricklife33-1;
	    	        	if(bricklife33<1) {
	    	        		Main.playerscore+=10;
	    	        		label33.setBounds(0,0,0,0);
	    	        		frame.remove(label33);
	    	        		brokenbrickmediumlevel++;
	    	        	}
		    	  }
		    	  if (ball.getBounds().intersects(label32.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	bricklife32=bricklife32-1;
	    	        	if(bricklife32<1) {
	    	        		Main.playerscore+=10;
	    	        		label32.setBounds(0,0,0,0);
	    	        		frame.remove(label32);
	    	        		brokenbrickmediumlevel++;
	    	        	}
		    	  }
		    	  if (ball.getBounds().intersects(label31.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	bricklife31=bricklife31-1;
	    	        	if(bricklife31<1) {
	    	        		Main.playerscore+=10;
	    	        		label31.setBounds(0,0,0,0);
	    	        		frame.remove(label31);
	    	        		brokenbrickmediumlevel++;
	    	        	}
		    	  }
		    	  if (ball.getBounds().intersects(label30.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	bricklife30=bricklife30-1;
	    	        	if(bricklife30<1) {
	    	        		Main.playerscore+=10;
	    	        		label30.setBounds(0,0,0,0);
	    	        		frame.remove(label30);
	    	        		brokenbrickmediumlevel++;
	    	        	}
		    	  }
		    	  
		    	  /////////////////////// 2 hit bricks
		    	  if (ball.getBounds().intersects(label28.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	bricklife28=bricklife28-1;
	    	        	if(bricklife28<1) {
	    	        		Main.playerscore+=30;
	    	        		label28.setBounds(0,0,0,0);
	    	        		frame.remove(label28);
	    	        		brokenbrickmediumlevel++;
	    	        	}
		    	  }
		    	  if (ball.getBounds().intersects(label27.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	bricklife27=bricklife27-1;
	    	        	if(bricklife27<1) {
	    	        		label27.setBounds(0,0,0,0);
	    	        		frame.remove(label27);
	    	        		Main.playerscore+=30;
	    	        		brokenbrickmediumlevel++;
	    	        	}
		    	  }
		    	  if (ball.getBounds().intersects(label26.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	bricklife26=bricklife26-1;
	    	        	if(bricklife26<1) {
	    	        		label26.setBounds(0,0,0,0);
	    	        		frame.remove(label26);
	    	        		Main.playerscore+=30;
	    	        		brokenbrickmediumlevel++;
	    	        	}
		    	  }
		    	  if (ball.getBounds().intersects(label25.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	bricklife25=bricklife25-1;
	    	        	if(bricklife25<1) {
	    	        		label25.setBounds(0,0,0,0);
	    	        		frame.remove(label25);
	    	        		Main.playerscore+=30;
	    	        		brokenbrickmediumlevel++;
	    	        	}
		    	  }
		    	  if (ball.getBounds().intersects(label24.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	bricklife24=bricklife24-1;
	    	        	if(bricklife24<1) {
	    	        		label24.setBounds(0,0,0,0);
	    	        		frame.remove(label24);
	    	        		Main.playerscore+=30;
	    	        		brokenbrickmediumlevel++;
	    	        	}
		    	  }
		    	  if (ball.getBounds().intersects(label23.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	bricklife23=bricklife23-1;
	    	        	if(bricklife23<1) {
	    	        		label23.setBounds(0,0,0,0);
	    	        		frame.remove(label23);
	    	        		Main.playerscore+=30;
	    	        		brokenbrickmediumlevel++;
	    	        	}
		    	  }
		    	  if (ball.getBounds().intersects(label22.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	bricklife22=bricklife22-1;
	    	        	if(bricklife22<1) {
	    	        		label22.setBounds(0,0,0,0);
	    	        		frame.remove(label22);
	    	        		Main.playerscore+=30;
	    	        		brokenbrickmediumlevel++;
	    	        	}
		    	  }
		    	  if (ball.getBounds().intersects(label21.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	bricklife21=bricklife21-1;
	    	        	if(bricklife21<1) {
	    	        		label21.setBounds(0,0,0,0);
	    	        		frame.remove(label21);
	    	        		Main.playerscore+=30;
	    	        		brokenbrickmediumlevel++;
	    	        	}
		    	  }
		    	  if (ball.getBounds().intersects(label20.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	bricklife20=bricklife20-1;
	    	        	if(bricklife20<1) {
	    	        		label20.setBounds(0,0,0,0);
	    	        		frame.remove(label20);
	    	        		Main.playerscore+=30;
	    	        		brokenbrickmediumlevel++;
	    	        	}
		    	  }
		    	  /////////////////////////////////  1 hit bricks
		    	  if (ball.getBounds().intersects(label18.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	label18.setBounds(0,0,0,0);
	    	        	frame.remove(label18);
	    	        	Main.playerscore+=10;
	    	        	brokenbrickmediumlevel++;
		    	    }
		    	  if (ball.getBounds().intersects(label17.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	label17.setBounds(0,0,0,0);
	    	        	frame.remove(label17);
	    	        	Main.playerscore+=10;
	    	        	brokenbrickmediumlevel++;
		    	    }
		    	  if (ball.getBounds().intersects(label16.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	//panel.remove(label16);
	    	        	label16.setBounds(0,0,0,0);
	    	        	frame.remove(label16);
	    	        	Main.playerscore+=10;
	    	        	brokenbrickmediumlevel++;
		    	    }
		    	  if (ball.getBounds().intersects(label15.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	//panel.remove(label15);
	    	        	label15.setBounds(0,0,0,0);
	    	        	frame.remove(label15);
	    	        	Main.playerscore+=10;
	    	        	brokenbrickmediumlevel++;
		    	    }
		    	  if (ball.getBounds().intersects(label14.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	//panel.remove(label14);
	    	        	label14.setBounds(0,0,0,0);
	    	        	frame.remove(label14);
	    	        	Main.playerscore+=10;
	    	        	brokenbrickmediumlevel++;
		    	    }
		    	  if (ball.getBounds().intersects(label13.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	//panel.remove(label13);
	    	        	label13.setBounds(0,0,0,0);
	    	        	frame.remove(label13);
	    	        	Main.playerscore+=10;
	    	        	brokenbrickmediumlevel++;
		    	    }
		    	  if (ball.getBounds().intersects(label12.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	//panel.remove(label12);
	    	        	label12.setBounds(0,0,0,0);
	    	        	frame.remove(label12);
	    	        	Main.playerscore+=10;
	    	        	brokenbrickmediumlevel++;
		    	    }
		    	  if (ball.getBounds().intersects(label11.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	//panel.remove(label11);
	    	        	label11.setBounds(0,0,0,0);
	    	        	frame.remove(label11);
	    	        	Main.playerscore+=10;
	    	        	brokenbrickmediumlevel++;
		    	    }
		    	  if (ball.getBounds().intersects(label10.getBounds())) {
						xhiz=-xhiz;
						yhiz=-yhiz;
	    	        	//panel.remove(label10);
	    	        	label10.setBounds(0,0,0,0);
	    	        	frame.remove(label10);
	    	        	Main.playerscore+=10;
	    	        	brokenbrickmediumlevel++;
		    	    }
		    	  if (ball.getBounds().intersects(label1.getBounds())) {// crushbar
		    		  if(xhiz>30) {
		    		  		xhiz=30;
		    		  	}
		    		  	xhiz=(int) (xhiz*1.1);
	    	        	yhiz=(int) (-yhiz*1);
	    	        	
	    	        }
		    	  if(brokenbrickmediumlevel==27) {
		    		  
		    		  if(flaglevelcompletemedium==1) {
		    			  mediumlevelflag=0;
		    			  flag=0;
		    			  flaglevelcompletemedium=0;
		    			  frame.setVisible(false);
		    				try {
								Levelcreator.createHardLevel();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		    			
		    			  
		    		  }
		    		  
		    		  
		    	  }
		    	/// test son
		         	 ballx=ballx+xhiz;
		         	 bally=bally+yhiz;
		         	 ball.setLocation(ballx,bally);
		         	 userscoretext.setBounds(50,-50,200,200);
		         	 userscoretext.setText("Score "+Integer.toString(Main.playerscore));
		            //System.out.println(SwingUtilities.isEventDispatchThread());
		    
		      }
		  };
		  new Timer(delay, taskPerformer).start();
		  
		  //THREAD PART
		 
	  }
	  public void moveBox(int newX,int newY)
	  {
		  label1.setBounds(newX, newY, 150, 30); 
		  // 600-50=550/2=225
	  }
	  
	@Override
	public void keyPressed(KeyEvent event) 
	{
		// TODO Auto-generated method stub
		String whichKey=KeyEvent.getKeyText(event.getKeyCode());
		if(whichKey.compareTo("Left")==0)
		{
			
			changeLayoutLeft();
		}else if(whichKey.compareTo("Right")==0)
		{
			
			changeLayoutRight();
		}
		if ((event.getKeyCode() == KeyEvent.VK_Q) && ((event.getModifiers() & KeyEvent.CTRL_MASK) != 0)) 
		{
			   System.exit(0);
			   // https://stackoverflow.com/questions/19823633/multiple-keys-in-keyevent-listener
        }
		// BUNU KALDIR SONRA SAVEI
		/*if ((event.getKeyCode() == KeyEvent.VK_S) && ((event.getModifiers() & KeyEvent.CTRL_MASK) != 0)) 
		{
			AddUserInfo.adduserinfo(userscore);
        }*/

	}
	
	public void changeLayoutLeft()
	{
		xActor=xActor-=100;
		if(xActor<0) 
		{
			xActor=0;
		}
		moveBox(xActor,yActor);
		
		
	}
	
	public void changeLayoutRight()
	{
		xActor=xActor+=100;
		if(xActor>(1075-180)) 
		{
			xActor=910;
		}
		moveBox(xActor,yActor);
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) 
	{
	
	}
	
	@Override
	public void keyTyped(KeyEvent arg0) 
	{

	}
	
	
}