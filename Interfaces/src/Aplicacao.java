
public class Aplicacao { 

	public static void main(String[] args) {

		Rota rota = new Rota();  //Instância / novo objeto 
		Ferrari ferrari = new Ferrari();
		rota.ir(ferrari);
		System.out.println();
		
		Fusca fusca = new Fusca();
		rota.ir(fusca);
		
		Vendedor vendedor = new Vendedor();
//		Apartamento apartamento = new Apartamento();
		
//		vendedor.mostrarPreco(apartamento);  //Mostrar resultado
		vendedor.mostrarPreco(ferrari);
	}

}
