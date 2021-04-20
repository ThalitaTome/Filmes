package br.com.filmes;

import java.awt.GridLayout;

public class MeuGridLayout extends GridLayout{

	 private static final long serialVersionUID = 1L;
	    
	    public MeuGridLayout(int rows, int cols, int hGap, int vGap) {
	        super(rows, cols);
	        
	        setHgap(hGap);
	        setVgap(vGap);
	    }
}
