package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {

		String valor1String = JOptionPane.showInputDialog("Digite o primeiro número: ");
		String valor2String = JOptionPane.showInputDialog("Digite o segundo número: ");

		System.out.println(valor1String + valor2String);

		double numero1 = Double.parseDouble(valor1String);
		double numero2 = Double.parseDouble(valor2String);

		double soma = numero1 + numero2;
		System.out.println("Soma é " + soma);
		System.out.println("Média é " + soma / 2);

	}
}
