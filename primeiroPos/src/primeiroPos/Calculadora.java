package primeiroPos;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
	
		double valor1 = 0;
		double valor2 = 0;
		double soma , subtracao, multiplicacao, divisao;
		
		String valorRecebido;
		
		try {
			valorRecebido = JOptionPane.showInputDialog(null, " Digite o primeiro valor de entrada");
			valor1 = Double.parseDouble(valorRecebido);
		}catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "número inválido. Considerando 0 para número 1");
		}
		
		try {
			valorRecebido = JOptionPane.showInputDialog(null, " Digite o segundo valor de entrada");
			valor2 = Double.parseDouble(valorRecebido);
		}catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "número inválido. Considerando 0 para número 2");
		}
		
		soma = valor1 + valor2;
		subtracao = valor1 - valor2;
		multiplicacao = valor1 * valor2;
		divisao = valor1 / valor2;
		
		StringBuilder resposta = new StringBuilder();
		resposta.append(valor1 + " + " + valor2 + " = " + soma +  " \n");
		resposta.append(valor1 + " - " + valor2 + " = " + subtracao +  " \n");
		resposta.append(valor1 + " * " + valor2 + " = " + multiplicacao +  " \n");
		resposta.append(valor1 + " / " + valor2 + " = " + divisao +  " \n");
		
		JOptionPane.showMessageDialog(null, resposta);
		
	}
}
