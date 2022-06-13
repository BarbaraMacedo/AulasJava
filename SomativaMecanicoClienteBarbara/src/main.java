import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) throws IOException {

		Mecanico mecanico1 = new Mecanico("João", 2226310, 70.00);
		Mecanico mecanico2 = new Mecanico("José", 3563445, 50.00);

		Servico servico1 = new Servico("Vistoria", 2.00, 50.00, mecanico1);
		Servico servico2 = new Servico("Troca de óleo", 03, 60.00, mecanico2);

		Cliente cliente1 = new Cliente("Maria", 27112345, 170.00, servico1, FormaPag.A_VISTA);
		Cliente cliente2 = new Cliente("Mario", 73543121, 170.00, servico1, FormaPag.CARNE);
		Cliente cliente3 = new Cliente("Julia", 55451432, 230.00, servico2, FormaPag.A_VISTA);
		Cliente cliente4 = new Cliente("Claudio", 88716783, 230.00, servico2, FormaPag.CARTAO_CREDITO);

		List<Cliente> cliente = new ArrayList<Cliente>();

		cliente.add(cliente1);
		cliente.add(cliente2);
		cliente.add(cliente3);
		cliente.add(cliente4);

		System.out.println(cliente);

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("gravar.txt"))) {
			for (Cliente clientea : cliente)
				escrever.write(clientea.toString() + "\n");
		}

	}

}
