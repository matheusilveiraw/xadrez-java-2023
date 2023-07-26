package tabuleiro;

public class BoardException extends RuntimeException {

	private static final long seralVersionuUID = 1L;
	
	public BoardException(String msg) { 
		super(msg);
	}
}