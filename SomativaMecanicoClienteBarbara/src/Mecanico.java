
public class Mecanico extends Usuario {

	private double maoDeObra;

	public Mecanico(String nome, int CPF, double maoDeObra) {
		super(nome, CPF);
		this.maoDeObra = maoDeObra;
	}

	public double getMaoDeObra() {
		return maoDeObra;
	}

	public void setMaoDeObra(double maoDeObra) {
		this.maoDeObra = maoDeObra;
	}

	@Override
	public String toString() {
		return  super.getNome() + ", CPF: " + super.getCPF() + "\nValor da mao de obra: " + maoDeObra + "\n";
	}

	

}
