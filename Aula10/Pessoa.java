package Aula10;

public class Pessoa {
	// atributos
	private String nome;
	private int idade;
	private String sexo;
	
	// m�todos
	public void fazerAniversario() {
		this.idade++;
	}
	
	public void info() {
		System.out.println("Nome: " +this.getNome() +", Idade: " +this.getIdade()+ ", Sexo: " +this.getSexo());
		System.out.println("=====================================");
	}

	// m�todos acessores e modificadores
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
