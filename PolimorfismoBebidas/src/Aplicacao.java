
public class Aplicacao {

	public static void main(String[] args) {

		// metodos estaticos n�o precisam instanciar um obj para acessar

		Preparador preparador = new Preparador();

		LeiteQuente leiteQuente = new LeiteQuente();
		Preparador.prepararBebida(leiteQuente);

		Refrigerante refrigerante = new Refrigerante();
		Preparador.prepararBebida(refrigerante);

	}

}
