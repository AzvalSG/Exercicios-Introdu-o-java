package Atividadepratica1;

import java.util.Scanner;

public class DiferencadoProduto {
	
	public static void main(String[] args) {

	Scanner leia = new Scanner(System.in);
	
	System.out.println("Escreva 4 numeros: ");
	float num1 = leia.nextFloat();
	float num2 = leia.nextFloat();
	float num3 = leia.nextFloat();
	float num4 = leia.nextFloat();
	
	float result = num1*num2 - num3*num4;
	
	System.out.printf("O resultado é : %.2f",result);

	}
}