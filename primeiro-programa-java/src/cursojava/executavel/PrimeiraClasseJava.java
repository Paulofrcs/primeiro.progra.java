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
		aluno1.setIdade(50);
		aluno1.setDataNascimento("18/10/1987");
		aluno1.setRegistroGeral("444.56987.884");
		aluno1.setNumeroCpf("123.456.789-98");
		aluno1.setNomeMae("Shirlei");
		aluno1.setNomePai("Antonio");
		aluno1.setDataMatricula("10/01/2019");
		aluno1.setSeriaMatriculado("5");
		aluno1.setNomeEscola("Escola JDEV Treinamentos");
		
		
		System.out.println("O nome do aluno é " + aluno1.getNome());		/*Aqui usei o getNome...*/
		System.out.println("Idade é "  + aluno1.getIdade());
		System.out.println("A data de nascimento é "  + aluno1.getDataNascimento());
		
		System.out.println("===================================================");
		/*--------------------------------------------------------------------------------------------------------------*/
		
		Aluno aluno2 = new Aluno();/*Aqui será o Pedro...*/
		
		aluno2.setNome("Pedro");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("10/10/1980");
		
		System.out.println("Aluno2: O nome do aluno é " + aluno2.getNome());		/*Aqui usei o getNome...*/
		System.out.println("Aluno2: Idade é "  + aluno2.getIdade());
		System.out.println("Aluno2: A data de nascimento é "  + aluno2.getDataNascimento());
		
		/*------------------------------------------------------------------------------------------------------*/
		
		
		Aluno aluno3 = new Aluno(); /*Aqui será o Alex...*/
		
		/*aquie já passei o valor padrão do objeto criado em "public Aluno (String nomePadrao"*/
		Aluno aluno4 = new Aluno("Maria");
		
		/*construtor com dois parâmetros*/
		Aluno aluno5 = new Aluno("José", 50);
		
		}

}
