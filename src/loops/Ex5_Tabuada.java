package loops;

import java.util.Scanner;


public class Ex5_Tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite o numero da tabuada: ");
		numero = scan.nextInt();
		
		System.out.println("Tabuada de: " + numero );
		 
		for (int i = 1; i<=10; i ++) {
		System.out.println(numero+" x "+i+" = "+numero*i);
		}
		
	}

}
