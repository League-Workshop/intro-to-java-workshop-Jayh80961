package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	Random random = new Random();
	int randomNumber = random.nextInt(10);
	// 3. Print out this variable
	
	// 4. Get the user to enter something that they think is awesome
	String bob = JOptionPane.showInputDialog("Enter something awsome!!!");
	// 5. If the random number is 0
	JOptionPane.showMessageDialog(null, randomNumber);
	
	if(randomNumber == 0) { 
		JOptionPane.showMessageDialog(null, "The thing that you entered is extremely very very bad.");
	
	}
	else if (randomNumber == 1) { 
		JOptionPane.showMessageDialog(null, "The thing that you entered is extremely very bad.");
	}
	// -- tell the user whatever they entered is awesome!
	else if (randomNumber == 2) { 
		JOptionPane.showMessageDialog(null, "The thing that you entered is extremely bad.");
	}
	// 6. If the random number is 1
	else if (randomNumber == 3) { 
		JOptionPane.showMessageDialog(null, "The thing that you entered is bad.");
	}
	// -- tell the user whatever they entered is ok.
	else if (randomNumber == 4) { 
		JOptionPane.showMessageDialog(null, "The thing that you entered is ok.");
	}
	// 7. If the random number is 2
	else if (randomNumber == 5) { 
		JOptionPane.showMessageDialog(null, "The thing that you entered is good.");
	}
	// -- tell the user whatever they entered is boring.
	else if (randomNumber == 6) { 
		JOptionPane.showMessageDialog(null, "The thing that you entered is extremely good");
	}
	// 8. If the random number is 3
	else if (randomNumber == 7) { 
		JOptionPane.showMessageDialog(null, "The thing that you entered is extremely very good");
	}
	// -- write your own answer
	else if (randomNumber == 8) { 
		JOptionPane.showMessageDialog(null, "The thing that you entered is extremely very very good");
	}
	else if (randomNumber == 9) { 
		JOptionPane.showMessageDialog(null, "The thing that you entered is extremely very very very very very very very op");
	}
	
	}
}


