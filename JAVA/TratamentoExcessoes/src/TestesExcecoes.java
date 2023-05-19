import javax.swing.JOptionPane;

public class TestesExcecoes {

	public static void main(String[] args) {
		String idade = JOptionPane.showInputDialog("Qual a sua idade ?");
		int valorIdade = Integer.parseInt(idade);
		System.out.println("Idade informada: " + valorIdade);

	}

}
