package Atividadepratica3;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String escolha = "s";
		int backend = 0, mfront = 0, mobilemais40=0, fullstackmenos30=0;

		while (escolha.equalsIgnoreCase("S")) {
			System.out.println("Digite sua idade.");
			int idade = read.nextInt();
			System.out.println("1 - Masculino\n2- Feminino\n3 - Outros\n Digite o numero referente a sua escolha: ");
			int sexo = read.nextInt();
			System.out.println(
					"1 - Backend\n2 - Frontend\n3 - Mobile\n4 - FullStack \nDigite o numero referente a sua escolha: ");
			int cate = read.nextInt();
			System.out.println("\nDeseja continuar? (S/N)");
			escolha = read.next();

			if (backend > 0) {
				backend++;
			} else if (sexo == 2 && cate == 2) {
				mfront++;
			} else if (sexo == 1 && cate == 3 && idade > 40) {
				mobilemais40++;
			} else if (idade < 30 && sexo == 2 && cate == 4) {
				fullstackmenos30++;
			}

		}
		System.out.printf("\n O numero de pessoas Backend é de: %d\nO numero de mulheres desenvolvedoras Frontend é de:%d\nOnumero de homens desenvolvedores mobile com mais de 40 anos é de: %d\nO número de mulheres desenvolvedoras Fullstack com menos de 30 anos é de: %d",backend,mfront,mobilemais40,fullstackmenos30);
	}
}
