package cursojava.executavel;

public class PrimeiraClasseJava {
	
	/*Variável Global é ascessível a todos e o seu valor é compartilhado*/
	static int maiorIdadeGlobal = 30;
	
	/*Main é um método auto executável de Java*/
	public static void main(String[] args) {
		
			
	/*Variável local pertence somente a esse método eo valor fica dentro do método*/
	int maiorIdade = 18;
	System.out.println("Valor da variável local = " + maiorIdade);
	System.out.println("Valor da variável Global = " + maiorIdadeGlobal);
		
	metodo2();
				
		
	}
	public static void metodo2 () {
		System.out.println("Valor da variável Global = " + maiorIdadeGlobal);
		
		
	}

}
