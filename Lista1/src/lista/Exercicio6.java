package lista;

import java.util.Scanner;

public class Exercicio6 {

	public static void custo(float C) {
		System.out.println("O custo total para o consumidor deste veiculo será: "+ ( (((C/100)*28) + ((C/100)*45)) + C) );
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o custo de fabrica do automovel: ");
		custo(scan.nextFloat());
		scan.close();
	}

}
