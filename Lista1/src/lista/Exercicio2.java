package lista;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		int x;
		int p =0;
		
		do {
			System.out.println("Digite um inteiro ou digite um numero menor ou igual a 0 para sair.");
			x = scan.nextInt();
			if(x > 0) {
				numeros.add(x);
			}
			
		}while(x>0);
		
		scan.close();
		
		System.out.println("Total do numeros:" + numeros.size());
		System.out.println("Pares: ");
		
		for(int i = 0; i < numeros.size(); i++) {
			if(numeros.get(i)%2==0){
				p++;
				System.out.println(numeros.get(i));
			}
			
		}
		
		System.out.println("Quantidade: "+ p);
		System.out.println("impares:");
		
		for(int i=0; i < numeros.size(); i++) {
			if(numeros.get(i)%2!=0){
				System.out.println(numeros.get(i));
			}
			
		}
		
		System.out.println("quantidade: "+ (numeros.size()-p));
		
		
		
	}
}
