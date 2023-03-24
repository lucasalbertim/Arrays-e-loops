package loops;

import java.util.Scanner;

public class Ex1_NomeEIdade {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
			String nome;
			@SuppressWarnings("unused")
			int idade;
			
			while(true) {
			System.out.println("Nome: ");
			nome = scan.next();
			if (nome.equals("0")) break;
			
			System.out.println("Idade: ");
			idade = scan.nextInt();
			}
			System.out.println("Continua aqui...");
		
	}
}
