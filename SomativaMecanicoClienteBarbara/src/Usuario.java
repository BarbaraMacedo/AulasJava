
public class Usuario {

	private String nome;
	private int CPF;

	public Usuario(String nome, int CPF) {
		this.nome = nome;
		this.CPF = CPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int CPF) {
		CPF = CPF;
	}

	@Override
	public String toString() {
		return "Usuario" + nome + ", CPF=" + CPF;
	}

}
