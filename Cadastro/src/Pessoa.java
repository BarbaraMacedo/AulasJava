
public class Pessoa extends Endereco{
	
	String nome;
	String idade;
	Endereco endereco;

	public Pessoa(String nome, String idade, Endereco endereco) {
	
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}
}
