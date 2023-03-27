package Atividadepratica2;

import java.util.Scanner;

public class Somaamaisb {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int A,B,C,S;
		
		System.out.println("Digite 3 valores diferentes: ");
		
		A = leia.nextInt();
		B = leia.nextInt();
		C = leia.nextInt();
		
		S= A+B;
		
		if(S>C) {
			
			System.out.printf("%d + %d = %d > %d",A,B,S,C);
			System.out.printf("\n\nA soma de A + B é maior que C ");
		}
		else if (S<C) { 
			System.out.printf("%d + %d = %d < %d",A,B,S,C);
			System.out.println("\n\nA soma de A + B é menor que C ");
			}
		else {
			System.out.printf("%d + %d = %d = %d",A,B,S,C);
			System.out.println("\n\nA soma de A + B é igual a C ");		
			
		}
	}
}
