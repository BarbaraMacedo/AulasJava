
public class Lampada {
	
	private boolean ligada;  //Atributos / Privado (Somente os metodos da classe podem acessar)
	
	
	public void ligar() {   //Metodos 
	
		ligada = true;
		
	}
	
	public void desligar() { //Metodos
	
		ligada = false;
		
	}
	
	public void imprimir() {      // Condicao (Se/Senao) 

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
