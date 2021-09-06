package innlevering;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class LabB5 {
	public static void main (String[] args) {
		
		for(int i = 0; i < 10; i++) {
			int score = parseInt(showInputDialog("Skriv inn en testscore fra 0-100:"));
			if(score >= 0 && score <= 39) {
				System.out.println("F");
			} else if (score >= 40 && score <= 49) {
				System.out.println("E");
			} else if (score >= 50 && score <= 59) {
				System.out.println("D");
			} else if (score >= 60 && score <= 79) {
				System.out.println("C");
			} else if (score >= 80 && score <= 89) {
				System.out.println("B");
			} else if (score >= 90 && score <= 100) {
				System.out.println("A");
			} else {
				System.out.println("Invalid score. Try again.");
				score = parseInt(showInputDialog("Skriv inn en testscore fra 0-100:"));
			}
		}
	}
}
