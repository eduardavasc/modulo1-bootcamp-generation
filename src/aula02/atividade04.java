package aula02;

import java.util.Scanner;

public class atividade04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nomeColaborador, nomeCargo;
		int codigoCargo;
		float salario, novoSalario;
		
		System.out.println("Escreva seu nome: ");
		nomeColaborador = leia.nextLine();

		System.out.println("Digite o código do seu cargo: ");
		codigoCargo = leia.nextInt();
		
		System.out.println("Digite seu salário: ");
		salario = leia.nextFloat();
		
		switch(codigoCargo) {
		case 1:
			novoSalario = (float) ((salario * 0.1) + salario);
			nomeCargo = "Gerente";
			System.out.println("Nome: " + nomeColaborador + "\n");
			System.out.println("Cargo: " + nomeCargo + "\n");
			System.out.printf("Salário: R$ %.2f" , novoSalario);
			break;
		case 2:
			novoSalario = (float) ((salario * 0.07) + salario);
			nomeCargo = "Vendedor";
			System.out.println("Nome: " + nomeColaborador + "\n");
			System.out.println("Cargo: " + nomeCargo + "\n");
			System.out.printf("Salário: R$ %.2f" , novoSalario);
			break;
		case 3: 
			novoSalario = (float) ((salario * 0.09) + salario);
			nomeCargo = "Supervisor";
			System.out.println("Nome: " + nomeColaborador + "\n");
			System.out.println("Cargo: " + nomeCargo + "\n");
			System.out.printf("Salário: R$ %.2f" , novoSalario);
			break;
		case 4: 
			novoSalario = (float) ((salario * 0.06) + salario);
			nomeCargo = "Motorista";
			System.out.println("Nome: " + nomeColaborador + "\n");
			System.out.println("Cargo: " + nomeCargo + "\n");
			System.out.printf("Salário: R$ %.2f" , novoSalario);
			break;
		case 5: 
			novoSalario = (float) ((salario * 0.05) + salario);
			nomeCargo = "Estoquista";
			System.out.println("Nome: " + nomeColaborador + "\n");
			System.out.println("Cargo: " + nomeCargo + "\n");
			System.out.printf("Salário: R$ %.2f" , novoSalario);
			break;
		case 6:
			novoSalario = (float) ((salario * 0.08) + salario);
			nomeCargo = "Técnico de TI";
			System.out.println("Nome: " + nomeColaborador + "\n");
			System.out.println("Cargo: " + nomeCargo + "\n");
			System.out.printf("Salário: R$ %.2f" , novoSalario);
			break;
		default:
			System.out.println("Digite um código de cargo válido!");
			break;
		}
	}

	}


