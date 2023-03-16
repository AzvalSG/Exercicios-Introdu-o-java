package Atividadepratica3;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num = 0, media = 0, soma = 0, i = 0;
		do {
			System.out.println("Digite o número desejado.");
			num = read.nextInt();
			if (num % 3 == 0 && num!=0) {
				soma = soma + num;
				i++;
			}
		} while (num != 0);
		media = soma / i;
		System.out.printf("A média de todos os numeros multiplos de 3 é : %d", media);
	}

}
