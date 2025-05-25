package revisao;

import java.util.Scanner;

public class Revisao5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o salário de um funcionario e descubra quantos salários mínimos corresponde");
		double salarioMinimo = 1518.00;  //Base de 2025
		double salarioFuncionario = scanner.nextDouble();

		double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;

		System.out.println(String.format("O Salário do funcionário corresponde à %.2f salários mínimos", quantidadeSalariosMinimos));

		scanner.close();

	}
}