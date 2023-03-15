package Atividadepratica2;

import java.util.Scanner;

public class mediacomretorno {

	public static void main(String[] args) {
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("Digite suas notas dos 4 bimestres: ");
			
			float nota1 = leia.nextFloat();
			float nota2 = leia.nextFloat();
			float nota3 = leia.nextFloat();
			float nota4 = leia.nextFloat();
			
			float media = (nota1+nota2+nota3+nota4)/4;
			
			if (media>=7 && media<=10) {

				System.out.printf("\nSua média final é: %.2f , você foi aprovado",media);
			}
			else {
				
				System.out.printf("\nSua média final é: %.2f ,você foi reprovado",media );
			}
		}
	}

}