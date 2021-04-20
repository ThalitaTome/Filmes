package br.com.filmes;

import java.awt.GridLayout;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class MeuRadioGroup extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	private ButtonGroup grupo = new ButtonGroup();
	private List<String> opcoes;
	
	public MeuRadioGroup(List<String> opcoes) {
		this.opcoes = opcoes;
		init();
		
	}
	
	public String selecao(){
		
		return GroupButtonUtils.getSelectedButtonText(grupo);
			
	}
	
	public void limpar(){
		
		grupo.clearSelection();
			
	}
	
	private void init() {
		setLayout(new GridLayout(opcoes.size(),1));
		opcoes.forEach(opcao -> {
		JRadioButton botao = new JRadioButton(opcao);
		grupo.add(botao);
		this.add(botao);
		});
	}

}
