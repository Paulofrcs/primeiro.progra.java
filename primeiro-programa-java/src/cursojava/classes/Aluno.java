package cursojava.classes;

public class Aluno {
	/*Esses são os atributos do aluno*/
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String seriaMatriculado;
	
	
	
	/*Construtor do Java. Usa o ataljo Ctrl+ espaço...*/
	 /*O construtor chama os dados padrão do Java*/
	/*Lá em PrimeiraClasse.java, sempre que você dá um "new", ele sempre vai chamar esse construtor*/
	/*mesmo se vc não escrever o construtor vai ser chamado por trás*/
	public Aluno() { /*cria os dados na memória sendo padrão do Java*/
		
	}
	/*chamo de 'nomePadrao, por exemplo ao receber a String*/
	/*defino que o "nome" dessa sempre vai ser = ao nomePadrao */
	public Aluno (String nomePadrao) {
		nome = nomePadrao;
		
		
	}

	public Aluno (String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
	/*veremos os métodos SETTERS e  GETTERS do objeto*/
	/*SET é para adicionar ou receber dados para os atributos*/
	/*GET é para resgatar ou obter o valor do atributo*/
	
	/*'this' é: eu chamando a classe; e 'nome' eu chamando o atributo*/
	/*aqui temos um SET ("setNome" = recebe dados*/
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/*no lugar de "return nome;" posso também usar um "return this.nome" */
	public  String getNome() {
		return nome;
		
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public String getSeriaMatriculado() {
		return seriaMatriculado;
	}
	public void setSeriaMatriculado(String seriaMatriculado) {
		this.seriaMatriculado = seriaMatriculado;
	}
	
	
}
