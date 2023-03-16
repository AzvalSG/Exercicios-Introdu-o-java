package Atividadepratica3;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		int num = 0, soma = 0;

		Scanner read = new Scanner(System.in);
		do {
			System.out.println("\nDigite um numero");
			num = read.nextInt();
			if (num > 0) {
				soma = soma + num;
			}
		} while (num != 0);

		System.out.printf("\n A soma dos numeros positivos é %d",soma);
	}
}
