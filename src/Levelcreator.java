import java.io.IOException;


public class Levelcreator {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	}

	public static void  createEasyLevel () throws IOException {
		EasyLevel myMoveBoxWithAbsolutePositioning=new EasyLevel();
		myMoveBoxWithAbsolutePositioning.createGUI();
	}
	public static void  createMediumLevel () throws IOException {
		MediumLevel myMoveBoxWithAbsolutePositioning=new MediumLevel();
		myMoveBoxWithAbsolutePositioning.createGUI();
	}
	public static void  createHardLevel () throws IOException {
		HardLevel myMoveBoxWithAbsolutePositioning=new HardLevel();
		myMoveBoxWithAbsolutePositioning.createGUI();
	}
	
}