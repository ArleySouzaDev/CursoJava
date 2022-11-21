package Controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		// Dom 1, Seg 2, Ter 3, Qua 4, Qui 5, Sex 6, Sab 7

		System.out.print("Digite o dia: ");
		int dia = entrada.nextInt();

		if (dia > 7 || dia < 1) {
			System.out.println("Dia inexistente.");
		} else if (dia == 1) {
			System.out.println("Hoje é Domingo!");
		} else if (dia == 2) {
			System.out.println("Hoje é Segunda-Feira!");
		} else if (dia == 3) {
			System.out.println("Hoje é Terça-Feira!");
		} else if (dia == 4) {
			System.out.println("Hoje é Quarta-Feira!");
		} else if (dia == 5) {
			System.out.println("Hoje é Quinta-Feira!");
		} else if (dia == 6) {
			System.out.println("Hoje é Sexta-Feira!");
		} else if (dia == 7) {
			System.out.println("Hoje é Sábado!");
		}

		System.out.print("Digite o nome do dia da semana: ");
		String dia2 = entrada.next();

		if (dia2.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		} else if ("segunda".equalsIgnoreCase(dia2)) {
			System.out.println(2);
		} else if ("terça".equalsIgnoreCase(dia2)
				|| "terca".equalsIgnoreCase(dia2)){
			System.out.println(3);
		} else if ("quarta".equalsIgnoreCase(dia2)) {
			System.out.println(4);
		} else if ("quinta".equalsIgnoreCase(dia2)) {
			System.out.println(5);
		} else if ("sexta".equalsIgnoreCase(dia2)) {
			System.out.println(6);
		} else if ("sábado".equalsIgnoreCase(dia2)
				|| "sabado".equalsIgnoreCase(dia2)){
			System.out.println(7);
		} else {
			System.out.println("Dia inválido!");
		}

		entrada.close();
	}
}
