package Atividadepratica2;

import java.util.Scanner;

public class trespalavras {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Escreva três palavras para caracterisar sua escolha.");
		String pa1 = leitor.next();
		String pa2 = leitor.next();
		String pa3 = leitor.next();
		
		if (pa1.equalsIgnoreCase("Vertebrado")) {
			
			if (pa2.equalsIgnoreCase("Ave")) {
				
				if (pa3.equalsIgnoreCase("Carnivoro")) {
					System.out.println("Aguia");
				}
				 else {
					System.out.println("Pomba");
				}
			}
			else {
				
				if (pa3.equalsIgnoreCase("Onivoro")) {
					System.out.println("Homem");
				}	
				 else {
					System.out.println("Vaca");	
				}	
			}
		}	
		 else {
			
			if (pa2.equalsIgnoreCase("Inseto")) {
				
				if (pa3.equalsIgnoreCase("Hematofago")) {
					System.out.println("Pulga");
				}
					else {
					System.out.println("Lagarta");	
				}
				
			}	
			 else {
				
				if (pa3.equalsIgnoreCase("Hematofago")) {
					System.out.println("Sanguessuga");
				}	
				 else {
					System.out.println("Minhoca");
				}			
			}
		}
	}
	
}