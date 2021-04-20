package br.com.filmes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class CancelarBotaoListener implements ActionListener{

	private MeuTextField tituloTextField;
	private MeuTextArea sinopseTextArea;
	private JComboBox<String> generoComboBox;
	private MeuRadioGroup streamer;
	private JCheckBox assistido;
	private StarRater avaliacao;
	
	public CancelarBotaoListener(MeuTextField tituloTextField , MeuTextArea sinopseTextArea, JComboBox<String> generoComboBox , MeuRadioGroup streamer, JCheckBox assistido , StarRater avaliacao) {
		
		this.tituloTextField = tituloTextField;
		this.sinopseTextArea = sinopseTextArea;
		this.generoComboBox = generoComboBox;
		this.streamer = streamer;
		this.assistido = assistido;
		this.avaliacao = avaliacao;
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Filme filme = new Filme();
		filme.setTitulo(tituloTextField.getText());
		filme.setSinopse(sinopseTextArea.getText());
		filme.setGenero((String) generoComboBox.getSelectedItem());
		filme.setStreamer(streamer.selecao());
		filme.setAssitido(assistido.isSelected());
		filme.setAvaliacao(avaliacao.getSelection());
		
		tituloTextField.setText(null);
		sinopseTextArea.setText(null);
		generoComboBox.setSelectedItem(null);
		streamer.limpar();
		assistido.setSelected(false);
		avaliacao.setSelection(0);

	}
}
