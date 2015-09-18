import java.util.Random;
import java.util.Scanner;

import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		Fenetre fen = new Fenetre();
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int nbAlea = 1 + r.nextInt(100 - 1);
		boolean victoire = false;
		
		JTextField nom = fen.getNb();
		String tonChat = nom.getText();
		int nbJoueur = Integer.parseInt(tonChat);
		
		System.out.println(nbJoueur);
		

	}

}
