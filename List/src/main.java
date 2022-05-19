import java.util.ArrayList;  //importado da livraria do java     //List: também herda de objetos
import java.util.List;   //importado da livraria do java 

public class main {

	public static void main(String[] args) {
	
		List lista = new ArrayList();
		
		lista.add("Bárbara");
     	lista.add(20);
		lista.add(true);
//		for(int x = 0; x< lista.size(); x++) {
//			System.out.println(lista.get(x));
//		}
		for(Object valor : lista) {
			System.out.println(valor);
		}
		
		System.out.println();
		lista.remove(0);  //Apaga o primeiro valor (0)
		for(Object valor : lista) {	
			System.out.println(valor);
		}
		System.out.println();
		
		lista.add(0, "def");  //força ficar no valor 0 
		for(Object valor : lista) {
			System.out.println(valor);
		}
		System.out.println();
		
		lista.set(0, "ghi");  //substitui o valor 0 
		for(Object valor : lista) {
			System.out.println(valor);
		}
		System.out.println();
		lista.clear();  //limpa a lista
		if(lista.isEmpty()) {
			System.out.println("Sua lista está vazia!");
		}
		
		Conta conta1 = new Conta("Água", 60.00);
		Conta conta2 = new Conta("Luz", 100.00); 
		
		//generic: ajuda a lista a saber qual tipo ela vai usar (entre <>)
		
		List<Conta> listaDeContas = new ArrayList<Conta>();
		
		listaDeContas.add(conta1);
		listaDeContas.add(conta2);
		
		for(Conta conta : listaDeContas) {
			System.out.println(conta);
		}

	}

}
