package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		/*new Aluno() é uma instância (Criação de Objeto)*/
		/*aluno1 é uma referênciapara o Objeto aluno*/
		/*new é uma palavra reservada do Java*/
		/*O "Ojbjeto" em Java é isso aí em baixo; no caso é a estrutura Aluno aaluno1 = new Aluno();*/
		Aluno aluno1 = new Aluno(); /*Aqui será o João*/
		aluno1.setNome("João da Silva"); /*com o método set eu chamo com "set.nome..."*/		
		System.out.println("O nome do aluno é " + aluno1.getNome());		/*Aqui usei o getNome...*/
		Aluno aluno2 = new Aluno();/*Aqui será o Pedro...*/
		
		
		Aluno aluno3 = new Aluno(); /*Aqui será o Alex...*/
		
		/*aquie já passei o valor padrão do objeto criado em "public Aluno (String nomePadrao"*/
		Aluno aluno4 = new Aluno("Maria");
		
		/*construtor com dois parâmetros*/
		Aluno aluno5 = new Aluno("José", 50);
		
		}

}
