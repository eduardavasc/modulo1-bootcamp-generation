package aula05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class atividade04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero;
		Set<Integer> setNumeros = new HashSet<Integer>();

		Integer y = Integer.valueOf(5);

		setNumeros.add(y);
		setNumeros.add(1);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(9);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(10);
		setNumeros.add(6);

		System.out.println("Digite um número: ");
		numero = leia.nextInt();

		if (setNumeros.contains(numero)) {
			System.out.printf("Número %02d Encontrado!%n", numero);
		} else {
			System.out.printf("O número %02d não foi encontrado!%n", numero);
		}

	}

}
