package aula05;

import java.util.ArrayList;
import java.util.Scanner;


public class atividade02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero;
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			numeros.add(i * 10);
		}

		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		
		
		if (numeros.indexOf(numero)>=0) {
		System.out.println("O número " + numero + " está localizado " + "na posição: " + numeros.indexOf(numero));
		} else {System.out.println(" Número "+ numero + " não foi encontrado!");}
}
}
