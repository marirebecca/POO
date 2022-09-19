package POO;

public class TelefonePublico extends Telefone{

	public TelefonePublico() {
		super("Público");
	}
	
	@Override
	public void toca(int numToques) {
		for(int i=0; i<numToques;i++) {
			System.out.println("\n Trimmmmmmm...");
		}	
	}
	
	@Override
	public void disca(String numero) {
		if(numero.charAt(0)== '9' || numero.charAt(0)=='8') {
			System.out.println("\n Este telefone não liga para celular!");
		}
	}	
}
