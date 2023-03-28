package ExPOO2;

public class Console {

	public String nome, dev, ano;

	public Console(String nome, String dev, String ano) {
		this.nome = nome;
		this.ano = ano;
		this.dev = dev;
	}

	@Override
	public String toString() {

		return "Console " + nome + " , criador  " + dev + ", lançado" + ano;
	}
}
