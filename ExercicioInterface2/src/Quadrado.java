
public class Quadrado implements AreaCalculavel {
	
	private int lado;

	@Override
	public void calcularArea() {
		
		System.out.println("A area do quadrado é: " + Math.pow(lado, 2));
		
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	
	
	

}
