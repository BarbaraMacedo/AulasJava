
public class Lampada {
	
	private boolean ligada;
	
	
	public void ligar() {
	
		ligada = true;
		
	}
	
	public void desligar() {
	
		ligada = false;
		
	}
	
	public void imprimir() {

		if(ligada == true) {
			System.out.println("Lampada ligada");
			
		}
		else {
			System.out.println("Lampada desligada");
		}
		
	}

	public Lampada(boolean ligada) {
		
		this.ligada = ligada;
	}



}
