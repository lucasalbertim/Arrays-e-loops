package loops;

import java.util.Scanner;

public class Ex3_MaiorMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int maiorNumero = 0;
		int soma = 0;
		int count =0;
		
		do{
			System.out.println("Numero: ");
			numero = scan.nextInt();
			soma = soma + numero;
			if (numero > maiorNumero) {
				maiorNumero = numero;
			}
			count = count+1;
		} while(count < 5);
		
		System.out.println("Maior: " + maiorNumero);
		System.out.println("A soma de todos os números é: " + soma);
		System.err.println("Média: " +soma/count);
	}

}
