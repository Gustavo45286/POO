package lista;

import java.util.Scanner;
import java.util.Vector;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Vector<String> n = new Vector<String>();
		Vector<Integer> y = new Vector<Integer>();
		Vector<Float> p = new Vector<Float>();
		String x = new String();
		do {
			System.out.println("Digite um nome ou escreva fim para parar:");
			x = scan.nextLine();
			if(true != x.equals(new String("fim"))) {
				n.add(x);
				System.out.print("Digite a idade: ");
				y.add(Integer.parseInt(scan.nextLine()));
				System.out.print("Digite o peso: ");
				p.add(Float.parseFloat(scan.nextLine()));
			}
		}while((true != x.equals(new String("fim"))));
		scan.close();
		
		System.out.println("Lista de pessoas:");
		for(int i = 0; i < n.size(); i ++) {
			System.out.println("Posição "+ (i+1)+"° .");
			System.out.println(n.get(i));
			System.out.println(y.get(i));
			System.out.println(p.get(i));
			System.out.println("");
		}
	}
}
