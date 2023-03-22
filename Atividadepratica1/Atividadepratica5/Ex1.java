package Atividadepratica5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList<String> mylist = new ArrayList<String>();
		Scanner read = new Scanner(System.in);
		String cor;
		int op;

		do {
		System.out.println("\n(1)Para adicionar uma cor");
		System.out.println("\n(0)Para finalizar.");
		op = read.nextInt();

		switch (op) {
		case 1:
			System.out.println("\nEscreva a cor desejada ");
			do {
				cor = read.nextLine();
				if (!cor.equals("Sair")) {
					mylist.add(cor);
				}
			} while (!cor.equals("Sair"));
			break;
		case 0:
			System.out.println("\nAs cores são ");
			System.out.println(mylist);
			break;

		default:
			System.out.println("\nOpção inválida...Digite novamente");
		}
		}

		while (op != 0)
			;

	}

}
