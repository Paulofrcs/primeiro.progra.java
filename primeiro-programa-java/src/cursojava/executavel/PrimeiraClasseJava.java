package cursojava.executavel;

public class PrimeiraClasseJava {
	
	/*Vari�vel Global � ascess�vel a todos e o seu valor � compartilhado*/
	static int maiorIdadeGlobal = 30;
	
	/*Main � um m�todo auto execut�vel de Java*/
	public static void main(String[] args) {
		
			
	/*Vari�vel local pertence somente a esse m�todo eo valor fica dentro do m�todo*/
	int maiorIdade = 18;
	System.out.println("Valor da vari�vel local = " + maiorIdade);
	System.out.println("Valor da vari�vel Global = " + maiorIdadeGlobal);
		
	metodo2();
				
		
	}
	public static void metodo2 () {
		System.out.println("Valor da vari�vel Global = " + maiorIdadeGlobal);
		
		
	}

}
