package tabuleiro;

public class Peca {
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Peca(Tabuleiro tabuleiro) {
//		this.position = position; //comentado pq inicialmente vai ser nulo
		this.tabuleiro = tabuleiro;
		posicao = null; //por padrão o java já seta essevalor como null
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
}
