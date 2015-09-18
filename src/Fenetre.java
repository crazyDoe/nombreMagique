import java.awt.Color;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Fenetre extends JFrame{

	private JTextField monTexte;

	public Fenetre(){

		this.setTitle("Nombre magique : ");
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		JPanel pan = new JPanel();
		pan.setBackground(Color.WHITE);
		this.setContentPane(pan);

		//Label
		Label monLab = new Label("Bonjour");
		pan.add(monLab);


		// Création du JTextField
		JTextField texteSaisi = new JTextField();
		texteSaisi.setColumns(15);
		texteSaisi.setText("56");
		pan.add(texteSaisi);
		this.monTexte = texteSaisi;
		this.setVisible(true);

	}

	public JTextField getNb()
	{
		return this.monTexte;
	}




}


