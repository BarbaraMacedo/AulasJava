
public class Mouse {
	private String funciona;
	private String qtdbotoes;
	private String tamanho;
	
	@Override
	public String toString() {
		return "Mouse: funciona = " + funciona + ", qtdbotoes = " + qtdbotoes + ", tamanho = " + tamanho + "\n";
	}	
	
	public Mouse(String texto) {
		
		String[] arrayAuxiliar1 = texto.split(",");
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("=");
		this.funciona = arrayAuxiliar2[1].trim();
		
		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.qtdbotoes = arrayAuxiliar3[1].trim();
		
		String[] arrayAuxiliar4 = arrayAuxiliar1[2].split("=");
		this.qtdbotoes = arrayAuxiliar4[1].trim();	
	}

	public String isFunciona() {
		return funciona;
	}
	public void setFunciona(String funciona) {
		this.funciona = funciona;
	}
	public String getQtdbotoes() {
		return qtdbotoes;
	}
	public void setQtdbotoes(String qtdbotoes) {
		this.qtdbotoes = qtdbotoes;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}


}
