package Exercicios;

import java.util.Scanner;

public class Exercicio1ParOuImpar {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = entrada.nextInt();

		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.println("O número " + numero + " está entre 0 e 10, é par.");
			} else {
				System.out.println("O número " + numero + " está entre 0 e 10, é impar.");
			}
		} else {
			System.out.println("O numero " + numero + " não está entre 0 e 10.");
		}

		entrada.close();
	}
}
