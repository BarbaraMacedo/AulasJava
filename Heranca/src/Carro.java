
public class Carro extends Veiculo{

	private boolean quatroPortas;  //atributos

	@Override
	public void imprimir() { //metodos
		super.imprimir();
		System.out.println("Tem  4 portas: " + quatroPortas);
	}

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	
	
	
}
