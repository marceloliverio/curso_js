package sintaxeVariaveis;

public class Fatorial {
	
	public static void main(String[] args) {
		
		int fatorial = 1;
	
		for(int n = 1 ; n <= 10 ; n ++) {
			System.out.println("O fatorial de "+n+"  é (" +(n-1)+ "!) X "+(n)+" = " + n * fatorial);
			
			fatorial *= n;
		}
	}

}


