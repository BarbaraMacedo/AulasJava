import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws IOException {

		Pessoa pessoa = new Pessoa("");

		List<Pessoa> lista = new ArrayList<Pessoa>();

		Scanner scanner = new Scanner(System.in);

		Endereco endereco = new Endereco();
		for (int x = 0; x <= 3; x++) {
			System.out.println("Digite o nome");
			scanner.next();

			System.out.println("Digite a idade");
			scanner.nextInt();

			System.out.println("Digite o bairro");
			scanner.next();

			System.out.println("Digite a rua");
			scanner.next();

			System.out.println("Digite o número");
			scanner.next();

			System.out.println("Sexo:");
			System.out.println("1 = Feminino  2 = Masculino");
			System.out.println();

			int x1 = 0;
			while (x1 != 1 && x1 != 2) {
				x1 = scanner.nextInt();
				if (x1 == 2)
					pessoa.setSexo(Sexo.MASCULINO);

				else if (x1 == 1)
					pessoa.setSexo(Sexo.FEMININO);
				else {
					System.out.println("Opção não válida");
					System.out.println("1 = Feminino  2 = Masculino");
				}
			}
		}

		lista.add(pessoa);

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("gravar.txt"))) {
			for (Pessoa pessoa1 : lista)
				escrever.write(pessoa1.toString() + "\n");
		}
		try (BufferedReader reader = new BufferedReader(new FileReader("gravar.txt"))) {
			String line;
			String string = "";

			while ((line = reader.readLine()) != null) {

			}
		}
	}
}
