package modificadorAcesso;
public class main {

	public static void main(String[] args) {
		
//		
//		conta1.ativo = true;
//		conta1.numConta = 1234;
//		conta1.saldo = 100.50;
//		conta1.
		
//		System.out.println(conta1.ativo);
//		System.out.println(conta1.numConta);
//		System.out.println(conta1.saldo);
		
//		conta1.receber(100.8);
//		conta1.dar(110);
//		System.out.println(conta1.saldo());
		
//		ContaBancaria conta2 = new ContaBancaria();
//		System.out.println(conta2.saldo());
		
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Gustavo");
		cliente1.setCPF(12345);
		cliente1.setNumConta(45522242);
		
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getCPF());
		System.out.println(cliente1.getNumConta());
		
		System.out.println(cliente1);
		
		Cliente cliente2 = new Cliente();
		
		cliente2.setNome("Gustavo");
		cliente2.setCPF(12345);
		cliente2.setNumConta(45522242);
		
		System.out.println(cliente2);
		
//		cliente1 = cliente2;
		
		if(cliente1.getNome() == cliente2.getNome()) { //compara um atributo só (nome)
			System.out.println("Os nomes são iguais");
		}
		else {
			System.out.println("Os nomes são diferentes");
		}
		
		if(cliente1 == cliente2) {
			System.out.println("Os objetos são iguais");
		}
		else {
			System.out.println("Os objetos são diferentes");
		}
		
		
		if(cliente1.equals(cliente2)) {
			System.out.println("Os atributos dos objetos são iguais");
		}
		else {
			System.out.println("Os atributos dos objetos são diferentes");
		}
	}

}
