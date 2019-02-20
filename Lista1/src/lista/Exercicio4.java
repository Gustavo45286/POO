package lista;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nomes[]  = new String[5];
		System.out.println("Digite cinco nomes: ");
		
		for(int i=0; i < 5; i++ ){
			nomes[i] = scan.nextLine();
		}
		System.out.println("");
		System.out.println("Ordem inversa.");
		for(int i = 4; i >= 0; i-- ){
			System.out.println(nomes[i]);
		}
		scan.close();
	}
}
