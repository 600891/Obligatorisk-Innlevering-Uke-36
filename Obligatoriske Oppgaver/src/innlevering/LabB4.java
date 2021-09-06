package innlevering;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class LabB4 {
	public static void main (String[] args) {
		int brutto = parseInt(showInputDialog("Hva er bruttolønnen din?"));
		if(brutto <= 184800) {
			//trinn 0
			System.out.println("Ingen trinnskatt.");
		} else if (brutto > 184800 && brutto <= 260100) {
			//trinn 1
			int trinnSkatt = (int)(brutto*(1.7f/100.0f));
			System.out.println("Trinnskatten din er: "+trinnSkatt);
		} else if (brutto > 260100 && brutto <= 651250) {
			//trinn 2
			int trinnSkatt = (int)(brutto*(4.0f/100.0f));
			System.out.println("Trinnskatten din er: "+trinnSkatt);
		} else if (brutto > 651250 && brutto <= 1021550) {
			//trinn 3
			int trinnSkatt = (int)(brutto*(13.2f/100.0f));
			System.out.println("Trinnskatten din er: "+trinnSkatt);
		} else if (brutto > 1021550) {
			//trinn 4
			int trinnSkatt = (int)(brutto*(16.2f/100.0f));
			System.out.println("Trinnskatten din er: "+trinnSkatt);
		}
	}
}
