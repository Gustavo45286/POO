package lista;

import java.util.Scanner;

public class Exercicio7 {

	public static void credito(int s) {
		
		switch((s-1)/1000) {
	    	case 0:
	    		System.out.println("0");
	    		break;
	    	case 1:
	    		System.out.println("Credito de 20%: "+ ((s/100)*20));
	    		break;
	    	case 2:
	    		System.out.println("Credito de 30%: "+((s/100)*30));
	    		break;
	    	case 3:
	    		System.out.println("Credito de 40%: "+((s/100)*40));
	    		break;
	    	default:
	    	System.out.println("Valor Inválido");
	    
		}
		
	}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor de Saldo do ultimo ano: ");
		credito(scan.nextInt());
		scan.close();
	}

}
