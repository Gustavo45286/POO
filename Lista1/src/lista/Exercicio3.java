package lista;

import java.util.Scanner;

public class Exercicio3 {

	public static void salario(float h) {
		System.out.println("Seu salário é: "+ h * 10.25);
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		salario(scan.nextFloat());
		
		scan.close();
	}

}
