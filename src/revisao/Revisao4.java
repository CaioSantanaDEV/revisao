package revisao;

import java.util.Scanner;

public class Revisao4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número a ser demonstrado o antecessor e o sucessor");
		int n = scanner.nextInt();
		
		int antecessor = n - 1;
		int sucessor = n + 1;
		
		System.out.printf("Respectivamente o antecessor e sucessor de %d são: %d e %d", n, antecessor, sucessor);
		
		
		
		
		scanner.close();

	}

}
