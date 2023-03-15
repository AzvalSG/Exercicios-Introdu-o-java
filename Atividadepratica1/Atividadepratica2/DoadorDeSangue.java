package Atividadepratica2;

import java.util.Scanner;

public class DoadorDeSangue {

	public static void main(String[] args) {
				
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Nome completo.");
		var nome = leia.nextLine();
		
		System.out.println("Idade");
		int idade = leia.nextInt();
		
		System.out.println("Já fez doação alguma vez? Use S para sim e N para não");
		var escolha = leia.next();
		
		if(idade <= 60 && idade>=18) {
			System.out.printf("%S está apto a doar sangue.",nome);
		}
		else if (idade > 60 && escolha == "S") {
			System.out.printf("%S está apto a doar sangue.",nome);
		}
		else {
			System.out.printf("%S não está apto a doar sangue.",nome);
		}
	}

}
