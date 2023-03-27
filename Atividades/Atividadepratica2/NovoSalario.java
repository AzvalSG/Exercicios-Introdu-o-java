package Atividadepratica2;

import java.util.Scanner;

public class NovoSalario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva seu nome.");
		String nome = leia.next();
		System.out.println("Escolha o numero referente ao seu cargo.");
		System.out.println("\n\n1 = Gerente\n\n2 = Vendedor\n\n3 = Supervisor\n\n4 = Motorista\n\n5 = Estoquista\n\n6 = Técnico de TI");
		int num = leia.nextInt();
		
		System.out.println("Digite o valor do seu salario atual.");
		float salario = leia.nextFloat();
		double res1= salario + salario * 0.1;
		double res2= salario + salario * 0.07;
		double res3= salario + salario * 0.09;
		double res4= salario + salario * 0.06;
		double res5= salario + salario * 0.05;
		double res6= salario + salario * 0.08;
		
		switch(num) {
		
		case 1:
			System.out.printf("\n%S seu novo salario será de %.2f",nome,res1);
			break;
		case 2:
			System.out.printf("\n%S seu novo salario será de %.2f",nome,res2);
			break;
		case 3: 
			System.out.printf("\n%S seu novo salario será de %.2f",nome,res3);
			break;
		case 4:
			System.out.printf("\n%S seu novo salario será de %.2f",nome,res4);
			break;
		case 5:
			System.out.printf("\n%S seu novo salario será de %.2f",nome,res5);
			break;
		case 6:
			System.out.printf("\n%S seu novo salario será de %.2f",nome,res6);
			break;
		default:
			System.out.printf("\nOpção inválida!!!");
		
	}

		
	}

}
