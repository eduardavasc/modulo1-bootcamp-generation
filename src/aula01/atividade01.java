package aula01;

import java.util.Scanner;

public class atividade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		float salario, abono, novoSalario;

		System.out.println("Digite o valor do salário:");
		salario = leia.nextFloat();
		System.out.println("Digite o valor do abono:");
		abono = leia.nextFloat();

		novoSalario = salario + abono;

		System.out.printf("O novo salário é: %.2f", novoSalario);
	}

}
