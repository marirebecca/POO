package POO;

public class Cliente {

	private String id;
	private String nome;
	private int idade;
	private String cpf;
	private String celular;
	
	public Cliente(String id, String nome, int idade, String cpf, String celular) {

		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.celular = celular;
		
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public void imprimirDados() {
		System.out.println("\n Identificação: " + id 
				+ "\n Nome: " + nome 
				+ "\n Idade: " + idade 
				+ "\n CPF: " + cpf 
				+ "\n Celular: " + celular);
	}
	
}
