package Atividadepratica6;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Ex1 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();
		int op;
		
		System.out.println("*******************************************************");
		System.out.println("*                                                     *");
		System.out.println("*                  Fila de Clientes                   *");
		System.out.println("*                                                     *");
		System.out.println("*******************************************************");
		System.out.println("*                                                     * ");
		System.out.println("*              1 - Adicionar Cliente na Fila          *");
		System.out.println("*              2 - Listar todos os Clientes           * ");
		System.out.println("*              3 - Retirar Cliente da Fila            * ");
		System.out.println("*              0 - Sair                               * ");
		System.out.println("*                                                     * ");
		System.out.println("*******************************************************");
		System.out.println("Entre com a opção desejada:                           ");
		System.out.println("                                                      ");
		do {
		op = read.nextInt();
		
			switch (op) {
			case 1:
				System.out.println("Preencha o nome do Cliente.\n\n");
				String nome = read.next();
				fila.add(nome);
				System.out.println("Cliente adicionado!");
				break;
			case 2:
				boolean f = fila.isEmpty();
				if (f) {
					System.out.println("\n\nA fila está vaiza!\n\n");
					break;
				} else {
					System.out.println("\n\nOs proximos são\n\n" + fila);
					break;
				}
				
			case 3:
				System.out.println("\n\nO Cliente foi chamado\n\n");
				fila.remove();
				break;
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
