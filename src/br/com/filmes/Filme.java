package br.com.filmes;

public class Filme {
	
	private String titulo;
	private String sinopse;
	private String genero;
	private String streamer;
	private boolean assitido;
	private int avaliacao;
	
	
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getSinopse() {
		return sinopse;
	}
	
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getStreamer() {
		return streamer;
	}
	
	public void setStreamer(String streamer) {
		this.streamer = streamer;
	}
	
	public boolean isAssitido() {
		return assitido;
	}
	
	public void setAssitido(boolean assitido) {
		this.assitido = assitido;
	}
	
	public int getAvaliacao() {
		return avaliacao;
	}
	
	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	

}
