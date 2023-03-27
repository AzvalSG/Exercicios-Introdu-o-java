package ExPOO;

import java.util.Scanner;

public class TesteCLiente {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.println("Qual o nome e idade cliente1?");
		String nome1 = read.next();
		int idade1 = read.nextInt();

		System.out.println("Qual o nome e idade cliente2?");
		String nome2 = read.next();
		int idade2 = read.nextInt();

		Cliente cliente1 = new Cliente(nome1, idade1);
		System.out.println(cliente1);
		Cliente cliente2 = new Cliente(nome2, idade2);
		System.out.println(cliente2);
	}

}
