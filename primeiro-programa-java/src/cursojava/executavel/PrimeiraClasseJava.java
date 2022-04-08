package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* Main � um m�todo auto execut�vel de Java */
	/*aluno1 � uma refer�ncia para o objeto aluno*/
	public static void main(String[] args) {

	/*new Aluno( ) � uma inst�ncia (Cria��o de Objeto)*/
		Aluno aluno1 = new Aluno();/*Aqui ser� o Jo�o*/
		
		aluno1.setNome("Jo�o da Silva");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("18/05/1989");
		aluno1.setRegstroGeral("444.555.55");
		aluno1.setNumeroCpf("555.999.888-77");
		aluno1.setNomeMae("Shirlei");
		aluno1.setNomePai("Antonio");
		aluno1.setDataMatricula("10/10/2019");
		aluno1.setSerieMatriculado("5");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		System.out.println("Nome � = " + aluno1.getNome());
		System.out.println("Idade � = " + aluno1.getIdade());
		System.out.println("Nascimento � = " + aluno1.getDataNascimento());
		System.out.println("M�dia da nota � " + aluno1.getMediaNota());
		
		/*==================================================================*/
		System.out.println("-------------------------------------------------------------------------------------------");
		
		
		
		Aluno aluno2 = new Aluno(); /*Aqui ser� o Pedro*/
		aluno2.setNome("Pedro");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("10/10/1970");
		
		
		System.out.println("Nome � = " + aluno2.getNome());
		System.out.println("Idade � = " + aluno2.getIdade());
		System.out.println("Nascimento � = " + aluno2.getDataNascimento());
		
		/*==================================================================*/
		
		Aluno aluno3 = new Aluno(); /*Aqui ser� o Alex*/
		
		Aluno aluno4 = new Aluno("Mara");
		
		Aluno aluno5 = new Aluno("Jos�", 50);	 
	}	
					
		
}

