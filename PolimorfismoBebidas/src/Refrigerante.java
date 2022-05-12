
public class Refrigerante extends Bebida  {

	public Refrigerante() {//construtor
		super ("Refrigerante",false);
		
	}

	@Override
	public void preparar() {
		super.preparar();
		System.out.println("colocando gelo");
		System.out.println("Colocando o refrigerante");
		
	}
	
	
	
}
