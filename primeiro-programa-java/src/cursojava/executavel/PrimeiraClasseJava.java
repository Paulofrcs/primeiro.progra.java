package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		/*new Aluno() � uma inst�ncia (Cria��o de Objeto)*/
		/*aluno1 � uma refer�nciapara o Objeto aluno*/
		/*new � uma palavra reservada do Java*/
		/*O "Ojbjeto" em Java � isso a� em baixo; no caso � a estrutura Aluno aaluno1 = new Aluno();*/
		Aluno aluno1 = new Aluno(); /*Aqui ser� o Jo�o*/
		aluno1.setNome("Jo�o da Silva"); /*com o m�todo set eu chamo com "set.nome..."*/		
		System.out.println("O nome do aluno � " + aluno1.getNome());		/*Aqui usei o getNome...*/
		Aluno aluno2 = new Aluno();/*Aqui ser� o Pedro...*/
		
		
		Aluno aluno3 = new Aluno(); /*Aqui ser� o Alex...*/
		
		/*aquie j� passei o valor padr�o do objeto criado em "public Aluno (String nomePadrao"*/
		Aluno aluno4 = new Aluno("Maria");
		
		/*construtor com dois par�metros*/
		Aluno aluno5 = new Aluno("Jos�", 50);
		
		}

}
