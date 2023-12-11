package aula02;

import java.util.Scanner;

public class atividade02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.println("Insira o número ");
		numero = leia.nextInt();

		if ((numero > 0) && (numero % 2 == 0)) {
			System.out.println("O número é par e positivo");
		} else if ((numero < 0) && (numero % 2 == 0)) {
			System.out.println("O número é par e negativo");
		} else if ((numero > 0) && (numero % 2 != 0)) {
			System.out.println("O número é impar e positivo");
		} else {
			System.out.println("O número é impar e negativo");
		}

	}

}
