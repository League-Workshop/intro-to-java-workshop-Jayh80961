package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String name = JOptionPane.showInputDialog("Do you know how to code? Please write yes or no in lower case");
		// 2. If they say "yes", tell them they will rule the world.
		if(name.equals("yes")) {
			JOptionPane.showMessageDialog(null, "You will rule the world");
		}
		// 3. Otherwise, wish them good luck washing dishes.
		else if(name.contentEquals("no")){ 
			JOptionPane.showMessageDialog(null, "I wish you good luck washing dishes");
		}
	}
}

