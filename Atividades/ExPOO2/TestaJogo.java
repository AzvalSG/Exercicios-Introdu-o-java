package ExPOO2;

import java.util.Scanner;

public class TestaJogo {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Jogo TheWitcher = new Jogo("The Witcher 3", "CD Projekt Read", "RPG");
		Jogo CSGO = new Jogo("Counter-Strike: Global Offensive", "Valve", "FPS");
		Console Xbox = new Console("Xbox", "Microsoft", "Sem Nome");

		System.out.println(TheWitcher);
		System.out.println(CSGO);
		System.out.println(Xbox);
	}

}