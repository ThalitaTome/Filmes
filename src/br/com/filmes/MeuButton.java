package br.com.filmes;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;


public class MeuButton extends JButton{
	
private static final long serialVersionUID =1L;
	
	private int size = 10;
	private Color cor = new Color(0 , 0 , 0);

	public MeuButton(String texto) {
		super(texto);
		init();
	}
	
	public MeuButton (String texto, Color cor, int size) {
		super(texto);
		this.cor = cor;
		this.size = size;
		init();
		
	}

	private void init() {
		this.setForeground(cor);
		this.setFont(new Font(null, Font.BOLD, size));
	}
}
