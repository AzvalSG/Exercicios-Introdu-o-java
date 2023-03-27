package Atividadepratica4;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int i, j, l, c, somap = 0, somas = 0;
		System.out.println("Defina o tamanho da matriz L x C");
		l = read.nextInt();
		c = read.nextInt();
		int[][] m = new int[l][c];

		for (i = 0; i < l; i++) {
			for (j = 0; j < c; j++) {
				System.out.printf("Digite os valores correspondente a [%d] [%d]", i, j);
				m[i][j] = read.nextInt();
			}

		}
		for (i = 0; i < l; i++) {
			for (j = 0; j < c; j++) {
				if (i == j) {
					somap = somap + m[i][j];
				} else if (j == c - 1 - i) {
					somas = somas + m[i][j];
				}
			}

		}

		for (i = 0; i < l; i++) {
			for (j = 0; j < c; j++) {
				if (i == j) {
					System.out.printf("Os numeros da diagonal Principal são: %d, \n", m[i][j]);

				}
			}
		}
		for (i = 0; i < l; i++) {
			for (j = 0; j < c; j++) {
				if (j == c - 1 - i) {
					System.out.printf("Os numeros da diagonal Secundaria são: %d \n", m[i][j]);

				}
			}
		}
		System.out.printf("A soma da diagonal principal é %d e da diagonal secundaria é %d", somap, somas);
	}
}
