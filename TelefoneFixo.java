package POO;

public class TelefoneFixo extends Telefone{

	public TelefoneFixo() {
		super("Fixo");
	}
	
	@Override
	public void toca(int numToques) {
		
		for(int i=0; i<numToques;i++) {
			System.out.println("\n Trimmmmmmm...");
		}		
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("\n Dicando..." + numero);
	}
}
