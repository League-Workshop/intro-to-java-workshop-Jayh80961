package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String input = JOptionPane.showInputDialog("How is the weather today? Please answer in bad or good");
		// 3.  Use an if statement to check if their answer is correct
		if(input.equalsIgnoreCase("bad")) {
			// JOp.SMD
		// 4.  if the user's answer was correct, add one to their score 
		}else if(input.equalsIgnoreCase("good")) {
			score ++;
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String input2 = JOptionPane.showInputDialog("Is computer better or a ipad better?");
		
		if(input2.equalsIgnoreCase("computer")) { 
			score ++;
			// JOp.SMD
		}else if(input2.equalsIgnoreCase("ipad")) { 
			
		}
		String input3 = JOptionPane.showInputDialog("Which one do you prefer, minecraft or roblox");

		if(input3.equalsIgnoreCase("minecraft")) {
			// JOp.SMD
			score ++;
		
		}else if(input3.equalsIgnoreCase("roblox")) {
			score ++;
		}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null,"Wow your score is " + score + "!!! Impressive.....");
	}
}

