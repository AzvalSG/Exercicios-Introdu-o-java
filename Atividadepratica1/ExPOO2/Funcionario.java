package ExPOO2;

public class Funcionario {

	String nome;
	int idade;

	public Funcionario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	@Override
	public String toString() {
		
		return"O nome é "+nome+" e a idade é "+idade;
	}
}
