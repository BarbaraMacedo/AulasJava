
public class Quadrado implements AreaCalculavel {
	
	private int lado;

	@Override    //override: sobrescrita de um metodo da superclasse
	public void calcularArea() {
		
		System.out.println("A area do quadrado é: " + Math.pow(lado, 2)); //base elevada ao expoente
		
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	
	
	

}
