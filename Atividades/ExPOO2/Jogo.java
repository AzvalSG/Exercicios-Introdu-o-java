package ExPOO2;

public class Jogo extends Produto {

	public String nome, dev, estilo;

	public Jogo(String nome, String dev, String estilo,String id, int preco) {
		super(id,preco);
		this.nome = nome;
		this.estilo = estilo;
		this.dev = dev;
		
			
		
	}

	@Override
	public String toString() {

		return "Jogo " + nome + " , criador  " + dev + ", estilo" + estilo;
	}

}
