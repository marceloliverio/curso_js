package projetoIntermediario;

public class Principal {

	public static void main(String[] args) {
		
	    public Jogador criarJogador(){
			Jogador jogador = new Jogador();
			jogador.idJogador = idJogador++;
			jogador.nomeJogador = "Joaozinho";
			jogador.numeroCamisa = 24;
			
			return jogador;
			
		}

		
		
		System.out.println(criarJogador());

	}

}
