package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {
		
		int score = 0;
		// 2.  Ask the user a question 
String input	 = JOptionPane.showInputDialog("what is 5 x 17?");
		// 3.  Use an if statement to check if their answer is correct
		if(input.equals("85")){
score = score + 1;
		}
		JOptionPane.showMessageDialog(null,"your score is " + score);
input = JOptionPane.showInputDialog("what is java?");
	// 3.  Use an if statement to check if their answer is correct
	if(input.equals("a type of coding")){
score = score + 1;}
JOptionPane.showMessageDialog(null,"your score is " + score);
input = JOptionPane.showInputDialog("what is python?");
// 3.  Use an if statement to check if their answer is correct
if(input.equals("a type of coding")){
score = score + 1;}
JOptionPane.showMessageDialog(null,"your score is " + score);
JOptionPane.showMessageDialog(null, "GAME OVER");
	}
}
