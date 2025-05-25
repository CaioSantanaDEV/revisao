package revisao;

import java.util.Scanner;

//7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

public class Revisao7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean x = true;
		boolean y = true;
		x = scanner.nextBoolean();
		y = scanner.nextBoolean();

		if (x == true && y == true) {
			System.out.println("Ambos os valores são verdadeiros");

		} else if (x || y == false) {
			System.out.println("Um dos valores é falso");

		} else
			System.out.println("Ambos os valores são falsos");

		scanner.close();
	}

}
