package innlevering;

import static javax.swing.JOptionPane.*;

public class O3 {
	public static void main(String[] args) {
		int n = Integer.parseInt(showInputDialog("Enter a whole number greater than 0."));
		while (n <= 0) {
			n = Integer.parseInt(showInputDialog("Number is too small, try again."));
		}
		long resultat = 1;
		for (int f = 2; f <= n; f++) {
			resultat *= f;
		}
		showMessageDialog(null, n + "!" + " = " + resultat);
	}
}
