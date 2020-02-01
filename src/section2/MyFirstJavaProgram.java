package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		Robot jack = new Robot();
		jack.setSpeed(10);
		jack.penDown();
		jack.move(100);
		jack.turn(90);
		jack.move(100);
		jack.turn(90);
		jack.move(100);
		jack.turn(90);
		jack.move(100);
		
		
		
	}
}
