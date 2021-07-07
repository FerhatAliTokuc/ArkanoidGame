import java.awt.event.KeyEvent;

public interface LevelDesign {
	 public void moveBox(int newX,int newY);
	public void keyPressed(KeyEvent event) ;
	public void changeLayoutLeft();
	public void changeLayoutRight();
	public void keyReleased(KeyEvent arg0);
	
	public void keyTyped(KeyEvent arg0);
	
		
	
}
