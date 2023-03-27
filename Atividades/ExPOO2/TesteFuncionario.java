package ExPOO2;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.println("Preencha as informações a seguir: \nNome\nidade\nnumero\ncpf\ncargo");
		String nome1 = read.next();
		String idade1 = read.next();
		String numero1 = read.next();
		String cpf1 = read.next();
		String cargo1 = read.next();

		System.out.println("Preencha as informações a seguir: \nNome\nidade\nnumero\ncpf\ncargo");
		String nome2 = read.next();
		String idade2 = read.next();
		String numero2 = read.next();
		String cpf2 = read.next();
		String cargo2 = read.next();

		Funcionario funcionario1 = new Funcionario(nome1, cargo1, numero1, cpf1, idade1);
		System.out.println(funcionario1);
		Funcionario funcionario2 = new Funcionario(nome2, cargo2, numero2, cpf2, idade2);
		System.out.println(funcionario2);
	}

}
