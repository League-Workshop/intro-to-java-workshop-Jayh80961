package section3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		
	
	System.out.println("Jay");
	String name = JOptionPane.showInputDialog("what is your name?");
	JOptionPane.showMessageDialog(null, "your name is " + name);
	System.out.println(name + " will be the best coder");
	}
}



