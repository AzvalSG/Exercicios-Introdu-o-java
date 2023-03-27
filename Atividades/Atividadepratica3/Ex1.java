package Atividadepratica3;

import java.util.Scanner;

public class Ex1 {

	static int num1;
	static int num2;
	static int i = 0;

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Escreva dois valores para descobrir os multiplos de 3 e 5 que tem entre eles.");
		num1 = leia.nextInt();
		num2 = leia.nextInt();

		if (num1 < num2) {
			for (i = num1; i < num2; i++) {
				int res1 = i % 3;
				int res2 = i % 5;
				if (res1 == 0 && res2 == 0) {
					System.out.printf("\nO numero %d é multiplo de 3 e 5", i);
				}
			}
		} else {
			System.out.println("Intervalo invalido.");
		}
	}
}