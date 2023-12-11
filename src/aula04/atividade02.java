package aula04;

import java.util.Scanner;

public class atividade02 {

	public static void main(String[] args) {
		int[][] matrizInteiros = new int[3][3];
		Scanner leia = new Scanner(System.in);

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite um valor para a posição [" + linha + "][" + coluna + "]: ");
				matrizInteiros[linha][coluna] = leia.nextInt();
			}
		}

		System.out.println("Elementos da diagonal principal: " + matrizInteiros[0][0] + "," + matrizInteiros[1][1] + ","
				+ matrizInteiros[2][2]);

		System.out.println("Elementos da diagonal secundária: " + matrizInteiros[0][2] + "," + matrizInteiros[1][1]
				+ "," + matrizInteiros[2][0]);

		System.out.println("Soma dos elementos da diagonal principal: "
				+ (matrizInteiros[0][0] + matrizInteiros[1][1] + matrizInteiros[2][2]));

		System.out.println("Soma dos elementos da diagonal secundaria: "
				+ (matrizInteiros[0][2] + matrizInteiros[1][1] + matrizInteiros[2][0]));
	}
}
