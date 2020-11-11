package tabuleiro;

public class Peca {
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null; //pois ao iniciar o jogo, as posições das peças são nulas
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
}
