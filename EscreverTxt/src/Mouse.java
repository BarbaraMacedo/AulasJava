
public class Mouse {
	private boolean funciona;
	private int qtdbotoes;
	private String tamanho;
	
	
	public boolean isFunciona() {
		return funciona;
	}
	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}
	public int getQtdbotoes() {
		return qtdbotoes;
	}
	public void setQtdbotoes(int qtdbotoes) {
		this.qtdbotoes = qtdbotoes;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	@Override
	public String toString() {
		return "Mouse  [funciona = " + funciona + ", qtdbotoes = " + qtdbotoes + ", tamanho = " + tamanho + "] \n";
	}
	public Mouse(boolean funciona, int qtdbotoes, String tamanho) {
	
		this.funciona = funciona;
		this.qtdbotoes = qtdbotoes;
		this.tamanho = tamanho;
	}
	
	
	

}
