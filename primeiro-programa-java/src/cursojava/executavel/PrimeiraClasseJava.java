package cursojava.executavel;

import java.nio.file.FileSystems;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		/*Caixinhas de texto*/
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String registroGeral = JOptionPane.showInputDialog("Qual o RG do aluno?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF do aluno?");
		String mae = JOptionPane.showInputDialog("Qual o nome da m�e?");
		String pai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String dataMatricula = JOptionPane.showInputDialog("Qualdata da matr�cula?");
		String serie = JOptionPane.showInputDialog("Qual s�rie?");
		String escola = JOptionPane.showInputDialog("Qual o Nome da Escola?");
		
		
		
		/*new Aluno() � uma inst�ncia (Cria��o de Objeto)*/
		/*aluno1 � uma refer�nciapara o Objeto aluno*/
		/*new � uma palavra reservada do Java*/
		/*O "Ojbjeto" em Java � isso a� em baixo; no caso � a estrutura Aluno aaluno1 = new Aluno();*/
		Aluno aluno1 = new Aluno(); /*Aqui ser� o Jo�o*/
		aluno1.setNome(nome); /*com o m�todo set eu chamo com "set.nome..."*/		
		aluno1.setIdade(Integer.valueOf(idade)); /*aqui usa esse Integer.valueOf devido ao n�mero inteiro*/
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSeriaMatriculado(serie);
		aluno1.setNomeEscola(escola);
		
		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+"?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+"?");
		
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
	
		
		System.out.println(aluno1); /*Descri��o do objeto na mem�ria*/
		System.out.println("M�dia do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
			
	}

}
		
		
		