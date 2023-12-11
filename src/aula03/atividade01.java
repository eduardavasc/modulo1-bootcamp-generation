package aula03;

import java.util.Scanner;

public class atividade01 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n, i;
		int countImpar = 0, countPar = 0;

		for (i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º número");
			n = leia.nextInt();
			if (n % 2 == 0) {
				countPar++;
			} else {
				countImpar++;
			}
		}

		System.out.println("Total de números pares:" + countPar);
		System.out.println("Total de números ímpares:" + countImpar);
	}
}
