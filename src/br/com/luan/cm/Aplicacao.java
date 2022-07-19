package br.com.luan.cm;

import br.com.luan.cm.modelo.Tabuleiro;
import br.com.luan.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		new TabuleiroConsole(tabuleiro); 
	}
}