package revisao;

import java.util.Scanner;

public class Revisao1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite os três números a serem comparados:");
		double a, b, c, maior;
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();

		// Pode-se utilizar o comando: Math.max(a, Math.max(b, c));
		
		if (a >= b && a >= c) {
			maior = a;
		}

		else if (b >= a && b >= c) {
			maior = b;
		} else
			maior = c;

		System.out.println("O maior é " + maior);

		scanner.close();
	}

}
