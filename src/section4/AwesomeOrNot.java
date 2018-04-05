package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int number = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(number);
	// 4. Get the user to enter something that they think is awesome
String input = JOptionPane.showInputDialog("What is something awesome?");
	// 5. If the random number is 0
if (number == 0) {
	JOptionPane.showMessageDialog(null, "You entered something awesome!");
}
	

	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
if (number == 1) {
	JOptionPane.showMessageDialog(null, "You entered something ok");
	// -- tell the user whatever they entered is ok.
}
	// 7. If the random number is 2
	if (number == 2) {
		JOptionPane.showMessageDialog(null, "You entered something boring");
	}// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
		if (number == 3) {
			JOptionPane.showMessageDialog(null, "YOU ENTERED SOMETHING SUPER SUPER SUPER SUPER SUPER DUMB!!!!!!");
		}// -- write your own answer

}
	}

