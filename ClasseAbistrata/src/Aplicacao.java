
public class Aplicacao {

	public static void main(String[] args) {
		
		// Item item = new item();  Obs: Não se pode instânciar um objeto abstrato / Classes abstratas não se pode instânciar
		
		Item item = new Cogumelo();
		item.pegar();
		
		item = new Moeda();
		item.pegar();
		
		item = new Diamante();
		item.pegar();
	}
	
}
