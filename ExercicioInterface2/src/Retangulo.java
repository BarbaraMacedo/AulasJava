
public class Retangulo implements AreaCalculavel{
	
	private int lado;

	@Override
	public void calcularArea() {
		
		System.out.println("A area do ret�ngulo �: " + Math.pow(4, 5));
			
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	
	
}
