package ExPOO2;

public class Produto {
	public String id;
	public int preco;

	public Produto(String id, int preco) {
		this.id = id;
		this.preco = preco;
	}

	@Override

	public String toString() {

		return "Produto " + id + " R$: " + preco;
	}

}
