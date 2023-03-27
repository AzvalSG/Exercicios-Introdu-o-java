package Atividadepratica5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		boolean op = true;
		List<Integer> minhaLista = new ArrayList<Integer>();

		minhaLista.add(2);
		minhaLista.add(5);
		minhaLista.add(1);
		minhaLista.add(3);
		minhaLista.add(4);
		minhaLista.add(9);
		minhaLista.add(7);
		minhaLista.add(8);
		minhaLista.add(10);
		minhaLista.add(6);

		System.out.println("Escolha um numero");
		int num = read.nextInt();

		for (int i = 0; i < minhaLista.size(); i++) {
			if (num == minhaLista.get(i)) {
				System.out.printf("\nO numero %d foi encontrado", num);
				op = false;
			}
		}
		if (op) {
			System.out.println("\nNumero não encontrado");
		}

	}

}
