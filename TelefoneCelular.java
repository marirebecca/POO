package POO;

public class TelefoneCelular extends Telefone{

	public TelefoneCelular() {	
		super("Celular");
	}

	@Override 
	
	public void toca(int codigoToque) { 
		
		switch(codigoToque) {
		
		case 1:
			System.out.println("\n Trimmm...trimmmmm");
			break;		
		
		case 2:
			System.out.println("\n Plimmmm... Plimmmmm");
			break;
		
		default:
			System.out.println("\n Trummmmmm...Trum........");			
		}		

	}	
	
	@Override
	public void disca(String numero) {
		System.out.println("\nDiscando..."+numero);

	}
}
