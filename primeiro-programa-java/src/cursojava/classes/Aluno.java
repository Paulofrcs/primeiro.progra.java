package cursojava.classes;

public class Aluno {
	/*Esses s�o os atributos do aluno*/
	String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String seriaMatriculado;
	
	/*Construtor do Java. Usa o ataljo Ctrl+ espa�o...*/
	 /*O construtor chama os dados padr�o do Java*/
	/*L� em PrimeiraClasse.java, sempre que voc� d� um "new", ele sempre vai chamar esse construtor*/
	/*mesmo se vc n�o escrever o construtor vai ser chamado por tr�s*/
	public Aluno() { 
		
	}
	/*chamo de 'nomePadrao, por exemplo ao receber a String*/
	/*defino que o "nome" dessa sempre vai ser = ao nomePadrao */
	public Aluno (String nomePadrao) {
		nome = nomePadrao
		
		
	}

	public Aluno (String nomePadrao, int idadePadrao) {
		nome = nomePadrao
		idade = idadePadrao
	}
}
