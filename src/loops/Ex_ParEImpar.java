package loops;

import java.util.Scanner;

public class Ex_ParEImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int qtdNumero;
		int numero;
		int count = 0;
		int countPar = 0;
		int countImpar = 0;
		System.out.println("Quantos numeros: ");
		qtdNumero = scan.nextInt();
		
		do {
			System.out.println("Numero: ");
			numero = scan.nextInt();
			if (numero%2 == 0 ) {
				countPar = countPar + 1;
			}else {
				countImpar = countImpar + 1;
			}
			count = count + 1;
			}while(count < qtdNumero);
		
		System.out.println("Numeros pares: " + countPar);
		System.out.println("Numeros impares: " + countImpar);
		
		}
	}


