
public class Camisa {
	private String tamanho;
	private String cor;

	public Camisa(String tamanho, String cor) {

		this.tamanho = tamanho;
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Camisa: tamanho = " + tamanho + ", cor = " + cor + "\n";
	}

	public Camisa(String texto) {

		String[] arrayAuxiliar1 = texto.split(","); // split: usado para dividir uma string em varias partes
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("=");
		this.tamanho = arrayAuxiliar2[1].trim();

		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.cor = arrayAuxiliar3[1].trim();
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
