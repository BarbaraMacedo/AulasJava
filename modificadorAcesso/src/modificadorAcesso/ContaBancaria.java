package modificadorAcesso;
public class ContaBancaria {
	
	private int numConta;  //Atributos
	private boolean ativo;
	private double saldo;
	
	public ContaBancaria() {
		ativo = true;
		saldo = 1.0;
	}
	

	public ContaBancaria(boolean ativo, double saldo) {   //Métodos
		this.ativo = ativo;
		this.saldo = saldo;
	}


	public void receber(double valor) {
		saldo += valor;
	}
	
	public double saldo() {
		return saldo;
	}
	
	public void dar(double valor) {
		if(saldo >= valor)
			saldo -= valor;
	}
}
