

public class PrimeiraClasseJava {

	/* Main � um m�todo auto execut�vel de Java */
		public static void main(String[] args) {
			
	/*aluno1 � uma refer�ncia para o objeto aluno*/
	/*new Aluno( ) � uma inst�ncia (Cria��o de Objeto)*/
	
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data do nascimento?");
		String registoGeral = JOptionPane.showInputDialog("Qual o n�mero do RG?");
		String numeroCpf = JOptionPane.showInputDialog("Qual o n�mero do CPF?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da m�e?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da matr�cula?");
		String serieMatriculada = JOptionPane.showInputDialog("Qual s�rie?");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola?");
		String nota1 = JOptionPane.showInputDialog("Qual a nota1?");
		String nota2 = JOptionPane.showInputDialog("Qual a nota2?");
		String nota3 = JOptionPane.showInputDialog("Qual a nota3?");
		String nota4 = JOptionPane.showInputDialog("Qual a nota4?");
			
		Aluno aluno1 = new Aluno();/*Aqui ser� o Jo�o*/
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegstroGeral(registoGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatriculada);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		System.out.println("Nome �  " + aluno1.getNome());
		System.out.println("Idade �  " + aluno1.getIdade());
		System.out.println("Nascimento �  " + aluno1.getDataNascimento());
		System.out.println("M�dia da nota � " + aluno1.getMediaNota());
		
		}
	
					
		
}

