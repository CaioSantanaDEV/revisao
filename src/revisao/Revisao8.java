package revisao;

import java.util.Collections;

import java.util.Arrays;
import java.util.Scanner;

public class Revisao8 {

	// 8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na
	// tela os valores em ordem decrescente.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite três valores inteiros a serem ordenados");

		Integer[] valores = new Integer[3];

		System.out.print("Digite o primeiro: ");
		valores[0] = scanner.nextInt();

		System.out.print("Digite o segundo: ");
		valores[1] = scanner.nextInt();

		System.out.print("Digite o terceiro: ");
		valores[2] = scanner.nextInt();

		Arrays.sort(valores, Collections.reverseOrder());

		for (int i = 0; i < valores.length; i++) {
			System.out.print(valores[i]);
			if (i < valores.length - 1) {
				System.out.print(", ");
			} 
		}
		scanner.close();
	}

}
