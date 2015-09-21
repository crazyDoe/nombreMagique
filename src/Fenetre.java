import java.awt.Color;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Fenetre extends JFrame{
	private JTextField monTexte;
	private int nbAlea;
	private Label affichage = new Label("Veuillez saisir un nombre entre 1 et 100");
	
	public Fenetre(){
		this.setTitle("Nombre magique : ");
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		nbAlea = 1 + r.nextInt(100 - 1);
		boolean victoire = false;


		JPanel pan = new JPanel();
		pan.setBackground(Color.WHITE);
		this.setContentPane(pan);

		//Label
		pan.add(affichage);


		// Création du JTextField
		JTextField texteSaisi = new JTextField();
		texteSaisi.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getExtendedKeyCode() == KeyEvent.VK_ENTER){
					try{
						String s = calcul(Integer.parseInt(monTexte.getText()));
						affichage.setText(s);
						monTexte.setText("");
						
						
					} catch(Exception ex){
						affichage.setText("Erreur saisissez un chiffre !");
						monTexte.setText("");
					}
				}
				
			}
		});
		
		texteSaisi.setColumns(15);
		pan.add(texteSaisi);
		this.monTexte = texteSaisi;
		this.setVisible(true);

	}

	public String calcul(int tm){
		if(tm < nbAlea)
			return "C'est plus ";
		else if (tm > nbAlea)
			return "C'est moins";
		else
			return "Gagné ! ";
	}
	
	public JTextField getNb()
	{
		return this.monTexte;
	}




}


