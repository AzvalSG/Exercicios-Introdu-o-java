package ExPOO2;

import java.util.Scanner;

public class TestaJogo {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Produto TheWitcher = new Jogo("The Witcher 3", "CD Projekt Red", "RPG","01", 25);
		Produto CSGO = new Jogo("Counter-Strike: Global Offensive", "Valve", "FPS","02", 79);
		Produto Xbox = new Console("Xbox", "Microsoft", "Sem Nome","01",300);

		System.out.println(TheWitcher);
		System.out.println(CSGO);
		System.out.println(Xbox);
	}

}