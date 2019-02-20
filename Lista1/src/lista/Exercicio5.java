package lista;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nomes[]  = new String[3];
		int idade[]= new int[3];
		
		String N[]=new String[2];
		int Y[]= {100000,-100000};
		
		for(int i=0; i < 3 ; i++) {
			System.out.println("Digite o nome da "+ (i+1)+"° pessoa:");
			nomes[i] = scan.nextLine();
			System.out.println("Digite a idade da "+ (i+1)+"° pessoa:");
			idade[i] = Integer.parseInt(scan.nextLine());
			
			/*
			if(i == 0) {
				Y[0] = idade[i];
				Y[1] = idade[i];
				N[0] = nomes[i];
				N[1] = nomes[i];
				
			}*/
			
			if(idade[i]< Y[0]) {
				Y[0] = idade[i];
				N[0] = nomes[i]; 
			}
			
			if(idade[i]> Y[1]) {
				Y[1] = idade[i];
				N[1] = nomes[i]; 
			}
			
			
		}
		scan.close();
		System.out.println("Menor idade: "+Y[0]+", Nome: "+N[0]);
		System.out.println("Maior idade: "+Y[1]+", Nome: "+N[1]);
		
	}

}
