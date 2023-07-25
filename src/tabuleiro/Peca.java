package tabuleiro;

public class Peca {
	protected Posicao position;
	private Tabuleiro tabuleiro;
	
	public Peca(Tabuleiro tabuleiro) {
//		this.position = position; //comentado pq inicialmente vai ser nulo
		this.tabuleiro = tabuleiro;
		position = null; //por padrão o java já seta essevalor como null
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
}
