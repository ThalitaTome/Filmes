package br.com.filmes;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MeuImageIcon extends JLabel{

private static final long serialVersionUID =1L;
	

	public MeuImageIcon(String arquivo) {
		super();
		Image imagem = new ImageIcon(arquivo).getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH);
		setIcon(new ImageIcon(imagem));
		setSize(200, 250);
	}
	
	
}
