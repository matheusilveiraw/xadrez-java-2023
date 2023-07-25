package xadrez.pecas;

import java.awt.Color;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaDeXadrez;

public class Torre extends PecaDeXadrez{

	public Torre(Tabuleiro tabuleiro, Cor white) {
		super(tabuleiro, white);
	}
	
	@Override
	public String toString() {
		return "T";
	} 
}
