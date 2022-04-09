package cursojava.classes;

public class Aluno {
	/*Esses são os atributos do aluno*/
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
	
	/*Construtor do Java. Usa o ataljo Ctrl+ espaço...*/
	 /*O construtor chama os dados padrão do Java*/
	/*Lá em PrimeiraClasse.java, sempre que você dá um "new", ele sempre vai chamar esse construtor*/
	/*mesmo se vc não escrever o construtor vai ser chamado por trás*/
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
