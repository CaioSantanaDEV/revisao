package revisao;

import java.util.Scanner;

public class Revisao6 {
//6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor a ser reajustado");
		double valor = scanner.nextDouble();

		double aumento = valor * 5 / 100;

		double reajuste = valor + aumento;

		System.out.printf("Valor reajustado: %.2f", reajuste);

		scanner.close();

	}

}
