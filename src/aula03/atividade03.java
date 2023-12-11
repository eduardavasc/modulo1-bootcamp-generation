package aula03;

import java.util.Scanner;

public class atividade03 {

	public static void main(String[] args) {
		int idade, menorDe21 = 0, maiorDe50 = 0, n=0;
		Scanner leia = new Scanner(System.in);
		
		while (n >= 0) {
			System.out.println("Digite a idade: ");
			n = leia.nextInt();
			if (n>0 && n < 21) {
				menorDe21++;
			} else if (n > 50) {
				maiorDe50++;
			}
		}
		System.out.println("Total de pessoas menores de 21 anos:"+menorDe21);
		System.out.println("Total de pessoas maiores de 50 anos:"+maiorDe50);
	
	}

}
