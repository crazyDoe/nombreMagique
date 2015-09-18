import java.util.Random;
import java.util.Scanner;

public class Prout {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int nbAlea = 1 + r.nextInt(100 - 1);
		boolean victoire = false;


		System.out.println("Saisir un nombre entre 1 et 100");
		int nbJoueur = Integer.parseInt(sc.nextLine());

		while(victoire == false)
		{
			if(nbJoueur > nbAlea )
			{
				System.out.println("C'est moins, essaye encore");
				nbJoueur = Integer.parseInt(sc.nextLine());

			}

			else if(nbJoueur < nbAlea )
			{
				System.out.println("C'est plus, essaye encore");
				nbJoueur = Integer.parseInt(sc.nextLine());

			}

			else if ( nbJoueur == nbAlea)
			{
				System.out.println("C'est ok");
				victoire = true;
			}
		}


	}

}
