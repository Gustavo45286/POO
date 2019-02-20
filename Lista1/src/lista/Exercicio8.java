package lista;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> frutas = new ArrayList<String>();
		String x = new String();
		System.out.println("Digite frutas para lista ou 'zero' para parar: ");
		do {
			x = scan.nextLine();
			if(true != x.equals(new String("zero"))) {
				frutas.add(x);
			}
		}while((true != x.equals(new String("zero"))));
		scan.close();
		System.out.println("Frutas da Lista: ");
		for(int i = 0; i < frutas.size(); i++) {
			System.out.println(frutas.get(i));
		}
	}

}
