package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		 
		Conta contaDoPaulo  =  new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		 System.out.println(contaDoPaulo.saldo);
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if(contaDaMarcela.transfere(300, contaDoPaulo)) {
			System.out.println("transferencia com sucesso");
		}else {
			System.out.println("faltou dinheiro");
		}
		
		contaDaMarcela.transfere(300, contaDoPaulo);
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
		
		
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular);
	}
}
