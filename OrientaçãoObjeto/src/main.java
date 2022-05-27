
public class main {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa(); //novo objeto

		pessoa1.nome = "Bárbara";  //pessoa1 recebe nome Barbara
		pessoa1.NumFigurinhas = 1; //pessoa1 ja tem 1 figurinha

		pessoa1.receber(3); //receber 3 figurinhas

		System.out.println(pessoa1.nome); //mostrar na tela
		System.out.println(pessoa1.NumFigurinhas);

		Pessoa pessoa2 = new Pessoa(); //novo objeto

		pessoa2.nome = "Gustavo"; 
		pessoa2.NumFigurinhas = 3;

		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.NumFigurinhas);

		pessoa1.dar(5, pessoa2); // pessoa1 da 5 figurinhas para pessoa2

		System.out.println("Depois"); 

		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.NumFigurinhas);

		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.NumFigurinhas);

	}

}
