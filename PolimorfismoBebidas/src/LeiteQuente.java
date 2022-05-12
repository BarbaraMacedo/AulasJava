
public class LeiteQuente extends Bebida {

	public LeiteQuente() {
		super("LeiteQuente", true);

	}

	@Override
	public void preparar() {
		super.preparar();
		System.out.println("Colocando o leite no copo");

	}

}
