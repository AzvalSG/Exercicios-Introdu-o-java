package Atividadepratica4;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num, i = 0, casa = 0;
		boolean valid = false;
		System.out.println("Escreva quantas variaveis você quer comparar.");
		int a = read.nextInt();

		int[] vetor = new int[a];
		System.out.printf("Escreva %d numeros aleatorios", vetor.length);
		for (i = 0; i < vetor.length; i++) {
			vetor[i] = read.nextInt();
		}
		System.out.println("Escolhe o numero que você quer buscar.");
		num = read.nextInt();
		for (i = 0; i < vetor.length; i++) {
			if (vetor[i] == num) {
				casa = i;
				valid = true;
			}
		}
		if (valid) {
			System.out.printf("A casa referente ao numero selecionado é a de numero %d\n", casa+1);
		} else {
			System.out.println("Numero não encontrado");
		}
	}
}
