package aula03;

import java.util.Scanner;

public class atividade05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n, somaPositivos=0;

		do {
			System.out.println("Digite o número: ");
			n = leia.nextInt();
			if (n >0) {
				somaPositivos = somaPositivos + n; 
			}
		} while (n != 0);
		
		System.out.println("A soma dos números positivos é: "+somaPositivos);
	}

	}


