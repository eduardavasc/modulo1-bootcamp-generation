package aula01;

import java.util.Scanner;

public class atividade03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;

		System.out.println("Digite o valor do salário bruto:");
		salarioBruto = leia.nextFloat();
		System.out.println("Digite o valor do adicional noturno:");
		adicionalNoturno = leia.nextFloat();
		System.out.println("Digite o valor das horas extras:");
		horasExtras = leia.nextFloat();
		System.out.println("Digite o valor dos descontos:");
		descontos = leia.nextFloat();

		salarioLiquido = (salarioBruto + adicionalNoturno) + (horasExtras * 5) - (descontos);
		System.out.printf("O novo salário é: %.2f", salarioLiquido);

	}

}
