package aula03;

import java.util.Scanner;

public class atividade06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n, somaMultiplos3=0,contSomaMultiplos3=0; 
		float mediaDeMultiplos;


		do {
			System.out.println("Digite o número: ");
			n = leia.nextInt();
			if (n>0 && n%3==0) {
				somaMultiplos3 = somaMultiplos3 + n; 
				contSomaMultiplos3++;
			}
		} while (n != 0);
		
		 mediaDeMultiplos = (float)somaMultiplos3/contSomaMultiplos3;
		System.out.println("A média dos números multiplos de 3 é: "+ mediaDeMultiplos);

	}

}
