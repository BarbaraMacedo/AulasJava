
public class main {

	public static void main(String[] args) {
		
		double x[] = { 1, 3, 4, 6 };
		//
		//		for (int aux = 0; aux < x.length; aux++) {
		//			System.out.println("Valor indice " + aux + " = " + x[aux]);
		//		}
		//		String nome[] = { "Marcus", "Luizin", "Manu", "Vitao" };
		//
		//		for (int aux1 = 0; aux1 < nome.length; aux1++) {
		//			System.out.println(nome[aux1]);
		//			if (nome[aux1] == "Marcus") {
		//				System.out.println("Indice de Marcus eh: " + aux1);
		//
		//			}
		//		}
		//		int[] arrayInt = new int[5];
		//		String[] ArrayString = new String[4];
		//		double[] ArrayDouble = new double[3];

		//		arrayInt[3] = 4;
		//
		//		int[] numero = new int[6];
		//		Scanner teclado = new Scanner(System.in);
		//
		//		for (int aux2 = 0; aux2 < numero.length; aux2++) {
		//			System.out.println("Digite um numero qualquer");
		//			numero[aux2] = teclado.nextInt();
		//		}
		//		for  (int aux2 = 0; aux2 < numero.length; aux2++) {
        //		System.out.println("Indice"+aux2+" = "+numero[aux2]);
        //	}
			
				int[] arrayQualquer = new int[3];
		
		    	Object[] arrayObject = new Object[6];
		
				arrayObject[0] = 12;     //Conjunto de informcoes dependendo do tipo
				arrayObject[1] = "Bárbara";
				arrayObject[2] = 13.8;
				arrayObject[3] = true;
				arrayObject[5] = arrayQualquer;
				
				for (int aux2 = 0; aux2 < arrayObject.length; aux2++) {
					System.out.println("Indice " + aux2 + " = " + arrayObject[aux2]);
			}
				System.out.println();

				int[][] arrayBidirecional = new int[4][3];
				
				arrayBidirecional [0][0] = 8;
				arrayBidirecional [2][1] = 7;

				for (int linha = 0; linha < arrayBidirecional.length; linha++) {
					for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) {
						System.out.print("Indice [" + linha + "][" + coluna+ "] = " + arrayBidirecional[linha][coluna]+" ");
					}
					
				System.out.println();
				}
			}

	}


