
public enum FormaPag {

	A_VISTA, CARNE, CARTAO_CREDITO;

	private double juros;

	private FormaPag() {
		this.juros = juros;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

}
