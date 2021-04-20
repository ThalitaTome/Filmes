package br.com.filmes;
import java.awt.Font;

import javax.swing.JTextArea;

public class MeuTextArea extends JTextArea{

private static final long serialVersionUID =1L;
	

	private int linhas = 3;
	private int colunas = 10;
	
	public MeuTextArea() {
		super();
		init();
	}
	
	public void init() {
		this.setRows(linhas);
		this.setColumns(colunas);
		this.setBorder(BordaFactory.criar());
		this.setFont(new Font(null, Font.PLAIN, 11));
		
	}
}
