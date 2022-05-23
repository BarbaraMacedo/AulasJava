
public class main {
	
	public static final double PI = 3.14; // Criacao de Constante

	public static void main(String[] args) {
		
		double pi = main.PI;
		
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA;
		
		int num = DiaDaSemana.SEGUNDA.getNum();
		
		System.out.println(num);
		
		String s = "TERCA";
		
		hoje = DiaDaSemana.valueOf(s);
		
		System.out.println(hoje.getNum());

	}

}
