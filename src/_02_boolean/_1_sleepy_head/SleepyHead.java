package _02_boolean._1_sleepy_head;

import java.util.jar.JarOutputStream;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
       String Sirius = JOptionPane.showInputDialog("What day of the week it is?");
		// Set the boolean isWeekend based on the value they enter
	
		
		// If it is the weekend, tell the user they get to sleep in.
		if (Sirius.equalsIgnoreCase("Saturday") || Sirius.equalsIgnoreCase("Sunday")) {
			JOptionPane.showMessageDialog(null, "You get to sleep in, have fun, watch movies, go out, do whatever you want.");
			
		}
		// If it is not the weekend, tell them to get out of bed and go to school!
		else {
			JOptionPane.showMessageDialog(null, "UP! GET UP! NOW!");
		}
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
      String Lupin = JOptionPane.showInputDialog(null, "What percentage did you score in your last exam?");
		
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
    		  int James = Integer.parseInt(Lupin);
     if (James > 70) {
		JOptionPane.showMessageDialog(null, "Congratulations. You passed your exam. You get a amazon gift card!");
	}
      else {
		JOptionPane.showMessageDialog(null, "Sorry but you are going to have to repeat the material!");
	}
	
		
		// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String Dumbledore = JOptionPane.showInputDialog("What color do you draw with?");
		
		boolean isSquare;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
	    String McGonagall = JOptionPane.showMessageDialog(null, "isSquare");
		
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
	}	
}
