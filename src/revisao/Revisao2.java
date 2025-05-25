package revisao;

import java.util.Scanner;

public class Revisao2 {

	public static void main(String[] args) {
		System.out.print("Digite um número a ser denominado par ou impar, negativo ou positivo: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		String parImpar;
		if (n % 2 == 0) {
			parImpar = "par";
		} else
			parImpar = "impar";

		String positivoNegativo;
		if (n > 0) {
			positivoNegativo = "positivo";

		} else {
			positivoNegativo = "negativo";
		}

		System.out.print(n + " é um número " + positivoNegativo + " e " + parImpar);

		scanner.close();
	}

}
