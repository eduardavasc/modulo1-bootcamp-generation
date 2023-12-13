package aula06;

import java.util.Scanner;
import java.util.Stack;

public class atividade02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int opcao;
		String novoLivro;

		Stack<String> pilha = new Stack<String>();

		System.out.println("****************************************************");
		System.out.println("Suas opções são:\n");
		System.out.println("1 - Adicionar livro na pilha.");
		System.out.println("2 - Listar todos os livros.");
		System.out.println("3 - Retirar livro na pilha.");
		System.out.println("0 - Sair");
		System.out.println("****************************************************");
		do {

			System.out.println("Insira a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Insira o nome do novo livro: ");
				novoLivro = leia.nextLine();
				pilha.add(novoLivro);
				System.out.println("Livro adicionado!");
				break;
			case 2:
				for (String livro : pilha) {
					System.out.println(livro);
				}
				break;
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("Listá vazia!");
				} else {
					pilha.pop();
				}
				break;
			case 0:
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Insira valor válido: ");
			}

		} while (opcao != 0);
	}
}
