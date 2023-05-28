package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Testscores {

	public static void main(String[] args) {
		
		String score = JOptionPane.showInputDialog("What was your test score?");
		
		int grade = Integer.parseInt(score);
				
			if (grade >= 80) {
				JOptionPane.showMessageDialog(null, "You must have studied really hard for this test.");
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Study harder next time.");
			}
	}
}
