import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		
			
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("texto.txt"))){
		
			escrever.write(string);
		}
		
	try(BufferedReader reader = new BufferedReader(new FileReader("texto.txt"))){
			
			String line;
			String string2 = "";
			
			while((line = reader.readLine()) != null) {
				string2 += line + "\n";
			}
			System.out.println(string2);
	}
	}

}
