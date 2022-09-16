package POO;

public class AnimalTeste {

	public static void main(String[] args) {
		
		Cachorro pitbull = new Cachorro("Scooby", 'M', 5, "Mamifero", "Pitbull", "Medio", "Pelo fino");
		Cavalo baixadeiro = new Cavalo("Brazuca", 'F', 7, "Mamifero", "Baixadeiro", "Grande", "Pelo fino");
		Preguica unau = new Preguica("Unau", 'F', 3, "Mamifero", "Lento", 20);
		
		pitbull.correr();
		pitbull.procriar();
		
		baixadeiro.correr();
		baixadeiro.procriar();
		
		unau.procriar();
		unau.escalar();
	}

}
