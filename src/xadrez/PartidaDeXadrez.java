package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaDeXadrez {

	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrez() { 
		tabuleiro = new Tabuleiro(8, 8);
		initialSetup();
	}
	
	public PecaDeXadrez[][] getPecas() { 
		PecaDeXadrez[][] mat = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i = 0; i < tabuleiro.getLinhas(); i++) { 
			for(int j = 0; j < tabuleiro.getColunas(); j++) { 
				mat[i][j] = (PecaDeXadrez) tabuleiro.peca(i, j); //fez um downcasting nessa linha
			}
		}
		
		return mat;
	}
	
	private void initialSetup() { 
		tabuleiro.botaPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(5,1));
		tabuleiro.botaPeca(new Rei(tabuleiro, Cor.BRANCO), new Posicao(5,1));
	}
}
