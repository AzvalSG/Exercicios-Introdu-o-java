package ExPOO;

public class Cliente {

	String nome;
	int idade;

	public Cliente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	@Override
	public String toString() {
		
		return"O nome é "+nome+" e a idade é "+idade;
	}
}
