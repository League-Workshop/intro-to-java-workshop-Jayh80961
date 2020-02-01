package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot jack = new Robot();

	void go() {
		jack.setSpeed(10);
		jack.penDown();

	
		jack.setPenWidth(5);
		

		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for(int i = 0;i<4;i++) {
			
		
			// 7. Set the pen color to random
			jack.setRandomPenColor();
			// 1 Call drawSquare() method
			drawSquare();
	
			// 8. Turn the robot 90 degrees to the right
			jack.turn(90);
		}

	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
	
		jack.move(100);
		jack.turn(90);
		jack.move(100);
		jack.turn(90);
		jack.move(100);
		jack.turn(90);
		jack.move(100);
		jack.turn(90);
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



