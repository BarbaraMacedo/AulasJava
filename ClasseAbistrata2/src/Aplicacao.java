
public class Aplicacao {

	public static void main(String[] args) {
		
		// Item item = new item();  Obs: N�o se pode inst�nciar um objeto abstrato;
		
		Item item = new Cogumelo();
		item.pegar();
		
		item = new Moeda();
		item.pegar();
		
		item = new Diamante();
		item.pegar();
	}
}
