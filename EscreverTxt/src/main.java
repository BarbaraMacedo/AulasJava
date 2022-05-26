import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) throws IOException {

	String s = "MOUSE";

		Mouse mouse1 = new Mouse(true, 1, "pequeno");	
		Mouse mouse2 = new Mouse(true, 2, "médio");	
		Mouse mouse3 = new Mouse(true, 3, "grande");	
	
		List <Mouse> lista = new ArrayList <Mouse>();
		
		lista.add(mouse1);
		lista.add(mouse2);
		lista.add(mouse3);	
		
try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))){
		
			escrever.write(lista.toString());
		}

			for(Mouse mouse : lista) {	
		System.out.println(lista);
	}
}
}
