package cursojava.executavel;

public class PrimeiraClasseJava {

	/* Main é um método auto executável de Java */
	public static void main(String[] args) {

		/*Estrutura de repetição FOR com break (Parada)*/
		
		for (int numero = 0; numero <= 10; numero ++) {
			if (numero == 3) {
				System.out.println("Obaaa, encontrei o número 3");
				System.out.println("Estou parado e executar...");
				break;
			}	
		}
	}
}
