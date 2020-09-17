package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class test_scores {
public static void main(String[] args) {
String Pinnochio = JOptionPane.showInputDialog("How much did you get on your SAT test?");
double value = Double.parseDouble(Pinnochio);
if (value > 1470) {
	JOptionPane.showMessageDialog(null, "You can get into an IVY League University.");
}
if (value > 600) {
	JOptionPane.showMessageDialog(null, "You can get into a UC.");
}
if (value > 400) {
	JOptionPane.showMessageDialog(null, "You can get into a California State University.");
}	
if (value < 400)   {
	JOptionPane.showMessageDialog(null, "You cannot get into any college. You will grow up to be a homeless begger on the streets.");
}
}
}


