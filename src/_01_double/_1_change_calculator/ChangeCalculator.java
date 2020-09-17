package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String Sirius = JOptionPane.showInputDialog(null, "How many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
int Pettigrew = Integer.parseInt(Sirius);
		// Ask the user how many dimes they have, and convert their answer
String Snafoy = JOptionPane.showInputDialog(null, "How many dimes do you have?");
int Malfoy = Integer.parseInt(Snafoy);
		// Ask the user how many quarters they have, and convert their answer
String Input = JOptionPane.showInputDialog(null, "How many quarters do you have?");
int Snape = Integer.parseInt(Input);
		// Calculate how much money the user has.  Hint: Use a double variable 
double num = Pettigrew*0.05 + Malfoy*0.1 + Snape*0.25;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
JOptionPane.showMessageDialog(null, num);
	}
}

