package cursojava.classes;

public class Aluno {
	/*Esses s�o os atributos do aluno*/
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
	
	
	
	/*Construtor do Java. Usa o ataljo Ctrl+ espa�o...*/
	 /*O construtor chama os dados padr�o do Java*/
	/*L� em PrimeiraClasse.java, sempre que voc� d� um "new", ele sempre vai chamar esse construtor*/
	/*mesmo se vc n�o escrever o construtor vai ser chamado por tr�s*/
	public Aluno() { /*cria os dados na mem�ria sendo padr�o do Java*/
		
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
	/*veremos os m�todos SETTERS e  GETTERS do objeto*/
	/*SET � para adicionar ou receber dados para os atributos*/
	/*GET � para resgatar ou obter o valor do atributo*/
	
	/*'this' �: eu chamando a classe; e 'nome' eu chamando o atributo*/
	/*aqui temos um SET ("setNome" = recebe dados*/
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/*no lugar de "return nome;" posso tamb�m usar um "return this.nome" */
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
	
	/*M�todo m�dia do aluno*/
	public double getMediaNota() {
			return (nota1 + nota2 + nota3 + nota4) / 4;
			
		
	}
}
