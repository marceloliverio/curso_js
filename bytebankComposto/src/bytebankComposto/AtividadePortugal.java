package bytebankComposto;

public class AtividadePortugal {
	
	public static void main(String[] args) {
		
		double salario;
		int idade;
		String pessoa;
		double adicional1;
		double adicional2;
		
		salario = 12100;
		idade = 51;
		pessoa = "OLIVERIO";
		adicional1 = salario*0.12;
		adicional2 = salario*0.2;
				
		if(salario >= 10000 && idade >= 30) {
			System.out.println(" Funcionario :" + pessoa +"  \n salário Antigo:" + salario +"  \n adicional:"+ adicional1);
			System.out.println(" o novo valor é : R$ "+ (salario+adicional1));
		}else if(salario >= 12000 && idade >= 50){
			System.out.println(" Funcionario :" + pessoa +"  \n salário Antigo:" + salario +"  \n adicional:"+ adicional2);
			System.out.println(" o novo valor é : R$ "+ (salario+adicional2));
		}else if(idade >= 65) {
			System.out.println(" Funcionario :" + pessoa +"  \n salário Antigo:" + salario + "\nadicional:"+ (salario - adicional2));
			System.out.println(" o novo valor é : R$ "+ (salario+adicional2));
			
		}
		
	}

}
