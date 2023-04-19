package bytebankEncapsulado;

public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1773, 16549);
		conta.setNumero(1337);
	
		Cliente paulo = new Cliente();
		paulo.nome ="paulo silveira";
		
		conta.setTitular(paulo);
	}
}
