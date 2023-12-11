package aula01;

import java.util.Scanner;

public class atividade04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float n1, n2, n3, n4, diferencaProduto;

		System.out.println("Digite o número 1:");
		n1 = leia.nextFloat();
		System.out.println("Digite o valor do adicional noturno:");
		n2 = leia.nextFloat();
		System.out.println("Digite o valor das horas extras:");
		n3 = leia.nextFloat();
		System.out.println("Digite o valor dos descontos:");
		n4 = leia.nextFloat();

		diferencaProduto = (n1 * n2) - (n3 * n4);

		System.out.println("A diferença entre os produtos dos números escolhidos é:" + diferencaProduto);

	}

}
