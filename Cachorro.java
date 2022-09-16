package POO;

public class Cachorro extends Animal{

	private String raca;
	private String porte;
	private String pelagem;
	
	
	public Cachorro(String nome, char sexo, int idade, String classificacao, String raca, String porte, String pelagem) {

		super(nome, sexo, idade, classificacao);
		this.raca = raca;
		this.porte = porte;
		this.pelagem = pelagem;
		
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}


	public String getPorte() {
		return porte;
	}


	public void setPorte(String porte) {
		this.porte = porte;
	}


	public String getPelagem() {
		return pelagem;
	}


	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	
	public void procriar(){
		System.out.println("Cachorros procriam cachorros filhotes");
	}
	
	public void correr(){
		System.out.println("Cachorros correm uma velocidade media");
	}
}
