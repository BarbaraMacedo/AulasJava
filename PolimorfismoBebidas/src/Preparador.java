
public class Preparador {// Class de passagem normalmente não tem atributos.

	public static void prepararBebida(Bebida bebida) {
		System.out.println("Preparando a Bebida!" + bebida.getNome());
		System.out.println("Aguarde um momento!");
	

		bebida.preparar();

		if (bebida.isAquecer()) {
			System.out.println("Aquecendo a sua Bebida  " + bebida.getNome());

		}
		System.out.println("Sua Bebida está Pronta!!\n");
	}

}
