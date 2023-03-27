package Atividadepratica3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		int idade = 0, cont=0, cont2=0;

		Scanner read = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade = read.nextInt();

		while (idade >= 0) {
			if (idade < 21) {
				cont++;
			} else if (idade > 50) {
				cont2++;
			}
			System.out.println("Digite sua idade: ");
			idade = read.nextInt();
		}
		System.out.printf("Total de pessoas menores de 21 anos = %d", cont);
		System.out.printf("\nTotal de pessoas maiores que 50 anos = %d", cont2);
	}
}