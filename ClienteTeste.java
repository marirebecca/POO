package POO;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("1", "Cris", 25, "333.333.333.333-33", "119999-9999");
		Cliente cliente2 = new Cliente("2", "Paulinha", 22, "555.555.555-55", "11666-6666");
		
		cliente1.imprimirDados();
	}
}
