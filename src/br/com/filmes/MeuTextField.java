package br.com.filmes;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;

public class MeuTextField extends JTextField{

	private static final long serialVersionUID =1L;
	
	public MeuTextField() {
		super();
		init();
	}
	
	private void init() {
		this.setPreferredSize(new Dimension(100,30));
		this.setBorder(BordaFactory.criar());
		this.setFont(new Font(null, Font.PLAIN, 11));
	}
	
}
