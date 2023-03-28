package ExPOO2;

public class Jogo {

	public String nome, dev, estilo;

	public Jogo(String nome, String dev, String estilo) {
		this.nome = nome;
		this.estilo = estilo;
		this.dev = dev;
	}

	@Override
	public String toString() {

		return "Jogo " + nome + " , criador  " + dev + ", estilo" + estilo;
	}

}
