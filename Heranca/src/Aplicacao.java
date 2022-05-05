
public class Aplicacao {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		
		veiculo.setMarca("Hyundai");
		veiculo.setModelo("HB20");
		veiculo.setAno( 2020);
		
		veiculo.imprimir();
		veiculo.buzinar();
		System.out.println();
		
		Carro carro = new Carro();
		System.out.println("CARRO");
		carro.setMarca("Honda");
		carro.setModelo("City");
		carro.setAno( 2014);
		carro.setQuatroPortas(true);
		
		carro.imprimir();
		carro.buzinar();
		
		System.out.println();
		
		Caminhao caminhao = new Caminhao();
		System.out.println("CAMINHÃO");
		caminhao.setMarca("Mercedes");
		caminhao.setModelo("A");
		caminhao.setAno(2018);
		
		caminhao.imprimir();
		caminhao.buzinar();
		
		System.out.println();
		
		Moto moto = new Moto();
		System.out.println("MOTO");
		moto.setMarca("Honda");
		moto.setModelo("Biz");
		moto.setAno(2021);
		
		moto.imprimir();
		moto.empinar();
	}

}
