package projetoIntermediario;

public class Jogador {
	
	int idJogador;
	String nomeJogador;
	int numeroCamisa;
	
	public int getIdJogador() {
		return idJogador;
	}
	public void setIdJogador(int idJogador) {
		this.idJogador = idJogador;
	}
	public String getNomeJogador() {
		return nomeJogador;
	}
	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}
	public int getNumeroCamisa() {
		return numeroCamisa;
	}
	public void setNumeroCamisa(int numeroCamisa) {
		this.numeroCamisa = numeroCamisa;
	}

    public Jogador criarJogador(){
		Jogador jogador = new Jogador();
		jogador.idJogador = idJogador++;
		jogador.nomeJogador = "Joaozinho";
		jogador.numeroCamisa = 24;
		
		return jogador;
		
	}

public static void main(String[] args) {
	
}
}
