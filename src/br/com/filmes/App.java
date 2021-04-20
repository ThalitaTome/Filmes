package br.com.filmes;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

public class App {

	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao carregar aparência");
		}
		
		
		JFrame janela = new JFrame("Fiap Movies");
		
		JTabbedPane abas = new JTabbedPane();
		
		JPanel painel = new JPanel(new MeuGridLayout(1, 3, 10, 10));
		
		
		// PAINEL IMAGEM
		
		JPanel imagemPainel = new JPanel();
		
		MeuImageIcon imagem = new MeuImageIcon("src/wanda_vision.jfif");
		imagemPainel.add(imagem);
		
		painel.add(imagemPainel);
		
		
		// INFORMACAO PAINEL
		
		JPanel infoPainel = new JPanel(new MeuGridLayout(7, 1, 10, 10));
		
		infoPainel.add(new MeuLabel("Título:"));
		MeuTextField tituloTextField = new MeuTextField();
		infoPainel.add(tituloTextField);
				
		infoPainel.add(new MeuLabel("Sinopse:"));
		MeuTextArea sinopseTextArea = new MeuTextArea();
		infoPainel.add(sinopseTextArea);
		
		infoPainel.add(new MeuLabel("Gênero:"));
		String[] genero = {"Ação", "Comédia", "Romance", "Terror"};
		JComboBox<String> generoComboBox = new JComboBox<String>(genero);
		infoPainel.add(generoComboBox);
		
		
		
		JPanel botaoPainel = new JPanel(new MeuGridLayout(1, 2, 5, 5));
		
		JButton salvarBotao = new MeuButton("Salvar");
		botaoPainel.add(salvarBotao);
		
		JButton cancelarBotao = new MeuButton("Cancelar");
		botaoPainel.add(cancelarBotao);
		
		infoPainel.add(botaoPainel);
		painel.add(infoPainel);
		
		
		// STATUS PAINEL
		
		JPanel statusPainel = new JPanel(new MeuGridLayout(5, 1, 10, 10));
		
		statusPainel.add(new MeuLabel("Onde assistir:"));
		MeuRadioGroup streamer= new MeuRadioGroup (List.of("Netflix" , "Prime Video" , "Pirate Bay"));
		statusPainel.add(streamer);
		
		JCheckBox assistido = new JCheckBox("Assistido");
		statusPainel.add(assistido);
		
	
		statusPainel.add(new MeuLabel("Avaliação:"));
		StarRater avaliacao = new StarRater(5, 1f);
		statusPainel.add(avaliacao);
		
		
		painel.add(statusPainel);
		
		
		salvarBotao.addActionListener(new BotaoListener(tituloTextField , sinopseTextArea, generoComboBox, streamer, assistido, avaliacao));
		cancelarBotao.addActionListener(new CancelarBotaoListener(tituloTextField , sinopseTextArea, generoComboBox, streamer, assistido, avaliacao));
		
		abas.add("Cadastro", painel);
		
		janela.add(abas);
		
		janela.setSize(600, 330);
		janela.setVisible(true);
	}

}
