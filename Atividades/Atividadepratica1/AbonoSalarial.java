package Atividadepratica1;

import java.util.Scanner;

public class AbonoSalarial {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Salario: ");
		
		float salario = leia.nextFloat();
		
		System.out.println("Digite o Abono");
		
		float abono = leia.nextFloat();
		
		float novosalario =salario+abono;
		
		System.out.println("\nNovo salario = "+novosalario);
				
			

	}

}
