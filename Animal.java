package POO;

public class Animal {

	private String nome;
	private char sexo;
	private int idade;
	private String classificacao;
	
	public Animal(String nome, char sexo, int idade, String classificacao) {
		
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.classificacao = classificacao; //vertebrado, invertebrado, selvagem, domestico, terrestre, aquatico, aereo, mamifero ...
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificaca) {
		this.classificacao = classificaca;
	}
	
	public void procriar(){
		
	}
	public void correr(){
		
	}
	public void escalar(){
		
	}
}
