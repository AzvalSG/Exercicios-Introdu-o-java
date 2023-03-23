package Atividadepratica6;

import java.util.Scanner;
import java.util.Stack;

public class Ex2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		Stack<String> pilha = new Stack<String>();
		int op;
		String nome;

		System.out.println("*******************************************************");
		System.out.println("*                                                     *");
		System.out.println("*                  Pilha de livros                    *");
		System.out.println("*                                                     *");
		System.out.println("*******************************************************");
		System.out.println("*                                                     * ");
		System.out.println("*              1 - Adicionar Livro na Pilha           *");
		System.out.println("*              2 - Listar todos os Livros             * ");
		System.out.println("*              3 - Retirar Livro da Pilha             * ");
		System.out.println("*              0 - Sair                               * ");
		System.out.println("*                                                     * ");
		System.out.println("*******************************************************");
		System.out.println("Entre com a opção desejada:                           ");
		System.out.println("                                                      ");
		do {
			op = read.nextInt();

			switch (op) {
			case 1:
				System.out.println("Preencha o nome do Livro.\n\n");
				read.nextLine();
				nome = read.nextLine();
				pilha.add(nome);
				System.out.println("Livro inserido!");
				break;
			case 2:
				boolean f = pilha.isEmpty();
				if (f) {
					System.out.println("\n\nA pilha está vaiza!\n\n");
					break;
				} else {
					System.out.println("\n\nOs proximos são\n\n" + pilha);
					break;
				}

			case 3:
				f = pilha.isEmpty();
				if (f) {
					System.out.println("\n\nA pilha está vaiza!\n\n");
					break;
				} else {
					System.out.println("\n\nO Livro " + pilha.peek() + " foi retirado da pilha\n\n");
					pilha.pop();
					break;
				}
			case 0:
				System.out.println("\n\nSoftware finalizado.\n\n");
				break;
			default:
				System.out.println("\n\nOpção invalida\n\n");
				break;
			}
		} while (op != 0);

	}

}
