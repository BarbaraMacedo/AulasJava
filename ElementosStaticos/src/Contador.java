
public class Contador {
	
	private static int valor; //atributo
	
//	public Contador() { //Construtor
//		this.valor = 1;
//	}
	static {
		valor = 1;
	}

	public static void incrementar() {
		valor ++;
	}

	public static int getValor() { //get/set
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	

}
