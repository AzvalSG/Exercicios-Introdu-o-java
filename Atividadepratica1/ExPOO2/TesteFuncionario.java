package ExPOO2;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.println("Qual o nome e idade funcionario 1?");
		String nome1 = read.next();
		int idade1 = read.nextInt();

		System.out.println("Qual o nome e idade Funcionario 2?");
		String nome2 = read.next();
		int idade2 = read.nextInt();

		Funcionario funcionario1 = new Funcionario(nome1, idade1);
		System.out.println(funcionario1);
		Funcionario funcionario2 = new Funcionario(nome2, idade2);
		System.out.println(funcionario2);
	}

}
