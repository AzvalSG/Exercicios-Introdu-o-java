package Atividadepratica2;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float saldo = 1000,deposito,saque;
		System.out.println("1 para Saldo\n2 para Deposito\n3 para Saque");
		int op = leia.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("Saldo de R$"+saldo);
			break;
		case 2:
			System.out.printf("Seu saldo é de R$%.2f\nDigite o valor a ser depositado:",saldo);
			deposito = leia.nextFloat();
			saldo = saldo+deposito;
			System.out.printf("Seu novo salto é de R$ %.2f",saldo);
			break;
		case 3:
			System.out.println("Seu saldo atual é de R$"+saldo+"\nQual o valor a ser sacado?");
			saque = leia.nextFloat();
			if(saque<=saldo) {
				saldo = saldo-saque;
				System.out.printf("Seu novo saldo é de %.2f",saldo);
			}else {
				System.out.printf("Saldo insuficiente.");
				
				}
			
			break;
			default:
				System.out.println("Opção invalida.");
			
		}

	}

}
