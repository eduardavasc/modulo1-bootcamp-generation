package aula05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class atividade01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String nomeDaCor;

		ArrayList<String> cores = new ArrayList<String>();

		for (int linha = 0; linha < 5; linha++) {
			System.out.println("Digite uma cor: ");
			nomeDaCor = leia.nextLine();
			cores.add(nomeDaCor);
		}

		System.out.println("\n\nListar todas as cores:");

		Iterator<String> icores = cores.iterator();

		while (icores.hasNext()) {
			System.out.println(icores.next());

		}

		System.out.println("\n\nOrdenar todas as cores:");

		Collections.sort(cores);

		System.out.println("\nOrdenar as cores:");

		for (String cor : cores) {
			System.out.println(cor);
		}
	}
}
