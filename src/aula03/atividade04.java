package aula03;

import java.util.Scanner;

public class atividade04 {

	public static void main(String[] args) {
		int idade, identidadeDeGenero, pessoaDesenvolvedora;
		int countMulherCis = 0, countHomemCis = 0, countNaoBinario = 0, countMulherTrans = 0, countHomemTrans = 0,
				countOutros = 0;
		int countBackend = 0, countFrontend = 0, countMobile = 0, countFullstack = 0;
		String continuar = "S";
		Scanner leia = new Scanner(System.in);

		while (continuar.equals("S")) {
			System.out.println("Idade: ");
			idade = leia.nextInt();
			System.out.println(
					"Identidade de gênero:\n1 – Mulher Cis\n2 – Homem Cis\n3 – Não Binário\n4 – Mulher Trans\n5 – Homem Trans\n6 – Outros\n");
			identidadeDeGenero = leia.nextInt();
			if (identidadeDeGenero == 1) {
				countMulherCis++;
			} else if (identidadeDeGenero == 2) {
				countHomemCis++;
			} else if (identidadeDeGenero == 3) {
				countNaoBinario++;
			} else if (identidadeDeGenero == 4) {
				countMulherTrans++;
			} else if (identidadeDeGenero == 5) {
				countHomemTrans++;
			} else {
				countOutros++;
			}
			System.out.println("Pessoa Desenvolvedora:\n1 – Backend\n2 – Frontend\n3 – Mobile\n4 – FullStack");
			pessoaDesenvolvedora = leia.nextInt();
			if (pessoaDesenvolvedora == 1) {
				countBackend++;
			} else if (pessoaDesenvolvedora == 2) {
				countFrontend++;
			} else if (pessoaDesenvolvedora == 3) {
				countMobile++;
			} else {
				countFullstack++;
			}
			System.out.println("Deseja continuar?");
			leia.nextLine();
			continuar = leia.nextLine();

		}
		System.out.println("Total de Pessoas Backend: " + countBackend);
		System.out.println("Total de Mulher Cis e Trans Desenvolvedoras Backend: ");

	}

}
