package cursojava.classes;

/*Esta � nossa classe/objeto que representa o Aluno*/
public class Aluno {
	
	String nome;
	int idade;
	String dataNascimento;
	String regstroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;

	public Aluno() {/*Cria os dados na mem�ria - Sendo padr�o do Java*/
		
	}
	
	public Aluno(String nomePadrao); {
		nome = nomePadrao;
	}
	
	public Aluno (String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
	
}