package aula02;

import java.util.Scanner;

public class atividade03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int codigo, quantidade;

		System.out.println("# ## ### #### ##### Menu #### ### ## # ");
		System.out.println("\n-- Cachorro quente digite 1  ");
		System.out.println("\n-- X-Salada digite 2 ");
		System.out.println("\n-- X-Bacon digite 3 ");
		System.out.println("\n-- Bauru digite 4 ");
		System.out.println("\n-- Refrigerante digite 5 ");
		System.out.println("\n-- Suco de laranja digite 6 ");
		codigo = leia.nextInt();
		System.out.println("\n-- Digite a quantidade: ");
		quantidade = leia.nextInt();

		switch (codigo) {
		case (1):
			System.out.println("Produto: Cachorro-Quente.\nValor Total: " + 10 * quantidade);
			break;
		case (2):
			System.out.println("Produto: X-Salada.\nValor Total: " + 15 * quantidade);
			break;
		case (3):
			System.out.println("Produto: X-Bacon.\nValor Total: " + 18 * quantidade);
			break;
		case (4):
			System.out.println("Produto: Bauru.\nValor Total: " + 12 * quantidade);
			break;
		case (5):
			System.out.println("Produto: Refrigerante.\nValor Total: " + 8 * quantidade);
			break;
		case (6):
			System.out.println("Produto: Suco De Laranja.\nValor Total: " + 13 * quantidade);
		}

	}

}
