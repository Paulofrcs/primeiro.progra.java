package cursojava.executavel;

public class PrimeiraClasseJava {

	/* Main � um m�todo auto execut�vel de Java */
	public static void main(String[] args) {

		/*Estrutura de repeti��o FOR com break (Parada)*/
		
		for (int numero = 0; numero <= 10; numero ++) {
			if (numero == 3) {
				System.out.println("Obaaa, encontrei o n�mero 3");
				System.out.println("Estou parado e executar...");
				break;
			}	
		}
	}
}
