
public class main {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa();

		pessoa1.nome = "Bárbara";
		pessoa1.NumFigurinhas = 1;

		pessoa1.receber(3);

		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.NumFigurinhas);

		Pessoa pessoa2 = new Pessoa();

		pessoa2.nome = "Gustavo";
		pessoa2.NumFigurinhas = 3;

		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.NumFigurinhas);

		pessoa1.dar(5, pessoa2);

		System.out.println("Depois");

		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.NumFigurinhas);

		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.NumFigurinhas);

	}

}
