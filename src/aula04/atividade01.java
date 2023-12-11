package aula04;

import java.util.Arrays;
import java.util.Scanner;

public class atividade01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numero;

		System.out.print("Digite o número que voçê quer encontrar: ");
		numero = leia.nextInt();

		// Ordena o Vetor
		Arrays.sort(vetorInteiros);

		// System.out.println("\nVetor Ordenado");

		for (int indice = 0; indice < vetorInteiros.length; indice++) {
			System.out.println("Temos os seguintes valores no vetor: " + vetorInteiros[indice]);
		}

		int posicao = Arrays.binarySearch(vetorInteiros, numero);

		System.out.println("\nO elemento foi Encontrado e está na Posição: " + posicao);

	}

}
