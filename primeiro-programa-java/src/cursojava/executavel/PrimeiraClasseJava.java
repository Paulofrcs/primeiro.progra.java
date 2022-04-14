package cursojava.executavel;

import java.nio.file.FileSystems;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		/*Caixinhas de texto*/
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String registroGeral = JOptionPane.showInputDialog("Qual o RG do aluno?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF do aluno?");
		String mae = JOptionPane.showInputDialog("Qual o nome da mãe?");
		String pai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String dataMatricula = JOptionPane.showInputDialog("Qualdata da matrícula?");
		String serie = JOptionPane.showInputDialog("Qual série?");
		String escola = JOptionPane.showInputDialog("Qual o Nome da Escola?");
		String nota1 = JOptionPane.showInputDialog("Qual a Nota 1?");
		String nota2 = JOptionPane.showInputDialog("Qual a Nota 2?");
		String nota3 = JOptionPane.showInputDialog("Qual a Nota 3?");
		String nota4 = JOptionPane.showInputDialog("Qual a Nota 4?");
		
		/*new Aluno() é uma instância (Criação de Objeto)*/
		/*aluno1 é uma referênciapara o Objeto aluno*/
		/*new é uma palavra reservada do Java*/
		/*O "Ojbjeto" em Java é isso aí em baixo; no caso é a estrutura Aluno aaluno1 = new Aluno();*/
		Aluno aluno1 = new Aluno(); /*Aqui será o João*/
		aluno1.setNome(nome); /*com o método set eu chamo com "set.nome..."*/		
		aluno1.setIdade(Integer.valueOf(idade)); /*aqui usa esse Integer.valueOf devido ao número inteiro*/
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSeriaMatriculado(serie);
		aluno1.setNomeEscola(escola);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		
		
		System.out.println("O nome do aluno é " + aluno1.getNome());		/*Aqui usei o getNome...*/
		System.out.println("Idade é "  + aluno1.getIdade());
		System.out.println("O nome da mãe é  "  + aluno1.getNomeMae());
		System.out.println("A data de nascimento é "  + aluno1.getDataNascimento());
		
		System.out.println("A média de notas do aluno é " + aluno1.getMediaNota());
		
		/*Sintaxe com OPERADOR TERNÁRIO; lembrando que precisa estar entre parênteses*/
		System.out.println("Resultado  " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2  " + aluno1.getAlunoAprovado2());
		
		
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
