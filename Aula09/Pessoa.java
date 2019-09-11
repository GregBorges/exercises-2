package Aula09;

public class Pessoa {
	// atributos
	private String nome;
	private int idade;
	private String sexo;
	
	// métodos públicos
	public void fazerAniversario() {
		System.out.println(this.getNome() +" fez aniversário! Parabéns.");
		this.setIdade(this.getIdade() + 1);
	}
	
	// construtor
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	// métodos acessores e modificadores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
