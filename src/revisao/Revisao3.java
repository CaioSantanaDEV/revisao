package revisao;

import java.util.Scanner;

public class Revisao3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Digite dois algarismos inteiros, se forem iguais serão somados, se diferentes multiplicados: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int soma = a + b;
		int multi = a * b;
		if (a == b) {

			System.out.println("A soma dos números é " + soma);
		} else
			System.out.println("A multiplicão é " + multi);

		scanner.close();

	}

}
