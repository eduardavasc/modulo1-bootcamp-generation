package aula02;

import java.util.Scanner;

public class atividade01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int valorA, valorB, valorC;
		System.out.println("Insira o valor A: ");
		valorA = leia.nextInt();
		System.out.println("Insira o valor B:");
		valorB = leia.nextInt();
		System.out.println("Insira o valor C: ");
		valorC = leia.nextInt();

		if (valorA + valorB > valorC) {
			System.out.println("A Soma de A + B é Maior do que C. ");
		} else if (valorA + valorB < valorC) {
			System.out.println("A Soma de A + B é Menor do que C. ");
		} else {
			System.out.println("A Soma de A + B é igual a C");
		}

	}

}
