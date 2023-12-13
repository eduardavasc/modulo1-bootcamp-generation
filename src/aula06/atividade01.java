package aula06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class atividade01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int opcao;
		String novoCliente;
		Queue<String> fila = new LinkedList<String>();

		System.out.println("****************************************************\nSuas opções são:");
		System.out.println("\n1: Adicionar um novo Cliente na fila");
		System.out.println("2: Listar todos os Clientes na fila");
		System.out.println("3: Retirar Cliente na fila");
		System.out.println("0: Sair");
		System.out.println("****************************************************");
		do {

			System.out.println("Insira a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Insira o nome do novo cliente: ");
				novoCliente = leia.nextLine();
				fila.add(novoCliente);
				System.out.println("Cliente adicionado!");
				break;
			case 2:

				for (String cliente : fila) {
					System.out.println(cliente);
				}

				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("Listá vazia!");
				} else {
					fila.poll();
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
