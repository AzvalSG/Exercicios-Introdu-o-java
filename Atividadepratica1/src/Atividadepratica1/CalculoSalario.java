package Atividadepratica1;

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu salario bruto: ");
		float salario = leia.nextFloat();
		
		System.out.println("Digite o valor do seu adicional noturno: ");
		float noturno = leia.nextFloat();
		
		System.out.println("Digite o total de Horas Extras acumuladas: ");
		float horax = leia.nextFloat();
		
		System.out.println("Digite o total de descontos desse mês: ");
		float desconto = leia.nextFloat();
		
		float salarioliquido = salario + noturno + (horax*5) - desconto;
		
		System.out.printf("O valor liquido do seu salario é de R$%.2f",salarioliquido);
		
		

	}

}
