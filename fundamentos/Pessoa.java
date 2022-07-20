package fundamentos;

public class Pessoa {

	String nome;
	int idade;
	int cpf;
	int salario;

	public Pessoa(String nome, int idade, int cpf, int salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "nome: " + nome + "\nidade: " + idade + "\ncpf: " + cpf + "\nsalario: " + salario + "\n";
	}

}
