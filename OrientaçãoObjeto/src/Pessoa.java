
public class Pessoa {
	String nome;
	int NumFigurinhas;

	void receber(int NumFigurinhas) {
		this.NumFigurinhas += NumFigurinhas;
	}

	boolean dar(int NumFigurinhas, Pessoa pessoa) {
		//boolean retorno;

		if (this.NumFigurinhas<NumFigurinhas) {
			System.out.println("Sem figurinhas suficientes!");
			//retorno = false;
			return false;
		}
		else {
			this.NumFigurinhas -= NumFigurinhas;
			pessoa.receber(NumFigurinhas);
			//retorno = true;
			return true;
		}
		//return retorno;
	}
}
