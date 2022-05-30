import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) throws IOException {

		Camisa camisa1 = new Camisa("P", "preta");
		Camisa camisa2 = new Camisa("M", "vermelha");
		Camisa camisa3 = new Camisa("G", "azul");

		List<Camisa> lista1 = new ArrayList<Camisa>();

		lista1.add(camisa1);
		lista1.add(camisa2);
		lista1.add(camisa3);

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("gravar.txt"))) { // Utilizado para escrever em
																							// arquivo de texto
			for (Camisa camisa : lista1)
				escrever.write(camisa.toString() + "\n");
		}

		List lista2 = new ArrayList();

		try (BufferedReader reader = new BufferedReader(new FileReader("gravar.txt"))) { // Utilizado para ler dados de
																							// um arquivo
			String line;
			String string = "PP";

			while ((line = reader.readLine()) != null) {

				Camisa camisa = new Camisa(line);
			}
			System.out.println(lista2.add(lista1));

		}
	}

}
