
public class Cliente extends Usuario {

	private double valorPagarServico;
	Servico servico;
	FormaPag formaPag;

	public Cliente(String nome, int CPF, double valorPagarServico, Servico servico, FormaPag formaPag) {
		super(nome, CPF);
		this.valorPagarServico = valorPagarServico;
		this.servico = servico;
		this.formaPag = formaPag;
	}

	public double getValorPagarServico() {
		return valorPagarServico;
	}

	public void setValorPagarServico(double valorPagarServico) {
		this.valorPagarServico = valorPagarServico;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public FormaPag getFormaPag() {
		return formaPag;
	}

	public void setFormaPag(FormaPag formaPag) {
		this.formaPag = formaPag;
	}

	@Override
	public String toString() {
		return "Cliente: " + super.getNome() + ", CPF: " + super.getCPF() + "\nValor total a ser pago: "
				+ valorPagarServico + " \n" + "Tipo de servico a ser feito: " + servico + "Forma de pagamento: "
				+ formaPag + "\n -------------------------------------\n";
	}

}
