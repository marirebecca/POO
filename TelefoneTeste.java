package POO;

public class TelefoneTeste {

	public static void main(String[] args) {

		TelefoneCelular celular =  new TelefoneCelular();
		TelefoneFixo fixo = new TelefoneFixo();
		TelefonePublico publico = new TelefonePublico();

		Telefone telefone = null;

		int n = (int)(Math.random()*3.0);

		System.out.println("\n O número escolhido foi: " + n);

		switch(n) {
			
			case 0: telefone = celular; break;
			
			case 1: telefone = fixo; break;
			
			case 2: telefone = publico; break;
			
			default:
			
				System.out.println("\n Erro inesperado...");
		}

		if(telefone != null) {

			telefone.disca("952161199");
			telefone.toca(n);
		}
	}	
}
