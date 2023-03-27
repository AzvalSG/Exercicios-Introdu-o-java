package Atividadepratica3;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int num, i = 1, par, soma = 0, soma2 = 0;

		for (i = 1; i <= 10; i++) {

			System.out.println("\n\nDigite um numero desejado");
			num = read.nextInt();

			par = num % 2;

			if (par == 0) {
				soma = soma + 1;
			} else {
				soma2 = soma2 + 1;
			}
			System.out.printf("\n\nTotal de numeros pares: %d", soma);
			System.out.printf("\nTotal de numeros impar: %d", soma2);
		}

	}
}
