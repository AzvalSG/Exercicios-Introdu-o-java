package ExPOO2;

public class Funcionario {

	public String nome, cargo, idade, numero, cpf;

	public Funcionario(String nome, String cargo, String numero, String cpf, String idade) {
		this.nome = nome;
		this.idade = idade;
		this.numero = numero;
		this.cpf = cpf;
		this.cargo = cargo;

	}

	@Override
	public String toString() {

		return "Ficha de funcionario: Nome : " + nome + "\nIdade:" + idade + " \nNumero: " + numero + "\nCargo: "
				+ cargo + "\nCpf: " + cpf;

	}
}