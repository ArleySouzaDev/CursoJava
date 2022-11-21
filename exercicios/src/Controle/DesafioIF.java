package Controle;

import java.util.Scanner;

public class DesafioIF {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a média do aluno");
		double media = entrada.nextDouble();

		if (media >= 9 && media <= 10) {
			System.out.println("Está aprovado, parabéns!");
			System.out.println("Ficou entre os melhores.");

		}
		if (media >= 7 && media < 9) {
			System.out.println("Está aprovado, parabéns!");
		}

		if (media >= 5 && media < 7) {
			System.out.println("Recuperação, estude para passar.");

		}
		if (media < 5 && media >= 0) {
			System.out.println("Reprovado!");

		}
		entrada.close();
	}

}
