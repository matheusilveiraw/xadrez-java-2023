package app;

import tabuleiro.Tabuleiro;
import xadrez.PartidaDeXadrez;


public class Program {

	public static void main(String[] args) {
	
		Tabuleiro tabuleiro = new Tabuleiro(8,8);
		PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
		UI.printTabuleiro(partidaDeXadrez.getPecas());
	}

}
