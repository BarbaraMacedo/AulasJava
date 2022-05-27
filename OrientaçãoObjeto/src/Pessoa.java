
public class Pessoa {
	String nome;  //Atributos
	int NumFigurinhas;

	void receber(int NumFigurinhas) { //metodos
		this.NumFigurinhas += NumFigurinhas; //adicionar figurinhaa
	}

	boolean dar(int NumFigurinhas, Pessoa pessoa) { //dentro do () sao parametros
		//boolean retorno;

		if (this.NumFigurinhas<NumFigurinhas) {
			System.out.println("Sem figurinhas suficientes!"); //mostrar mensagem na tela
			//retorno = false;
			return false;
		}
		else {
			this.NumFigurinhas -= NumFigurinhas; //remover figurinhas
			pessoa.receber(NumFigurinhas);
			//retorno = true;
			return true;
		}
		//return retorno;
	}
}
