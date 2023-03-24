package loops;

import java.util.Scanner;

public class Ex6_Fatorial {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int multiplicacao = 1;
		
		System.out.println("Fatorial: ");
		int fatorial = scan.nextInt();
		System.out.print(fatorial+"! = ");
		
		for (int i = fatorial; i >= 1; i--){
			multiplicacao = multiplicacao * i;
		}
		System.out.print(multiplicacao + " ");
	}
}
