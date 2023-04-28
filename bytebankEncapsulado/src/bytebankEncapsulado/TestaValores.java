package bytebankEncapsulado;

import javax.swing.JOptionPane;

public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getAgencia());
		
		
		Conta conta2 = new Conta(1337, 16549);
		Conta conta3 = new Conta(2112, 16662);
		
		System.out.println("O total de contas criadas é de : " + Conta.getTotal());
		JOptionPane.showMessageDialog(null, "Bom dia");
	}
}
