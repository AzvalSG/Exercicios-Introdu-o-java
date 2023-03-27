package Atividadepratica2;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite o numero desejado:");
		num = leia.nextInt();
		
	
		
		if(num > 0 && num % 2 == 0) {
			System.out.printf("O numero %d é par e positivo.",num);
		}
		else if(num < 0 && num % 2 == 0) {
			System.out.printf("O numero %d é par e negativo",num);
		}
		else if(num == 0) {
			System.out.printf("O numero é igual a 0.");
		}
		else if(num < 0 && num % 2 == 1) {
			System.out.printf("O numero %d é impar e negativo",num);
		}
		else if(num > 0 && num % 2 == 1) {
			System.out.printf("O numero %d é impar e positivo",num);
		}
	}
}