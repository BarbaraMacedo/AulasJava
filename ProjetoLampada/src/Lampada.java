
public class Lampada {
	
	private boolean ligada;  //Atributos / Privado (Somente os métodos da classe podem acessar)
	
	
	public void ligar() {   //Métodos 
	
		ligada = true;
		
	}
	
	public void desligar() { //Métodos
	
		ligada = false;
		
	}
	
	public void imprimir() {      // Condição (Se/Senao) 

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
