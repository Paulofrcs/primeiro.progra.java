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
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	
	
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
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	/*Método média do aluno*/
	public double getMediaNota() {
			return (nota1 + nota2 + nota3 + nota4) / 4;
			
		
	}
}
