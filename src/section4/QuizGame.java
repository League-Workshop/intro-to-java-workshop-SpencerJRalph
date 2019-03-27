package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		String hi=JOptionPane.showInputDialog("WHAT IS THE BEST THING ON EARTH(LUCAS YOU SHOULD KNOW THIS");

		// 3.  Use an if statement to check if their answer is correct
		if(hi.equals("WII")) {
		// 4.  if the user's answer is correct
		JOptionPane.showMessageDialog(null, "YOU ARE CORRECT");
		// -- add one to their score 
		score++;}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String ur=JOptionPane.showInputDialog("DO YOU LIKE PIE");
		if(ur.equals("IS")) {
			JOptionPane.showMessageDialog(null, "YOU ARE WRONG(JK)");
			score++;}
		String I=JOptionPane.showInputDialog("MY FAVORITE SAYING");
		if(I.equals("AMAZING")) {
			JOptionPane.showMessageDialog(null, "YOU ARE A STALKER IF YOU KNOW ALL THIS ABOUT ME");
			score++;}
		
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "You scored "+score);
	}
}
