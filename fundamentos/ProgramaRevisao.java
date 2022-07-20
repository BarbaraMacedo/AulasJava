package fundamentos;

import java.util.Scanner;

public class ProgramaRevisao {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Barbara", 20, 1234786556, 4300);
		Pessoa pessoa2 = new Pessoa("Gustavo", 21, 1456677218, 3000);

		System.out.println(pessoa1);
		System.out.println(pessoa2);

		System.out.print("A diferenca entre os salarios e de: R$ ");
		System.out.print(pessoa1.salario - pessoa2.salario);
		System.out.print(" reais");
		System.out.println();

	}

}
