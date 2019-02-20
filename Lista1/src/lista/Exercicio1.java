package lista;

import java.util.Scanner;

public class Exercicio1 {

	public static void area(float h,float b,float B) {
		System.out.println("Área: " + (h*(b+B))/2);
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float x,y,z;
		System.out.println("Digite a:");
		System.out.print("Altura: ");
		x = scan.nextFloat();
		System.out.print("Base menor: ");
		y = scan.nextFloat();
		System.out.print("Base maior: ");
		z = scan.nextFloat();
		scan.close();
		area(x,y,z);
		
	}

}
