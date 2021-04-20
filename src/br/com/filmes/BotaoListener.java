package br.com.filmes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class BotaoListener implements ActionListener{

	private MeuTextField tituloTextField;
	private MeuTextArea sinopseTextArea;
	private JComboBox<String> generoComboBox;
	private MeuRadioGroup streamer;
	private JCheckBox assistido;
	private StarRater avaliacao;
	
	public BotaoListener(MeuTextField tituloTextField , MeuTextArea sinopseTextArea, JComboBox<String> generoComboBox , MeuRadioGroup streamer, JCheckBox assistido , StarRater avaliacao) {
		
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
		
		JOptionPane.showMessageDialog(null, "FILME" + 
				" \nTítulo: " + tituloTextField.getText() + 
				"\nSinopse: " + sinopseTextArea.getText() + 
				"\nGênero: " + generoComboBox.getSelectedItem()+
				"\nOnde assistir: " + streamer.selecao() +
		        "\nAssistido: " + assistido.isSelected() +
		        "\nAvaliação: " + avaliacao.getSelection());

	}


}
