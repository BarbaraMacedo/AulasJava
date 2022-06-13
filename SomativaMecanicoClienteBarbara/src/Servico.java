
public class Servico {
	private String nome;
	private double qtdHorasServico;
	private double valorHorasServico;
	Mecanico mecanico;

	public Servico(String nome, double qtdHorasServico, double valorHorasServico, Mecanico mecanico) {
		super();
		this.nome = nome;
		this.qtdHorasServico = qtdHorasServico;
		this.valorHorasServico = valorHorasServico;
		this.mecanico = mecanico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getQtdHorasServico() {
		return qtdHorasServico;
	}

	public void setQtdHorasServico(double qtdHorasServico) {
		this.qtdHorasServico = qtdHorasServico;
	}

	public double getValorHorasServico() {
		return valorHorasServico;
	}

	public void setValorHorasServico(double valorHorasServico) {
		this.valorHorasServico = valorHorasServico;
	}

	public Mecanico getMecanico() {
		return mecanico;
	}

	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}

	@Override
	public String toString() {
		return  nome + " \nQuantidade de horas de serviço: " + qtdHorasServico + "\nValor hora de serviço: "
				+ valorHorasServico + "\nMecanico: " + mecanico;
	}

	
}
