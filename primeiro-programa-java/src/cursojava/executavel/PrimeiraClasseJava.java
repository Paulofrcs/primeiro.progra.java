package cursojava.executavel;

public class PrimeiraClasseJava {

	/* Main � um m�todo auto execut�vel de Java */
	public static void main(String[] args) {

		/*Estrutura de repeti��o FOR e continue*/
		
		for (int numero = 0; numero <= 10; numero ++) {
			if (numero == 3 || numero == 6 || numero == 9) {
				System.out.println("Obaaa, encontrei o numero " + numero);
				continue;
			}	
			
			System.out.println("Processando o la�o de repeti��o");
		}
	}
}
