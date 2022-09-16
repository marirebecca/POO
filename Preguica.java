package POO;

public class Preguica extends Animal{

	private String movimentos;
	private int horasDeSono;
	
	public Preguica(String nome, char sexo, int idade, String classificacao, String movimento, int horasDeSono) {
		super(nome, sexo, idade, classificacao);
		this.movimentos = movimento;
		this.horasDeSono = horasDeSono;
	}
	
	public void procriar(){
		System.out.println("Bicho preguiça procriam e tem filhotes");
	}
	
	public void escalar(){
		System.out.println("Bicho preguiça vive nas arvores para se protegerem");
	}
}
