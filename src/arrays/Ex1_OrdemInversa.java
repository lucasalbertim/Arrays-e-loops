package arrays;

public class Ex1_OrdemInversa {

	public static void main(String[] args) {
		int[] vetor = { -5, -6, 15, 50, 8, 4};
		
		int count = 0;
			
		System.out.print("Vetor ");
		for (int i = (vetor.length -1); i>=0; i--) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.print("\nVetor ");
		while(count < (vetor.length)) {
			System.out.print(vetor[count] + " ");
			count++;
		}
		
	}
}
