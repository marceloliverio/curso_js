package primeiroPos;

import javax.swing.JOptionPane;

public class Primeiro {
	
	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null,"EAE MUNDO");
		//String saudacao = JOptionPane.showInputDialog(null,"Bom dia");
		//irá retornar sempre uma string, quando solicitar valores em números usar o Integer.parseInt para converter para inteiro.
		int nota = 4;
		String resultadoDoAluno =(nota >=6 ? "Aprovado" : "Reprovado");
		JOptionPane.showMessageDialog(null,resultadoDoAluno);
		
	}

}
